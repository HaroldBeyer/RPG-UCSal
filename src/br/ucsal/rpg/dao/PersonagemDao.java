package br.ucsal.rpg.dao;

import java.sql.Connection;

import br.ucsal.rpg.util.ConnectionFactory;

public class PersonagemDao {

	private Connection connection;

	public PersonagemDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
}
