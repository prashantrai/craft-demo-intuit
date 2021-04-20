package com.intuit.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intuit.demo.model.Player;
import com.intuit.demo.service.PlayerService;


/**
 * This controller has 2 services
 * 
 * GET /api/players - returns the list of all players
 * GET /api/players/{playerID} - returns a single player by it's ID
 * 
 * @author prashant rai 
 *
 */

@RestController
@RequestMapping("api/players")
public class PlayerController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PlayerController.class);
	
	@Autowired
	private PlayerService playerService;
	
	/**
	 * List all players
	 * 
	 * @return
	 */
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<List<Player>> getAllPlayers() {
		LOGGER.info("getAllPlayers called");
		List<Player> teams = playerService.getAllPlayers();
		return new ResponseEntity<List<Player>>(teams, HttpStatus.OK);
	}
	
	/* TODO : verify this
	 *  List all players (with team) - with Pagination
	 *  
	 *  http://localhost:8080/players/pageable?page=0&size=3&sort=name
	 */
	/*@GetMapping(value="pageable", produces = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<Page<Player>> getAllPlayersPageable(Pageable pageable) {
		LOGGER.info("getAllPlayers called");
		Page<Player> teams = playerService.getAllPlayersPageable(pageable);
		return new ResponseEntity<Page<Player>>(teams, HttpStatus.OK);
	}*/

	
	/**
	 * Get player for given id
	 * @param id
	 * @return
	 * @throws Exception 
	 */
	@GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<Player> getPlayerById(@PathVariable("id") long id) throws Exception {
		LOGGER.info("getPlayerById called");
		Player player = null;
		
		try {
			player = playerService.getPlayerById(id);
		} catch (Exception e) {
			//throw new APIException(e.getMessage());
			throw new Exception(e.getMessage());
		}
		return new ResponseEntity<Player>(player, HttpStatus.OK);
	}
	
	//PUT /api/players/{playerID}/weight - increments a player's weight by 1
	
	@PutMapping(value = "{id}/weight")
	private ResponseEntity<Player> updateWeight(@PathVariable("id") long id) throws Exception {
		
		try {
			playerService.updateWeight(id);
		}catch (Exception e) {
			//throw new APIException(e.getMessage());
			throw new Exception(e.getMessage());
		}
		
		return new ResponseEntity<>(HttpStatus.OK);
	} 
	

}