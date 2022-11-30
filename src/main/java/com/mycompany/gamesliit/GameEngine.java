/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamesliit;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class GameEngine {
    String userPlayer = null;
    
    public GameEngine(String Player){
                userPlayer= Player;
    }
    
    
    int counter=0;
    int score=0;
    GameServer theGames = new GameServer(); 
    Game current = null; 
    
    
    public URL nextGame() {		
			try {
				current = theGames.getRandomGame();
				return current.getLocation(); 
			} catch (MalformedURLException e) {
				System.out.println("Something went wrong when trying to retrieve game "+counter+"!"); 
				e.printStackTrace();
				return null; 
			} 
    }
    public boolean checkSolution(URL game, int i) {
		if (i == current.getSolution()) {
			score++; 
			return true;
		} else {
			return false;
		}
	}
    
    public int getScore(){
        
         try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gameuser", "root", "");
                        Statement stmt = con.createStatement();


            String query = "UPDATE signin SET score = " +score+ " WHERE id=4";
             ResultSet rs = stmt.executeQuery(query);
             
             System.out.println("updated the Score");
        } catch (Exception e) {
        }
        return score;
    }
            
}
