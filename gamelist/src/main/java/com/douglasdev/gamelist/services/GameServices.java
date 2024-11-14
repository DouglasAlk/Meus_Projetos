package com.douglasdev.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.douglasdev.gamelist.dto.GameMinDTO;
import com.douglasdev.gamelist.entites.Game;
import com.douglasdev.gamelist.repositores.GameRepository;

@Service
public class GameServices {

	
	
	@Autowired
	private GameRepository gameRepository;
	
	
	public List<GameMinDTO> findAll(){
		
	   List<Game> result =  gameRepository.findAll();
	   return result.stream().map(x -> new GameMinDTO(x)).toList();
	
	
	}
}
