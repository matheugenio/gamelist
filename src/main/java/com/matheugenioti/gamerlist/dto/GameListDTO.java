package com.matheugenioti.gamerlist.dto;

import com.matheugenioti.gamerlist.entities.GameList;

public class GameListDTO {
	
	private long id;
	private String name;
	
	public GameListDTO() {
		
	}
	
	public GameListDTO(GameList entity) {
		id = entity.getId();
		name = entity.getNome();
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
