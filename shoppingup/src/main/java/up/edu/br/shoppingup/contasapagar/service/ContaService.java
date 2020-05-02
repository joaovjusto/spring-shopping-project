package up.edu.br.shoppingup.contasapagar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import up.edu.br.shoppingup.contasapagar.commom.exception.BusinessException;
import up.edu.br.shoppingup.contasapagar.commom.exception.BusinessExceptionCode;
import up.edu.br.shoppingup.contasapagar.entity.Conta;
import up.edu.br.shoppingup.contasapagar.repository.ContaRepository;
import up.edu.br.shoppingup.contasapagar.service.exceptions.DataIntegrityException;
import up.edu.br.shoppingup.contasapagar.service.exceptions.ObjectNotFoundException;

@Service
public class ContaService {

	@Autowired // injecao de dependencia
	private ContaRepository contaRep;

	public Conta salvarConta(Conta conta) {
		
		if(conta.getDataLancamento().isEmpty()) {
			BusinessExceptionCode codiErro = BusinessExceptionCode.ERR001;
			BusinessException b = new BusinessException(codiErro);
			throw b;
		}
		return contaRep.save(conta);
	}

	public List<Conta> listarContas() {
		return contaRep.findAll();
	}
	
	public Conta buscar(Integer id) {
		Optional<Conta> obj = contaRep.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Conta não encontrado! Id: " + id + ", Tipo: " + Conta.class.getName()));
	}
	
	public Conta atualizar(Integer id) {
		Conta newObj = buscar(id);
		return contaRep.save(newObj);
	}
	
	public void deletar(Integer id) {
		buscar(id);
		try {
			contaRep.deleteById(id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir porque há pedidos relacionados");
		}
	}
}
