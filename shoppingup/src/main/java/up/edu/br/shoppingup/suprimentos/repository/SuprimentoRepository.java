package up.edu.br.shoppingup.suprimentos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import up.edu.br.shoppingup.suprimentos.entity.Suprimento;

public interface SuprimentoRepository extends JpaRepository<Suprimento, Integer> {

	@Query(value = "SELECT s FROM Suprimento s where s.departamento like %:departamento%", nativeQuery = false)
	public List<Suprimento> findByDepartamento(@Param("departamento") String departamento);

	
}
