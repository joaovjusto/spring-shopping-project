package up.edu.br.shoppingup.suprimentos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import up.edu.br.shoppingup.suprimentos.entity.Suprimento;
import up.edu.br.shoppingup.suprimentos.repository.SuprimentoRepository;

@Service
public class SuprimentoService {
	
	@Autowired
	private SuprimentoRepository suprimentoRep;

	public Suprimento salvar(Suprimento suprimento) {
		return suprimentoRep.save(suprimento);
	}
	
	public List<Suprimento> listar(){
		return suprimentoRep.findAll();
	}
	
	public void deletar(Suprimento suprimento) { 
		
		suprimentoRep.deleteById(suprimento.getGuidSuprimento());
	}
	
	public Suprimento buscarPorId(Integer id) {
		return suprimentoRep.findById(id).get();
	}

	public List<Suprimento> buscarPorDepartamento(String departamento) {
		return suprimentoRep.findByDepartamento(departamento);
	}
}