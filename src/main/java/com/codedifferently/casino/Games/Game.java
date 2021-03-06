package com.codedifferently.casino.Games;

import com.codedifferently.casino.Player;

import java.util.ArrayList;

public interface Game 
{

  public String gameName = "Game";
  ArrayList<Player> players = new ArrayList<Player>();

  //returning the name of the Game.Game
  public String getGameName();
  //Checking to see if the game is won
  public boolean isGameWon(); 

  //not sure what this does
  public void play(); 

  //returns a list of the players
  public ArrayList<Player> getPlayers(); 

  //setting the GameName to a new game
  public String changeGameName(String name);


}