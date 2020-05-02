package up.edu.br.shoppingup.contasareceber.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import up.edu.br.shoppingup.commom.exception.BusinessException;
import up.edu.br.shoppingup.commom.exception.BusinessExceptionCode;
import up.edu.br.shoppingup.contasareceber.entity.Conta;
import up.edu.br.shoppingup.contasareceber.entity.Devedor;
import up.edu.br.shoppingup.contasareceber.repository.ContaRepository;
import up.edu.br.shoppingup.contasareceber.repository.DevedorRepository;
import up.edu.br.shoppingup.exemplo.entity.Veiculo;
import up.edu.br.shoppingup.exemplo.repository.VeiculoRepository;

@Service
public class DevedorService {

	@Autowired
	private DevedorRepository devedorRep;

	@Transactional
	public Devedor salvar(Devedor devedor) {		
	
		return devedorRep.save(devedor);
	}

	public List<Devedor> listar() {
		return devedorRep.findAll();
	}

	public void excluir(Devedor devedor) {
		devedorRep.delete(devedor);
	}

	public Devedor buscarPorId(Integer id) {
		return devedorRep.findById(id).get();
	}


}
