package up.edu.br.shoppingup.suprimentos.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import up.edu.br.shoppingup.commom.exception.BusinessException;
import up.edu.br.shoppingup.commom.exception.BusinessExceptionCode;
import up.edu.br.shoppingup.suprimentos.entity.EntradaSuprimento;
import up.edu.br.shoppingup.suprimentos.repository.EntradaSuprimentoRepository;

@Service
public class EntradaSuprimentoService {

	@Autowired
	private EntradaSuprimentoRepository entradaSuprimentoRep;
	
	@Transactional
	public EntradaSuprimento salvar(EntradaSuprimento entrada) {
		//Não pode Haver Entrada sem Numero de Nota Fisca
		if(entrada.getNotaFiscal()==null) {
			BusinessExceptionCode codigoErro = BusinessExceptionCode.ERR700;
			BusinessException b = new BusinessException(codigoErro);
			throw b;
		}
		//Não pode Haver Entrada sem requisição de compra
		if(entrada.getRequisicaoCompra()==null) {
			BusinessExceptionCode codigoErro = BusinessExceptionCode.ERR701;
			BusinessException b = new BusinessException(codigoErro);
			throw b;
		}
		
		//Valor da Nota tem de ser Maior que R$0,00
		if(entrada.getValorTotal()==null || entrada.getValorTotal() < 0.1 ) {
			BusinessExceptionCode codigoErro = BusinessExceptionCode.ERR702;
			BusinessException b = new BusinessException(codigoErro);
			throw b;
		}
		
		return entradaSuprimentoRep.save(entrada);
	}
	
	public List<EntradaSuprimento> listar(){
		return entradaSuprimentoRep.findAll();
	}
	
	public void deletar(EntradaSuprimento entrada) { 
		
		entradaSuprimentoRep.deleteById(entrada.getGuidEntrada());
	}
	
	public EntradaSuprimento buscarPorId(Integer id) {
		return entradaSuprimentoRep.findById(id).get();
	}
	
}
