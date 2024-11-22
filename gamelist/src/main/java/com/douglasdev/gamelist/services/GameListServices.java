package com.douglasdev.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.douglasdev.gamelist.dto.GameListDTO;
import com.douglasdev.gamelist.entites.GameList;
import com.douglasdev.gamelist.projections.GameMinProjection;
import com.douglasdev.gamelist.repositores.GameListRepository;
import com.douglasdev.gamelist.repositores.GameRepository;


@Service
public class GameListServices {

	@Autowired
	private GameListRepository gameListRepository;

	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {

		List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
	}
	
	@Transactional 
	public void mov(Long listId, int sourceIndex, int destinationIndex) {
		
		List<GameMinProjection> list = gameRepository.searchByList(listId);
		
		GameMinProjection obj = list.remove(sourceIndex);
		list.add(destinationIndex, obj);
		
		int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
		int max = sourceIndex < destinationIndex ?destinationIndex : sourceIndex;
		
		for(int i = min; i <= max; i++) {
			gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
		}
		
			}
	
}
