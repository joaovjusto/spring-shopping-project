package up.edu.br.shoppingup.suprimentos.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import up.edu.br.shoppingup.suprimentos.entity.ItemEntradaSuprimento;
import up.edu.br.shoppingup.suprimentos.service.ItemEntradaSuprimentoService;

@RestController
@RequestMapping("/public/ItemEntradaSuprimento")
public class SuprimentoItemEntradaController {
	
	@Autowired
	private ItemEntradaSuprimentoService ItemEntradaSupService;
	
	@PostMapping(consumes = "application/json")
	public void salvar(@RequestBody ItemEntradaSuprimento itemEntradaSuprimento) {
		ItemEntradaSupService.salvarEstoque(itemEntradaSuprimento); 
	}
	
	@GetMapping(produces = "application/json")
	public List<ItemEntradaSuprimento> listar(){
		return ItemEntradaSupService.listar();
	}
	
}
