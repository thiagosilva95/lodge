package br.com.lodge.consumoapi.enums;

public enum StatusItemConsumoEnum {
	
	INATIVO(0, "Inativo"),
	ATIVO(1, "Ativo");
	
	private final Integer codigo;
	private final String descricao;
	
	StatusItemConsumoEnum(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public Integer getCodigo() {
		return this.codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}	

}
