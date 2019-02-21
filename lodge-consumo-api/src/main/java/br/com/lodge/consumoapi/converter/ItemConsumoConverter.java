package br.com.lodge.consumoapi.converter;

import java.util.List;
import java.util.stream.Collectors;

import br.com.lodge.consumoapi.dto.ItemConsumoCreateDTO;
import br.com.lodge.consumoapi.dto.ItemConsumoDTO;
import br.com.lodge.consumoapi.enums.StatusItemConsumoEnum;
import br.com.lodge.consumoapi.enums.TipoItemConsumoEnum;
import br.com.lodge.consumoapi.model.ItemConsumo;

public class ItemConsumoConverter {

	public static ItemConsumo fromCreateDTO(ItemConsumoCreateDTO dto) {
		ItemConsumo model = new ItemConsumo();
		model.setDescricao(dto.getDescricao());
		model.setTipo(TipoItemConsumoEnum.valueOf(dto.getTipo()));
		model.setStatus(StatusItemConsumoEnum.INATIVO);
		return model;
	}
	
	public static ItemConsumoDTO toDTO(ItemConsumo itemConsumoSalvo) {
		ItemConsumoDTO dto = new ItemConsumoDTO();
		return dto;
	}
	
	public static List<ItemConsumoDTO> toListDTO(List<ItemConsumo> list) {
		return list.stream().map(model -> {
			return toDTO(model);
		}).collect(Collectors.toList());
	}
}
