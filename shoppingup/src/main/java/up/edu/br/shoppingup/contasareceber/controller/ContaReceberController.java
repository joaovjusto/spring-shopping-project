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

import up.edu.br.shoppingup.contasareceber.entity.ContaReceber;
import up.edu.br.shoppingup.contasareceber.service.ContaReceberService;

//http://localhost:8080/contaReceber-> requisicao http - > get

@RestController
@RequestMapping("/public/contaReceber")
public class ContaReceberController {
	
	@Autowired
	private ContaReceberService contaService;
	
	@PostMapping(consumes = "application/json")
	public ContaReceber salvar(@RequestBody ContaReceber Conta) {		
		return contaService.salvar(Conta);
	}
	
	@PutMapping(consumes = "application/json")
	
	public ContaReceber alterar(@RequestBody ContaReceber Conta) {		
		return contaService.salvar(Conta);
	}
	
	@DeleteMapping(consumes = "application/json")
	public void excluir(@RequestBody ContaReceber Conta) {		
		contaService.excluir(Conta);
	}
	
	@GetMapping(produces = "application/json")
	public List<ContaReceber> listar() {
		return contaService.listar();
	}
	
	@GetMapping(value = "/buscarporid/{id}",produces = "application/json")
	public ContaReceber buscarPorId(@PathVariable Integer id) {
		return contaService.buscarPorId(id);
	}
	
	//buscarPorXXXX

}
