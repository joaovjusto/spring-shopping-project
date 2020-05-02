package up.edu.br.shoppingup.exemplo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import up.edu.br.shoppingup.exemplo.entity.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Integer> {

	@Query(value = "SELECT v FROM Veiculo v where v.marca like %:marca%", nativeQuery = false)
	public List<Veiculo> findByMarca(@Param("marca") String marca);

}


