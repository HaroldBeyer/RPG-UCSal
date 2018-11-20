package br.ucsal.rpg.dao;

import java.sql.Connection;

import br.ucsal.rpg.util.ConnectionFactory;

/*
	private Integer id;
	private String nome;
	private String buffs;
	private String atributos;
*/

public class ClasseDao {

	private Connection connection;

	public ClasseDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
}
