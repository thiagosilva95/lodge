package br.com.lodge.consumoapi.enums;

import java.util.Arrays;
import java.util.List;

public enum StatusItemConsumoEnum {
	
	INATIVO(0, "Inativo"),
	ATIVO(1, "Ativo");
	
	private final Integer codigo;
	private final String descricao;
	
	StatusItemConsumoEnum(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public static StatusItemConsumoEnum get(String codigo) {
		List<StatusItemConsumoEnum> values = Arrays.asList(StatusItemConsumoEnum.values()) ;
		for (StatusItemConsumoEnum statusEnum : values) {
			if (statusEnum.codigo.equals(codigo)) {
				return statusEnum;
			}
		}
		return null;
	}
	
	public Integer getCodigo() {
		return this.codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}	

}
