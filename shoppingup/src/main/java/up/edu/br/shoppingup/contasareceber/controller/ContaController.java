package up.edu.br.shoppingup.contasareceber.controller;

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

import up.edu.br.shoppingup.contasareceber.entity.Conta;
import up.edu.br.shoppingup.contasareceber.service.ContaService;

//http://localhost:8080/conta-> requisicao http - > get

@RestController
@RequestMapping("/public/conta")
public class ContaController {
	
	@Autowired
	private ContaService contaService;
	
	@PostMapping(consumes = "application/json")
	public Conta salvar(@RequestBody Conta Conta) {		
		return contaService.salvar(Conta);
	}
	
	@PutMapping(consumes = "application/json")
	public Conta alterar(@RequestBody Conta Conta) {		
		return contaService.salvar(Conta);
	}
	
	@DeleteMapping(consumes = "application/json")
	public void excluir(@RequestBody Conta Conta) {		
		contaService.excluir(Conta);
	}
	
	@GetMapping(produces = "application/json")
	public List<Conta> listar() {
		return contaService.listar();
	}
	
	@GetMapping(value = "/buscarporid/{id}",produces = "application/json")
	public Conta buscarPorId(@PathVariable Integer id) {
		return contaService.buscarPorId(id);
	}
	
	//buscarPorXXXX

}
