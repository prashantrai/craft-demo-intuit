package com.intuit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intuit.demo.model.Player;

/**
 * Repository to access the player data from DB 
 * 
 * @author prashant rai
 */

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}