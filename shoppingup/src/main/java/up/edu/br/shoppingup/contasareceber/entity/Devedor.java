package up.edu.br.shoppingup.contasareceber.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DEVEDOR")
public class Devedor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDDEVEDOR")
	private Integer idDevedor;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "ENDERECO")
	private String endereco;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "CNPJ")
	private String cnpj;

	public Integer getIdDevedor() {
		return idDevedor;
	}

	public void setIdDevedor(Integer idDevedor) {
		this.idDevedor = idDevedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}


