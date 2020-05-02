package up.edu.br.shoppingup.contasapagar.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import up.edu.br.shoppingup.contasapagar.entity.enums.TipoSolicitante;

@Entity
@Table(name = "SOLICITANTE")
public class Solicitante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "GUIDSOLICITANTE")
	private Integer guidSolicitante;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "DOCUMENTO")
	private String cpfOuCnpj;
	
	@Column(name = "TELEFONE")
	private String telefone;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "TIPO_SOLICITANTE")
	private Integer tipoSolicitante;
	
	
	
	public Solicitante() {
		
	}

	public Solicitante(Integer guidSolicitante, String nome, String cpfOuCnpj, String telefone, String email,
			TipoSolicitante tipoSolicitante) {
		super();
		this.guidSolicitante = guidSolicitante;
		this.nome = nome;
		this.cpfOuCnpj = cpfOuCnpj;
		this.telefone = telefone;
		this.email = email;
		this.tipoSolicitante = (tipoSolicitante == null) ? null : tipoSolicitante.getCod();
	}

	public Integer getGuidSolicitante() {
		return guidSolicitante;
	}

	public void setGuidSolicitante(Integer guidSolicitante) {
		this.guidSolicitante = guidSolicitante;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpfOuCnpj() {
		return cpfOuCnpj;
	}

	public void setCpfOuCnpj(String cpfOuCnpj) {
		this.cpfOuCnpj = cpfOuCnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TipoSolicitante getTipoSolicitante() {
		return TipoSolicitante.toEnum(tipoSolicitante);
	}

	public void setTipoSolicitante(TipoSolicitante tipoSolicitante) {
		this.tipoSolicitante = tipoSolicitante.getCod();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((guidSolicitante == null) ? 0 : guidSolicitante.hashCode());
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
		Solicitante other = (Solicitante) obj;
		if (guidSolicitante == null) {
			if (other.guidSolicitante != null)
				return false;
		} else if (!guidSolicitante.equals(other.guidSolicitante))
			return false;
		return true;
	}


}
