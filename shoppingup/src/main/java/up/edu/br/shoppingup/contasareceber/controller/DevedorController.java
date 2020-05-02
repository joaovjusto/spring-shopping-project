package up.edu.br.shoppingup.Devedorsareceber.controller;

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


//http://localhost:8080/Devedor-> requisicao http - > get

@RestController
@RequestMapping("/public/Devedor")
public class DevedorController {
	
	@Autowired
	private DevedorService devedorService;
	
	@PostMapping(consumes = "application/json")
	public Devedor salvar(@RequestBody Devedor Devedor) {		
		return DevedorService.salvar(Devedor);
	}
	
	@PutMapping(consumes = "application/json")
	public Devedor alterar(@RequestBody Devedor Devedor) {		
		return DevedorService.salvar(Devedor);
	}
	
	@DeleteMapping(consumes = "application/json")
	public void excluir(@RequestBody Devedor Devedor) {		
		DevedorService.excluir(Devedor);
	}
	
	@GetMapping(produces = "application/json")
	public List<Devedor> listar() {
		return DevedorService.listar();
	}
	
	@GetMapping(value = "/buscarporid/{id}",produces = "application/json")
	public Devedor buscarPorId(@PathVariable Integer id) {
		return DevedorService.buscarPorId(id);
	}
	
	//buscarPorXXXX

}
