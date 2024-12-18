package com.douglasdev.gamelist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.douglasdev.gamelist.dto.GameDTO;
import com.douglasdev.gamelist.dto.GameListDTO;
import com.douglasdev.gamelist.dto.GameMinDTO;
import com.douglasdev.gamelist.dto.ReplacementDTO;
import com.douglasdev.gamelist.entites.Game;
import com.douglasdev.gamelist.services.GameListServices;
import com.douglasdev.gamelist.services.GameServices;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	
	@Autowired
	private GameListServices gameListService;
	
	@Autowired
	private GameServices gameService;
	
	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result= gameListService.findAll();
	return result;
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable long listId) {
		List<GameMinDTO> result= gameService.findByList(listId);
	return result;
	}
	
	@PostMapping(value = "/{listId}/replacement")
	public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
		gameListService.mov(listId, body.getSourceIndex(), body.getDestinationIndex());
	}
	}


