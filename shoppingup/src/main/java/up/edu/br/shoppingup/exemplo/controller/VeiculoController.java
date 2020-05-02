package up.edu.br.shoppingup.exemplo.controller;

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

import up.edu.br.shoppingup.exemplo.entity.Veiculo;
import up.edu.br.shoppingup.exemplo.service.VeiculoService;

//http://localhost:8080/veiculo -> requisicao http - > get

@RestController
@RequestMapping("/public/veiculo")
public class VeiculoController {
	
	@Autowired
	private VeiculoService veiculoService;
	
	@PostMapping(consumes = "application/json")
	public Veiculo salvar(@RequestBody Veiculo veiculo) {		
		return veiculoService.salvar(veiculo);
	}
	
	@PutMapping(consumes = "application/json")
	public Veiculo alterar(@RequestBody Veiculo veiculo) {		
		return veiculoService.salvar(veiculo);
	}
	
	@DeleteMapping(consumes = "application/json")
	public void excluir(@RequestBody Veiculo veiculo) {		
		veiculoService.excluir(veiculo);
	}
	
	@GetMapping(produces = "application/json")
	public List<Veiculo> listar() {
		return veiculoService.listar();
	}
	
	@GetMapping(value = "/buscarporid/{id}",produces = "application/json")
	public Veiculo buscarPorId(@PathVariable Integer id) {
		return veiculoService.buscarPorId(id);
	}
	
	@GetMapping(value = "/buscarpormarca/{marca}",produces = "application/json")
	public List<Veiculo> buscarPorId(@PathVariable String marca) {
		return veiculoService.buscarPorMarca(marca);
	}
	

	//buscarPorXXXX

}
