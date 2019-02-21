package br.com.lodge.consumoapi.model;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import br.com.lodge.consumoapi.enums.StatusItemConsumoEnum;
import br.com.lodge.consumoapi.enums.TipoItemConsumoEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ItemConsumo {
	
	@Id
	private Long codigo;
	private String descricao;
	private Double preco;
	@Enumerated
	private TipoItemConsumoEnum tipo;
	
	@Enumerated
	private StatusItemConsumoEnum status;

}
