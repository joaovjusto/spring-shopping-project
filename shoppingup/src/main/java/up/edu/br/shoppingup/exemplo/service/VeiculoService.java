package up.edu.br.shoppingup.exemplo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import up.edu.br.shoppingup.commom.exception.BusinessException;
import up.edu.br.shoppingup.commom.exception.BusinessExceptionCode;
import up.edu.br.shoppingup.exemplo.entity.Veiculo;
import up.edu.br.shoppingup.exemplo.repository.VeiculoRepository;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository veiculoRep;

	@Transactional
	public Veiculo salvar(Veiculo veiculo) {		
		// não é possível cadastrar um veiculo com o ano menor que 1980
		if (veiculo.getAno() == null || veiculo.getAno() < 1980) {
			// coloco um erro aqui
			BusinessExceptionCode codigoErro = BusinessExceptionCode.ERR001;
			BusinessException b = new BusinessException(codigoErro);
			throw b;
			
		}		
		
		//a quilometragem do veículo não pode ultrapassar 200.000 km
		if (veiculo.getQuilometragem() == null || veiculo.getQuilometragem() > 200000) {
			BusinessExceptionCode codigoErro = BusinessExceptionCode.ERR002;
			BusinessException b = new BusinessException(codigoErro);
			throw b;
		}

		return veiculoRep.save(veiculo);
	}

	public List<Veiculo> listar() {
		return veiculoRep.findAll();
	}

	public void excluir(Veiculo veiculo) {
		veiculoRep.delete(veiculo);
	}

	public Veiculo buscarPorId(Integer id) {
		return veiculoRep.findById(id).get();
	}

	public List<Veiculo> buscarPorMarca(String marca) {
		return veiculoRep.findByMarca(marca);
	}

}
