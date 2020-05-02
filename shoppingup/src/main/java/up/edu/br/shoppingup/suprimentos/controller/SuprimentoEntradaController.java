package up.edu.br.shoppingup.suprimentos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import up.edu.br.shoppingup.suprimentos.entity.EntradaSuprimento;
import up.edu.br.shoppingup.suprimentos.service.EntradaSuprimentoService;

@RestController
@RequestMapping("/public/entradaSuprimento")
public class SuprimentoEntradaController {
	
	@Autowired
	private EntradaSuprimentoService entradaSupService;
	
	@PostMapping(consumes = "application/json")
	public EntradaSuprimento salvar(@RequestBody EntradaSuprimento entradaSuprimento) {
		return entradaSupService.salvar(entradaSuprimento);
	}
	
	@GetMapping(produces = "application/json")
	public List<EntradaSuprimento> listar(){
		return entradaSupService.listar();
	}

}
