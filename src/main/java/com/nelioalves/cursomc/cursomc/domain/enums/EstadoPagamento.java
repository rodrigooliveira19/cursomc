package com.nelioalves.cursomc.cursomc.domain.enums;

public enum EstadoPagamento {
	
	PENDENTE(1,"Pendente"), 
	QUITADO(2, "Quitado"), 
	CANCELADO(3, "Cancelado"); 
	
	private int cod; 
	private String descricao;
	
	private EstadoPagamento(int id, String nome) {
		this.cod = id;
		this.descricao = nome;
	} 
	
	
	public int getCod() {
		return cod; 
	}
	
	public String getNome() {
		return descricao; 
	}
	
	public static EstadoPagamento toEnum(Integer cod) {
		
		if(cod == null) {
			return null; 
		}
		
		for (EstadoPagamento tipoEnum : EstadoPagamento.values()) {
			if (cod.equals(tipoEnum.getCod())) {
				return tipoEnum; 
			}
		}
		
		throw new IllegalArgumentException("Id inválido: "+cod); 
	}

}
