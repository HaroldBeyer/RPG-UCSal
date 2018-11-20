package br.ucsal.rpg.dao;

import java.sql.Connection;

import br.ucsal.rpg.util.ConnectionFactory;

/*
	private Integer id;
	private String texto;
	private Evento evento;
*/

public class HistoriaDao {

	private Connection connection;

	public HistoriaDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	
}
