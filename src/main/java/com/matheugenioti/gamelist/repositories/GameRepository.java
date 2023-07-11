package com.matheugenioti.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheugenioti.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
