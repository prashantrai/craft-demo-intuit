package com.intuit.demo.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.intuit.demo.model.Player;
import com.intuit.demo.repository.PlayerRepository;

@ExtendWith(SpringExtension.class)
public class PlayerServiceImplTest {

	@InjectMocks
	private PlayerServiceImpl playerServiceImpl;
	
	@Mock
	private PlayerRepository playerRepository;
	
	@BeforeEach
	public void setup() {
		
	}
	
	/*
	 public List<Player> getAllPlayers() {
		List<Player> players = new ArrayList<>();
		playerRepository.findAll().forEach(player -> players.add(player));
		return players;
	} 
	 */
	
	@Test
	public void getAllPlayers_whenRequested() {
		Player player = getDummyPlayer();
		List<Player> players = new ArrayList<>();
		
		Mockito.when(playerRepository.findAll()).thenReturn(players);
		
		List<Player> foundPlayers = playerServiceImpl.getAllPlayers();
		
		assertThat(foundPlayers.size()).isEqualTo(1);
		
		
	}
	
	
	private Player getDummyPlayer() {
		
		Player player = new Player();
		player.setPlayerID(1L);
		player.setNameFirst("Austin");
		player.setNameLast("Baker");
		
		return player;
	}
}
