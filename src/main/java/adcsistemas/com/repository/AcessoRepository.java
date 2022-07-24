package adcsistemas.com.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import adcsistemas.com.model.Acesso;

@Repository
@Transactional
public interface AcessoRepository extends JpaRepository<Acesso, Long>{

	@Query(value = "select a from Acesso a where upper(trim(a.descricao)) like %?1%")
	List<Acesso> pesquisaAcessoDesc(String descricao);
}