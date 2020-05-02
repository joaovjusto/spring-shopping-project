package up.edu.br.shoppingup.contasareceber.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import up.edu.br.shoppingup.contasareceber.entity.Boleto;
import up.edu.br.shoppingup.contasareceber.repository.BoletoRepository;


@Service
public class BoletoService {

	@Autowired
	private BoletoRepository boletoRep;

	@Transactional
	public Boleto salvar(Boleto boleto) {		
	
		return boletoRep.save(boleto);
	}

	public List<Boleto> listar() {
		return boletoRep.findAll();
	}

	public void excluir(Boleto boleto) {
		boletoRep.delete(boleto);
	}

	public Boleto buscarPorId(Integer id) {
		return boletoRep.findById(id).get();
	}


}
