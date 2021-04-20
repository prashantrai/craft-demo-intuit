package com.intuit.demo.service;

import java.util.List;

import com.intuit.demo.model.Player;

public interface PlayerService {

	List<Player> getAllPlayers();
	Player getPlayerById(Long playerId) throws Exception;
	void updateWeight(Long playerId) throws Exception;
}
