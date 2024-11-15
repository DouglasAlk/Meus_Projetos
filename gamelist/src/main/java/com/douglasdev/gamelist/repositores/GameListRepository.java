package com.douglasdev.gamelist.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglasdev.gamelist.entites.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
