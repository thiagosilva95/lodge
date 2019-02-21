package br.com.lodge.consumoapi.converter;

import java.util.List;
import java.util.stream.Collectors;

import br.com.lodge.consumoapi.dto.ItemConsumoCreateDTO;
import br.com.lodge.consumoapi.dto.ItemConsumoDTO;
import br.com.lodge.consumoapi.model.ItemConsumo;

public class ItemConsumoConverter {

	public static ItemConsumo fromDTO(ItemConsumoCreateDTO itemConsumoCreate) {
		ItemConsumo model = new ItemConsumo();
		
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
