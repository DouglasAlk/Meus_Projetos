package com.douglasdev.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.douglasdev.gamelist.dto.GameListDTO;
import com.douglasdev.gamelist.entites.GameList;
import com.douglasdev.gamelist.repositores.GameListRepository;


@Service
public class GameListServices {

	@Autowired
	private GameListRepository gameListRepository;

	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {

		List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();

	}
}
