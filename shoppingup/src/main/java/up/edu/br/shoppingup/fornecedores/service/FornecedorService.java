package up.edu.br.shoppingup.fornecedores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import up.edu.br.shoppingup.commom.exception.BusinessException;
import up.edu.br.shoppingup.commom.exception.BusinessExceptionCode;
import up.edu.br.shoppingup.fornecedores.entity.Fornecedor;
import up.edu.br.shoppingup.fornecedores.repository.FornecedorRepository;

@Service
public class FornecedorService 
{
	@Autowired
	private FornecedorRepository repository;	
	
	public Fornecedor salvar (Fornecedor fornecedor)
	{
		if (fornecedor.getNome() == null)
		{
			BusinessExceptionCode code = BusinessExceptionCode.ERR600;
			BusinessException exception = new BusinessException (code);
			throw exception;
		}
		if (fornecedor.getTelefone() == null)
		{
			BusinessExceptionCode code = BusinessExceptionCode.ERR601;
			BusinessException exception = new BusinessException (code);
			throw exception;
		}
		return repository.save(fornecedor);
	}	
	
	public List<Fornecedor> listar()
	{
		return repository.findAll();
	}

	public void excluir(Fornecedor fornecedor)
	{
		repository.delete (fornecedor);
	}
	
	public Fornecedor buscarPorId(Integer id)
	{		
		return repository.findById (id).get ();
	}
	
	public List<Fornecedor> buscarPorNome(String nome)
	{
		return repository.findByNome (nome);
	}
}
