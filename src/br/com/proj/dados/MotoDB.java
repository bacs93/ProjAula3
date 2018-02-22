package br.com.proj.dados;

import br.com.proj.entidade.Moto;

public class MotoDB {
	
	public MotoDB() {
		//ABERTURA DA CONEXAO COM A BASE DE DADOS
	}
	
	public boolean insert (Moto moto) {
		
		System.out.println("Id: "+ moto.getId());
		System.out.println("Descricao: " +moto.getDescricao());
		System.out.println("Ano: " +moto.getAno());
		
		//IMPLEMENTAÇÃO DO INSERT NA BASE DE DADOS
		return true;
	}

}
