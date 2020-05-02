package up.edu.br.shoppingup.fornecedores.controller;

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

import up.edu.br.shoppingup.fornecedores.entity.Fornecedor;
import up.edu.br.shoppingup.fornecedores.service.FornecedorService;

@RestController
@RequestMapping ("/fornecedor")
public class FornecedorController 
{
	@Autowired
	private FornecedorService service;
	
	@PostMapping (consumes = "application/json")
	public Fornecedor salvar (@RequestBody Fornecedor fornecedor)
	{		
		return service.salvar (fornecedor);
	}
	
	@PutMapping (consumes = "application/json")
	public Fornecedor alterar (@RequestBody Fornecedor fornecedor)
	{
		return service.salvar (fornecedor);
	}
	
	@DeleteMapping (consumes = "application/json")
	public void excluir (@RequestBody Fornecedor fornecedor)
	{
		service.excluir (fornecedor);
	}
	
	@GetMapping (produces = "application/json")
	public List<Fornecedor> listar ()
	{
		return service.listar ();
	}
	
	@GetMapping (value = "/buscarporid/{id}", produces = "application/json")
	public Fornecedor buscarPorId (@PathVariable Integer id)
	{
		return service.buscarPorId (id);
	}
	
	@GetMapping (value = "/buscarpornome/{nome}", produces = "application/json")
	public List<Fornecedor> buscarPorNome (@PathVariable String nome)
	{
		return service.buscarPorNome (nome);
	}
}
