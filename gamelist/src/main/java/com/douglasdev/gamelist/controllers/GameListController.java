package com.douglasdev.gamelist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.douglasdev.gamelist.dto.GameDTO;
import com.douglasdev.gamelist.dto.GameListDTO;
import com.douglasdev.gamelist.dto.GameMinDTO;
import com.douglasdev.gamelist.entites.Game;
import com.douglasdev.gamelist.services.GameListServices;
import com.douglasdev.gamelist.services.GameServices;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	
	@Autowired
	private GameListServices gameListService;
	
	
	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result= gameListService.findAll();
	return result;
	}
}

