package br.com.alura.gerenciador.servlet;

import java.util.Date;

public class Empresa {

	private int id;
	private String nome;
	private Date dataAbertura;
	
	public Empresa() {
		
	}
	
	public Empresa(int id, String nome) {
		if(nome != null || nome != "") {			
			this.id = id;
			this.nome = nome;
		}
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Date getDataAbertura() {
		return this.dataAbertura;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
}
