package up.edu.br.shoppingup.contasareceber.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import up.edu.br.shoppingup.commom.exception.BusinessException;
import up.edu.br.shoppingup.commom.exception.BusinessExceptionCode;
import up.edu.br.shoppingup.contasareceber.entity.Conta;
import up.edu.br.shoppingup.contasareceber.repository.ContaRepository;
import up.edu.br.shoppingup.exemplo.entity.Veiculo;
import up.edu.br.shoppingup.exemplo.repository.VeiculoRepository;

@Service
public class ContaService {

	@Autowired
	private ContaRepository contaRep;

	@Transactional
	public Conta salvar(Conta conta) {		
	
		return contaRep.save(conta);
	}

	public List<Conta> listar() {
		return contaRep.findAll();
	}

	public void excluir(Conta conta) {
		contaRep.delete(conta);
	}

	public Conta buscarPorId(Integer id) {
		return contaRep.findById(id).get();
	}


}
