package up.edu.br.shoppingup.contasareceber.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONTARECEBER")
public class ContaReceber {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDCONTARECEBER")
	private Integer idContaReceber;

	@Column(name = "DIAVENCIMENTO")
	private Integer diavencimento;

	@Column(name = "VALORTOTAL")
	private Float valortotal;

	@Column(name = "DESCRICAO")
	private String descricao;

	@Column(name = "NPARCELAS")
	private Integer nparcelas;
	

	public Integer getIdContaReceber() {
		return idContaReceber;
	}

	public void setIdContaReceber(Integer idContaReceber) {
		this.idContaReceber = idContaReceber;
	}

	public Integer getDiavencimento() {
		return diavencimento;
	}

	public void setDiavencimento(Integer diavencimento) {
		this.diavencimento = diavencimento;
	}

	public Float getValortotal() {
		return valortotal;
	}

	public void setValortotal(Float valortotal) {
		this.valortotal = valortotal;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getNparcelas() {
		return nparcelas;
	}

	public void setNparcelas(Integer nparcelas) {
		this.nparcelas = nparcelas;
	}

	
	
	}



