package up.edu.br.shoppingup.eventos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import up.edu.br.shoppingup.eventos.entity.Evento;

public interface EventoRepository extends JpaRepository<Evento, Integer> 
{
	@Query (value = "SELECT e FROM Evento e where e.nome like %:nome%", nativeQuery = false)
	List<Evento> findByNome (@Param ("nome") String nome);
}
