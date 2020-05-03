package up.edu.br.shoppingup.eventos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import up.edu.br.shoppingup.eventos.entity.Evento;
import up.edu.br.shoppingup.eventos.service.EventoService;

@RestController
@RequestMapping ("/public/evento")
public class EventoController 
{
	@Autowired
	private EventoService service;
	
	@PostMapping (consumes = "application/json")
	public Evento salvar (@RequestBody Evento evento)
	{		
		return service.salvar (evento);
	}
	
	@PutMapping (consumes = "application/json")
	public Evento alterar (@RequestBody Evento evento)
	{
		return service.salvar (evento);
	}
	
	@DeleteMapping (consumes = "application/json")
	public void excluir (@RequestBody Evento evento)
	{
		service.excluir (evento);
	}
	
	@GetMapping (produces = "application/json")
	public List<Evento> listar ()
	{
		return service.listar ();
	}
	
	@GetMapping (value = "/buscarporid/{id}", produces = "application/json")
	public Evento buscarPorId (@PathVariable Integer id)
	{
		return service.buscarPorId (id);
	}
	
	@GetMapping (value = "/buscarpornome/{nome}", produces = "application/json")
	public List<Evento> buscarPorNome (@PathVariable String nome)
	{
		return service.buscarPorNome (nome);
	}
}
