package up.edu.br.shoppingup.contasapagar.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import up.edu.br.shoppingup.contasapagar.entity.Conta;
import up.edu.br.shoppingup.contasapagar.service.ContaService;

@RestController
@RequestMapping("/contasapagar")
public class ContaController {

	@Autowired
	private ContaService contaService;

	@PostMapping(consumes = "application/json")
	public Conta salvar(@RequestBody Conta conta) {
		return contaService.salvarConta(conta);
	}

	@GetMapping(produces = "application/json")
	public List<Conta> listar() {
		return contaService.listarContas();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Conta> buscarPorId(@PathVariable Integer id) {
		Conta obj = contaService.buscar(id);
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> atualizar(@Valid @RequestBody @PathVariable Integer id) {
		contaService.atualizar(id);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> deletar(@PathVariable Integer id) {
		contaService.deletar(id);
		return ResponseEntity.noContent().build();
	}

}
