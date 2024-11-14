package com.douglasdev.gamelist.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglasdev.gamelist.entites.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
