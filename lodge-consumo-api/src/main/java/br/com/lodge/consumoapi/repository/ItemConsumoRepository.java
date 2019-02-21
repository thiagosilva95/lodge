package br.com.lodge.consumoapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.lodge.consumoapi.enums.StatusItemConsumoEnum;
import br.com.lodge.consumoapi.enums.TipoItemConsumoEnum;
import br.com.lodge.consumoapi.model.ItemConsumo;

@Repository
public interface ItemConsumoRepository extends JpaRepository<ItemConsumo, Long> {

	@Query("select ic from ItemConsumo ic "
			+ "where (?1 is null or ic.descricao = ?1) "
			+ "and (?2 is null or ic.tipo = ?2) "
			+ "and (?3 is null or ic.status = ?3)")
	List<ItemConsumo> listar(String descricao, TipoItemConsumoEnum tipo, StatusItemConsumoEnum status);

}
