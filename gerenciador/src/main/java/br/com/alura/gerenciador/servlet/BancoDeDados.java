package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {

	//Simular um banco de dados
	
	private static List<Empresa> empresas = new ArrayList<Empresa>();
	
	public List<Empresa> getEmpresas(){
		return BancoDeDados.empresas;
	}
	
	public void adiciona(Empresa empresa) {
		if(empresa != null) {
			empresas.add(empresa);			
		}
	}
	
}
