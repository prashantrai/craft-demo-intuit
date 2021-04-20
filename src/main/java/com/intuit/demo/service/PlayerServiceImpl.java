package com.intuit.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intuit.demo.controller.PlayerController;
import com.intuit.demo.model.Player;
import com.intuit.demo.repository.PlayerRepository;

/**
 * Service layer for Player APIs
 * 
 * 
 * @author prashant rai
 */

@Service
public class PlayerServiceImpl implements PlayerService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PlayerController.class);
	
	@Autowired
    private PlayerRepository playerRepository;
	
	
	/**
	 * Returns List of players
	 */
	@Override
	public List<Player> getAllPlayers() {
		List<Player> players = new ArrayList<>();
		playerRepository.findAll().forEach(player -> players.add(player));
		return players;
	}
	
	/**
	 * Return a player with matching id
	 */
	@Override
	public Player getPlayerById(Long playerId) throws Exception {
		Optional<Player> player = playerRepository.findById(playerId);
		if(!player.isPresent()) {
			//return null;
			throw new Exception("Data not found: player does not exist with id : " + playerId);
		}
		return player.get();
	}

	@Override
	public void updateWeight(Long playerId) throws Exception {
		Player player = getPlayerById(playerId);
		int weight = player.getWeight() + 1;
		player.setWeight(weight);
		
		playerRepository.save(player);
	}

}
