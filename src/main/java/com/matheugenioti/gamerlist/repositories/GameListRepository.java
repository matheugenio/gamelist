package com.matheugenioti.gamerlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheugenioti.gamerlist.entities.Game;
import com.matheugenioti.gamerlist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
