package br.ucsal.rpg.dao;

import java.sql.Connection;

import br.ucsal.rpg.util.ConnectionFactory;

/*
 	private Integer id;
	private String nome;
	private Status status;
	private List<Item> itens;
 */

public class NPCDao {

	private Connection connection;

	public NPCDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	
}
