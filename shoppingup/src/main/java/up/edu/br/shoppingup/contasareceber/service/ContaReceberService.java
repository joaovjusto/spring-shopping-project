package up.edu.br.shoppingup.contasareceber.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import up.edu.br.shoppingup.commom.exception.BusinessException;
import up.edu.br.shoppingup.commom.exception.BusinessExceptionCode;
import up.edu.br.shoppingup.contasareceber.entity.Boleto;
import up.edu.br.shoppingup.contasareceber.entity.ContaReceber;
import up.edu.br.shoppingup.contasareceber.repository.BoletoRepository;
import up.edu.br.shoppingup.contasareceber.repository.ContaReceberRepository;
import up.edu.br.shoppingup.exemplo.entity.Veiculo;
import up.edu.br.shoppingup.exemplo.repository.VeiculoRepository;

@Service
public class ContaReceberService {

	@Autowired
	private ContaReceberRepository contaRep;
	private BoletoRepository boletoRep ;
	@Transactional
	public ContaReceber salvar(ContaReceber conta) {	
		
		return contaRep.save(conta);
	}

	public List<ContaReceber> listar() {
		return contaRep.findAll();
	}

	public void excluir(ContaReceber conta) {
		contaRep.delete(conta);
	}

	public ContaReceber buscarPorId(Integer id) {
		return contaRep.findById(id).get();
	}


}
