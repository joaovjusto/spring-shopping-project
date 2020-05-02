package up.edu.br.shoppingup.contasareceber.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import up.edu.br.shoppingup.contasareceber.entity.Boleto;

public interface BoletoRepository extends JpaRepository<Boleto, Integer> {



}


