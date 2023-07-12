package com.matheugenioti.gamerlist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheugenioti.gamerlist.dto.GameListDTO;
import com.matheugenioti.gamerlist.entities.GameList;
import com.matheugenioti.gamerlist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	
	public List<GameListDTO>findAll(){
		List<GameList> result = gameListRepository.findAll();
		List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
		return dto;
		
	}

}
