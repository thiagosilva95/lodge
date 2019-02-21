package br.com.lodge.consumoapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lodge.consumoapi.enums.StatusItemConsumoEnum;
import br.com.lodge.consumoapi.enums.TipoItemConsumoEnum;
import br.com.lodge.consumoapi.model.ItemConsumo;

@Repository
public interface ItemConsumoRepository extends JpaRepository<ItemConsumo, Long> {

	List<ItemConsumo> listar(String descricao, TipoItemConsumoEnum tipo, StatusItemConsumoEnum status);

}
