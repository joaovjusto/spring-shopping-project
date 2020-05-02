package up.edu.br.shoppingup.fornecedores.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import up.edu.br.shoppingup.fornecedores.entity.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Integer> 
{
	@Query (value = "SELECT f FROM Fornecedor f where f.nome like %:nome%", nativeQuery = false)
	List<Fornecedor> findByNome (@Param ("nome") String nome);
}
