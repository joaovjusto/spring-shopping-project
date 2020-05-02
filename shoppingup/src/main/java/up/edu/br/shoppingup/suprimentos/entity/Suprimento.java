package up.edu.br.shoppingup.suprimentos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SUPRIMENTO")
public class Suprimento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "GUIDSUPRIMENTO")
	private Integer guidSuprimento;
	
	@Column(name="CODIGO")
	private String codigo;
	
	@Column(name = "DEPARTAMENTO")
	private String departamento;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@Column(name="CriadoEm")
	private String criadoEm;
	
	@Column(name="UNIDADE_DE_MEDIDA")
	private String unidadeMedida;
	
	
	
	public Integer getGuidSuprimento() {
		return guidSuprimento;
	}

	public void setGuidSuprimento(Integer guidSuprimento) {
		this.guidSuprimento = guidSuprimento;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCriadoEm() {
		return criadoEm;
	}

	public void setCriadoEm(String criadoEm) {
		this.criadoEm = criadoEm;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

}
