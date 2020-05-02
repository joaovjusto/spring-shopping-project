package up.edu.br.shoppingup.eventos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import up.edu.br.shoppingup.commom.exception.BusinessException;
import up.edu.br.shoppingup.commom.exception.BusinessExceptionCode;
import up.edu.br.shoppingup.eventos.entity.Evento;
import up.edu.br.shoppingup.eventos.repository.EventoRepository;

@Service
public class EventoService 
{
	@Autowired
	private EventoRepository repository;	
	
	public Evento salvar (Evento evento)
	{
		/*
		if (evento.getNome() == null)
		{
			BusinessExceptionCode code = BusinessExceptionCode.ERR600;
			BusinessException exception = new BusinessException (code);
			throw exception;
		}
		if (evento.getTelefone() == null)
		{
			BusinessExceptionCode code = BusinessExceptionCode.ERR601;
			BusinessException exception = new BusinessException (code);
			throw exception;
		}
		
		*/
		return repository.save(evento);
	}	
	
	public List<Evento> listar()
	{
		return repository.findAll();
	}

	public void excluir(Evento evento)
	{
		repository.delete (evento);
	}
	
	public Evento buscarPorId(Integer id)
	{		
		return repository.findById (id).get ();
	}
	
	public List<Evento> buscarPorNome(String nome)
	{
		return repository.findByNome (nome);
	}
}
