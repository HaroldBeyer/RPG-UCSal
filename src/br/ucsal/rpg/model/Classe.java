package br.ucsal.rpg.model;

public class Classe {
	
	private Integer id;
	private String nome;
	private String buffs;
	private String atributos;
	
	public Classe() {
		super();
	}

	public Classe(Integer id, String nome, String buffs, String atributos) {
		super();
		this.id = id;
		this.nome = nome;
		this.buffs = buffs;
		this.atributos = atributos;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getBuffs() {
		return buffs;
	}
	
	public void setBuffs(String buffs) {
		this.buffs = buffs;
	}
	
	public String getAtributos() {
		return atributos;
	}
	
	public void setAtributos(String atributos) {
		this.atributos = atributos;
	}
	
}
