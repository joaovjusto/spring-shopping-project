package up.edu.br.shoppingup.suprimentos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import up.edu.br.shoppingup.suprimentos.entity.Suprimento;
import up.edu.br.shoppingup.suprimentos.service.SuprimentoService;

@RestController
@RequestMapping("/public/suprimento")
public class SuprimentoController {
	
	@Autowired
	private SuprimentoService suprimentoService;
	
	@PostMapping(consumes = "application/json")
	public Suprimento salvar(@RequestBody Suprimento suprimento) {
		return suprimentoService.salvar(suprimento);
	}
	
	@GetMapping(produces = "application/json")
	public List<Suprimento> listar(){
		return suprimentoService.listar();
	}
	
	@DeleteMapping (consumes = "application/json")
	public void deletar(@RequestBody Suprimento suprimento){
		suprimentoService.deletar(suprimento);
	}
	
	@GetMapping(value = "/buscarporid/{id}",produces = "application/json")
	public Suprimento buscarPorId(@PathVariable Integer id) {
		return suprimentoService.buscarPorId(id);
	}
	
	@GetMapping(value = "/buscarpordepartamento/{departamento}",produces = "application/json")
	public List<Suprimento> buscarPorDepartamento(@PathVariable String departamento) {
		return suprimentoService.buscarPorDepartamento(departamento);
	}		

}
