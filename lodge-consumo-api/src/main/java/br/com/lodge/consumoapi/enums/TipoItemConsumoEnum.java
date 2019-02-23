package br.com.lodge.consumoapi.enums;

import java.util.Arrays;
import java.util.List;

public enum TipoItemConsumoEnum {

	PRODUTO("PRDT", "Produto"),
	SERVICO("SERV", "Serviço");
	
	private final String codigo;
	private final String descricao;
	
	TipoItemConsumoEnum(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public static TipoItemConsumoEnum get(String codigo) {
		List<TipoItemConsumoEnum> values = Arrays.asList(TipoItemConsumoEnum.values()) ;
		for (TipoItemConsumoEnum tipoEnum : values) {
			if (tipoEnum.codigo.equals(codigo)) {
				return tipoEnum;
			}
		}
		return null;
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
	public String getDescricao() {
		return this.descricao;
	}	
}
