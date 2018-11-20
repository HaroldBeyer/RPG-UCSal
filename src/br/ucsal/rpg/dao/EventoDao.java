package br.ucsal.rpg.dao;

import java.sql.Connection;

import br.ucsal.rpg.util.ConnectionFactory;

/*
	private Integer id;
	private String nome;
	private NPC npc; 
*/

public class EventoDao {

	private Connection connection;

	public EventoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	
}
