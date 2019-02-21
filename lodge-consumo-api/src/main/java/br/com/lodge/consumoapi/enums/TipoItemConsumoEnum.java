package br.com.lodge.consumoapi.enums;

public enum TipoItemConsumoEnum {

	PRODUTO("PRDT", "Produto"),
	SERVICO("SERV", "Serviço");
	
	private final String codigo;
	private final String descricao;
	
	TipoItemConsumoEnum(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}	
}
