package up.edu.br.shoppingup.contasareceber.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BOLETO")
public class Boleto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDBOLETO")
	private Integer idBoleto;

	@Column(name = "VENCIMENTO")
	private String vencimento;

	@Column(name = "JUROS")
	private Float juros;


	@Column(name = "VALORPARCELA")
	private Integer valorparcela;

	@Column(name = "IDCONTA")
	private Integer idConta;

	public Integer getIdBoleto() {
		return idBoleto;
	}

	public void setIdBoleto(Integer idBoleto) {
		this.idBoleto = idBoleto;
	}

	public String getVencimento() {
		return vencimento;
	}

	public void setVencimento(String vencimento) {
		this.vencimento = vencimento;
	}

	public Float getJuros() {
		return juros;
	}

	public void setJuros(Float juros) {
		this.juros = juros;
	}

	public Integer getValorparcela() {
		return valorparcela;
	}

	public void setValorparcela(Integer valorparcela) {
		this.valorparcela = valorparcela;
	}

	public Integer getIdConta() {
		return idConta;
	}

	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}

}


