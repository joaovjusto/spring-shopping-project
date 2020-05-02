package up.edu.br.shoppingup.fornecedores.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "FORNECEDOR")
public class Fornecedor 
{
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "GUID_FORNECEDOR")
	private Integer guidFornecedor;
	
	@Column (name = "NOME")
	private String nome;
	
	@Column (name = "CNPJ")
	private String cnpj;
	
	@Column (name = "ENDERECO")
	private String endereco;
	
	@Column (name = "TELEFONE")
	private String telefone;
	
	@Column (name = "PRODUTO")
	private String produto;

	public Integer getGuidFornecedor() {
		return guidFornecedor;
	}

	public void setGuidFornecedor(Integer guidFornecedor) {
		this.guidFornecedor = guidFornecedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}
}
