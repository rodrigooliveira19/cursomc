package com.nelioalves.cursomc.cursomc.domain.enums;

public enum TipoCliente {
	
	PESSOAFISICA(1,"Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Jurídica"); 
	
	private int cod; 
	private String descricao;
	
	private TipoCliente(int id, String nome) {
		this.cod = id;
		this.descricao = nome;
	} 
	
	
	public int getCod() {
		return cod; 
	}
	
	public String getNome() {
		return descricao; 
	}
	
	public static TipoCliente toEnum(Integer cod) {
		
		if(cod == null) {
			return null; 
		}
		
		for (TipoCliente tipoEnum : TipoCliente.values()) {
			if (cod.equals(tipoEnum.getCod())) {
				return tipoEnum; 
			}
		}
		
		throw new IllegalArgumentException("Id inválido: "+cod); 
	}
	

}
