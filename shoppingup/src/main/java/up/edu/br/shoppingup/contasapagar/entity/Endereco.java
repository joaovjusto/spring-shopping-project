package up.edu.br.shoppingup.contasapagar.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOCALIDADE")
public class Endereco implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "GUIDLOCALIDADE")
	private Integer guidLocalidade;
	
	@Column(name = "ENDERECO")
	private String endereco;
	
	@Column(name = "NUMERO")
	private String numero;
	
	@Column(name = "COMPLEMENTO")
	private String complemento;
	
	@Column(name = "BAIRRO")
	private String bairro;
	
	@Column(name = "CEP")
	private String cep;
	
	@Column(name = "MUNICIPIO")
	private String municipio;
	
	@Column(name = "UF")
	private String uf;
	
	public Endereco() {
		
	}

	public Endereco(Integer guidLocalidade, String endereco, String numero, String complemento, String bairro,
			String cep, String municipio, String uf) {
		super();
		this.guidLocalidade = guidLocalidade;
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.municipio = municipio;
		this.uf = uf;
	}

	public Integer getGuidLocalidade() {
		return guidLocalidade;
	}

	public void setGuidLocalidade(Integer guidLocalidade) {
		this.guidLocalidade = guidLocalidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((guidLocalidade == null) ? 0 : guidLocalidade.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (guidLocalidade == null) {
			if (other.guidLocalidade != null)
				return false;
		} else if (!guidLocalidade.equals(other.guidLocalidade))
			return false;
		return true;
	}


}
