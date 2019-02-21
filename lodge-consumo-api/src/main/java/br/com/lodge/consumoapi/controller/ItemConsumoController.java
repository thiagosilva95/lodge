package br.com.lodge.consumoapi.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lodge.consumoapi.converter.ItemConsumoConverter;
import br.com.lodge.consumoapi.dto.ItemConsumoCreateDTO;
import br.com.lodge.consumoapi.dto.ItemConsumoDTO;
import br.com.lodge.consumoapi.model.ItemConsumo;
import br.com.lodge.consumoapi.service.ItemConsumoService;

@RestController
@RequestMapping("/api/item-consumo")
public class ItemConsumoController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ItemConsumoController.class);	
	
	@Autowired
	private ItemConsumoService itemConsumoService;
	
	@PostMapping
	public ResponseEntity<ItemConsumoDTO> criar(@Valid @RequestBody ItemConsumoCreateDTO itemConsumoCreate) {
		ItemConsumoDTO lancamentoSalvo = itemConsumoService.criar(itemConsumoCreate);
		return ResponseEntity.status(HttpStatus.CREATED).body(lancamentoSalvo);
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<ItemConsumoDTO> buscarPeloCodigo(@PathVariable Long codigo) {
		Optional<ItemConsumo> itemConumoOptional = itemConsumoService.buscarPorCodigo(codigo);
		
		return itemConumoOptional.isPresent() ? 
				ResponseEntity.ok(ItemConsumoConverter.toDTO(itemConumoOptional.get())) : 
				ResponseEntity.notFound().build();
	}
}
