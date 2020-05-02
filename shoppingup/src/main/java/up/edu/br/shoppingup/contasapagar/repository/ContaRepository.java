package up.edu.br.shoppingup.contasapagar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import up.edu.br.shoppingup.contasapagar.entity.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Integer>{

	
}
