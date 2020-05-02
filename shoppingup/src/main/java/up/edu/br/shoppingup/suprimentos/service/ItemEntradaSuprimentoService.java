package up.edu.br.shoppingup.suprimentos.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import up.edu.br.shoppingup.commom.exception.BusinessException;
import up.edu.br.shoppingup.commom.exception.BusinessExceptionCode;
import up.edu.br.shoppingup.suprimentos.entity.ItemEntradaSuprimento;
import up.edu.br.shoppingup.suprimentos.repository.ItemEntradaSuprimentoRepository;

@Service
public class ItemEntradaSuprimentoService {

	@Autowired
	private ItemEntradaSuprimentoRepository itemEntradaSuprimentoRep;
	
	
	

	@Transactional
	public ItemEntradaSuprimento salvar(ItemEntradaSuprimento itemEntrada) {
		 
		//Quantidade tem de ser maior que zero
		if(itemEntrada.getQuantidade()==null || itemEntrada.getQuantidade()< 0.1) {
			BusinessExceptionCode codigoErro = BusinessExceptionCode.ERR703;
			BusinessException b = new BusinessException(codigoErro);
			throw b;
		} 
					
		return itemEntradaSuprimentoRep.save(itemEntrada); 
	}
	
	public void salvarEstoque(ItemEntradaSuprimento itemEntrada) {
		EstoqueService estoqueService = new EstoqueService();
				
		ItemEntradaSuprimento guid = salvar(itemEntrada);
		estoqueService.salvar(guid);
	}
	
	public List<ItemEntradaSuprimento> listar(){
		return itemEntradaSuprimentoRep.findAll();
	}
	
	public void deletar(ItemEntradaSuprimento itemEntrada) { 
		
		itemEntradaSuprimentoRep.deleteById(itemEntrada.getGuidItemEntrada());
	}
	
	public ItemEntradaSuprimento buscarPorId(Integer id) {
		return itemEntradaSuprimentoRep.findById(id).get();
	}
	
}
