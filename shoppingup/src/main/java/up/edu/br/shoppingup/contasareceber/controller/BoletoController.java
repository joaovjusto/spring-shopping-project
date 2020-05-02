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
import up.edu.br.shoppingup.contasareceber.entity.Boleto;
import up.edu.br.shoppingup.contasareceber.service.BoletoService;

//http://localhost:8080/boleto-> requisicao http - > get

@RestController
@RequestMapping("/public/boleto")
public class BoletoController {
	
	@Autowired
	private BoletoService boletoService;
	
	@PostMapping(consumes = "application/json")
	public Boleto salvar(@RequestBody Boleto boleto) {		
		return boletoService.salvar(boleto);
	}
	
	@PutMapping(consumes = "application/json")
	public Boleto alterar(@RequestBody Boleto boleto) {		
		return boletoService.salvar(boleto);
	}
	
	@DeleteMapping(consumes = "application/json")
	public void excluir(@RequestBody Boleto boleto) {		
		boletoService.excluir(boleto);
	}
	
	@GetMapping(produces = "application/json")
	public List<Boleto> listar() {
		return boletoService.listar();
	}
	
	@GetMapping(value = "/buscarporid/{id}",produces = "application/json")
	public Boleto buscarPorId(@PathVariable Integer id) {
		return boletoService.buscarPorId(id);
	}
	
	//buscarPorXXXX

}
