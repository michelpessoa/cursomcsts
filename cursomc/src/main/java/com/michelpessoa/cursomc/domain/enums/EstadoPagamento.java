package com.michelpessoa.cursomc.domain.enums;

public enum EstadoPagamento {
	
	PENDENTE(1, "Pagamento pendente"),
	QUITADO(2, "Pagamento quitado"),
	CANCELADO(3, "Pagamento cancelado");
	
	private int cod;
	private String descricao;
	
	private EstadoPagamento(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static EstadoPagamento toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		
		for (EstadoPagamento x : EstadoPagamento.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido" + cod); 
	}
	
 
}
