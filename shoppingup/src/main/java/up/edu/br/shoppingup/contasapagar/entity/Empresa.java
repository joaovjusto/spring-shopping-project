package up.edu.br.shoppingup.contasapagar.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPRESA")
public class Empresa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "GUIDEMPRESA")
	private Integer guidEmpresa;
	
	@Column(name = "RAZAO_SOCIAL")
	private String razaoSocial;
	
	@Column(name = "NOME_FANTASIA")
	private String nomeFantasia;
	
	@Column(name = "CNPJ")
	private String cnpj;
	
	@Column(name = "INSCRICAO_ESTADUAL")
	private String inscricaoEstadual;

	public Empresa() {
		
	}

	public Empresa(Integer guidEmpresa, String razaoSocial, String nomeFantasia, String cnpj,
			String inscricaoEstadual) {
		super();
		this.guidEmpresa = guidEmpresa;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public Integer getGuidEmpresa() {
		return guidEmpresa;
	}

	public void setGuidEmpresa(Integer guidEmpresa) {
		this.guidEmpresa = guidEmpresa;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((guidEmpresa == null) ? 0 : guidEmpresa.hashCode());
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
		Empresa other = (Empresa) obj;
		if (guidEmpresa == null) {
			if (other.guidEmpresa != null)
				return false;
		} else if (!guidEmpresa.equals(other.guidEmpresa))
			return false;
		return true;
	}

}
