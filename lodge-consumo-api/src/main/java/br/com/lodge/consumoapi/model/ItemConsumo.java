package br.com.lodge.consumoapi.model;

import br.com.lodge.consumoapi.enums.StatusItemConsumoEnum;
import br.com.lodge.consumoapi.enums.TipoItemConsumoEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemConsumo {
	
	private Long codigo;
	private String descricao;
	private Double preco;
	private TipoItemConsumoEnum tipo;
	private StatusItemConsumoEnum status;

}
