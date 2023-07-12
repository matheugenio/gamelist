package com.matheugenioti.gamerlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheugenioti.gamerlist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
