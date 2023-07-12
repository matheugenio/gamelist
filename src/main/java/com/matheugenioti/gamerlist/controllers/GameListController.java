package com.matheugenioti.gamerlist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheugenioti.gamerlist.dto.GameDTO;
import com.matheugenioti.gamerlist.dto.GameListDTO;
import com.matheugenioti.gamerlist.dto.GameMinDTO;
import com.matheugenioti.gamerlist.services.GameListService;
import com.matheugenioti.gamerlist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	

	
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
		
	}
	
	

}
