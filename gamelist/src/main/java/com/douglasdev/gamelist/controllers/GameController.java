package com.douglasdev.gamelist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.douglasdev.gamelist.dto.GameDTO;
import com.douglasdev.gamelist.dto.GameMinDTO;
import com.douglasdev.gamelist.entites.Game;
import com.douglasdev.gamelist.services.GameServices;

@RestController
@RequestMapping(value = "/games")
public class GameController {

	
	@Autowired
	private GameServices gameService;
	
	@GetMapping(value = "/{id}")
	public GameDTO findbyID(@PathVariable Long id) {
		GameDTO result= gameService.findById(id);
	return result;
	}
	
	@GetMapping
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result= gameService.findAll();
	return result;
	}
}

