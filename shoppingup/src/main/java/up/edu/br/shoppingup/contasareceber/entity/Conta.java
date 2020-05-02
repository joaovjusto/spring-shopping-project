package up.edu.br.shoppingup.contasareceber.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONTA")
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDCONTA")
	private Integer idConta;

	@Column(name = "DIAVENCIMENTO")
	private String diavencimento;

	@Column(name = "VALORTOTAL")
	private Float valortotal;

	@Column(name = "DESCRICAO")
	private String descricao;

	@Column(name = "NPARCELAS")
	private Integer nparcelas;
	
	@Column(name = "IDDEVEDOR")
	private Integer idDevedor;

	public Integer getIdConta() {
		return idConta;
	}

	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}

	public String getDiavencimento() {
		return diavencimento;
	}

	public void setDiavencimento(String diavencimento) {
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

	public Integer getIdDevedor() {
		return idDevedor;
	}

	public void setIdDevedor(Integer idDevedor) {
		this.idDevedor = idDevedor;
	}
	
	}



