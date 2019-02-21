package br.com.lodge.consumoapi.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lodge.consumoapi.controller.ItemConsumoController;
import br.com.lodge.consumoapi.converter.ItemConsumoConverter;
import br.com.lodge.consumoapi.dto.ItemConsumoCreateDTO;
import br.com.lodge.consumoapi.dto.ItemConsumoDTO;
import br.com.lodge.consumoapi.enums.StatusItemConsumoEnum;
import br.com.lodge.consumoapi.enums.TipoItemConsumoEnum;
import br.com.lodge.consumoapi.model.ItemConsumo;
import br.com.lodge.consumoapi.repository.ItemConsumoRepository;
import br.com.lodge.consumoapi.util.Util;

@Service
public class ItemConsumoService {

	private static final Logger LOGGER = LoggerFactory.getLogger(ItemConsumoController.class);
	
	@Autowired
	private ItemConsumoRepository itemConsumoRepository;
	
	public ItemConsumoDTO criar(ItemConsumoCreateDTO itemConsumoCreate) {
		LOGGER.info("INSERINDO NOVO ITEM DE CONSUMO: %s".format(Util.convertObjectAsJsonString(itemConsumoCreate)));
		try {
			ItemConsumo itemConsumoToSave = ItemConsumoConverter.fromDTO(itemConsumoCreate);
			ItemConsumo itemConsumoSalvo = this.itemConsumoRepository.save(itemConsumoToSave);
			return ItemConsumoConverter.toDTO(itemConsumoSalvo);
		} catch (Exception e) {
			LOGGER.error("ERRO AO INSERIR ITEM DE CONSUMO");
			e.printStackTrace();
		}
		
		return null;
	}

	public List<ItemConsumo> listar(String descricao, TipoItemConsumoEnum tipo, StatusItemConsumoEnum status) {
		return this.itemConsumoRepository.listar(descricao, tipo, status);
	}
	
	public Optional<ItemConsumo> buscarPorCodigo(Long codigo) {
		return this.itemConsumoRepository.findById(codigo);
	}
	
	
}
