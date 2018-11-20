package br.ucsal.rpg.dao;

import java.sql.Connection;

import br.ucsal.rpg.util.ConnectionFactory;

/*
	private Integer id;
	private String nome;
	private Integer dano;
	private Classe classe; 
*/

public class ItemDao {

	private Connection connection;

	public ItemDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
}
