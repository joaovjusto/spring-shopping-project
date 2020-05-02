package up.edu.br.shoppingup.suprimentos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import up.edu.br.shoppingup.suprimentos.entity.Estoque;
import up.edu.br.shoppingup.suprimentos.entity.ItemEntradaSuprimento;
import up.edu.br.shoppingup.suprimentos.repository.EstoqueRepository;

public class EstoqueService {
	
	@Autowired
	private EstoqueRepository estoqueRep;
	
	@Autowired
	private Estoque estoque;
	
	public void salvar(ItemEntradaSuprimento itemEntrada) {
	
		estoque.setGuidItemEntrada(itemEntrada);
		estoque.setFornecedor("fornecedor A");
		estoque.setQuantidade(itemEntrada.getQuantidade());
		estoque.setDataEntrada(itemEntrada.getGuidEntradaSuprimento().getData());
		
		estoqueRep.save(estoque);
	}
	
	public List<Estoque> listar(){
		return estoqueRep.findAll();
	}
	
	public void deletar(Estoque estoque) { 
		
		estoqueRep.deleteById(estoque.getGuidEstoque());
	}
	
	public Estoque buscarPorId(Integer id) {
		return estoqueRep.findById(id).get();
	}

}
