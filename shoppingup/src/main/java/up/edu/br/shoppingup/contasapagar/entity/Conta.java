package up.edu.br.shoppingup.contasapagar.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import up.edu.br.shoppingup.contasapagar.entity.enums.StatusPagamento;

@Entity
@Table(name = "CONTA")
public class Conta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "GUIDCONTA")
	private Integer guidConta;
	
	@Column(name = "DATA_LANCAMENTO")
	private String dataLancamento;
	
	@Column(name = "DATA_VENCIMENTO")
	private String dataVencimento;
	
	@Column(name = "DATA_PAGAMENTO")
	private String dataPagamento;
	
	@Column(name = "NUMERO_DOCUMENTO")
	private String numeroDocumento;
	
	@Column(name = "VALOR")
	private Double valor;
	
	@Column(name = "NUMERO_PARCELAS")
	private Integer numeroParcelas;
	
	@Column(name = "DESCRICAO")
	private Integer descricao;
	
	@Column(name = "STATUS_PAGAMENTO")
	private Integer statusPagamento;
	
	@Column(name = "SOLICITANTE_ID")
	private Solicitante solicitante;
	
	@Column(name = "ENDERECO_ID")
	private Endereco enderecoCobranca;
	
	@Transient
	private TipoConta tipoConta;
	
	public Conta() {
		
	}

	public Conta(Integer guidConta, String dataLancamento, String dataVencimento, String dataPagamento,
			String numeroDocumento, Double valor, Integer numeroParcelas, Integer descricao, StatusPagamento statusPagamento,
			Solicitante solicitante, Endereco enderecoCobranca) {
		super();
		this.guidConta = guidConta;
		this.dataLancamento = dataLancamento;
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
		this.numeroDocumento = numeroDocumento;
		this.valor = valor;
		this.numeroParcelas = numeroParcelas;
		this.descricao = descricao;
		this.statusPagamento = (statusPagamento == null) ? null : statusPagamento.getCod();
		this.solicitante = solicitante;
		this.enderecoCobranca = enderecoCobranca;
	}

	public Integer getGuidConta() {
		return guidConta;
	}

	public void setGuidConta(Integer guidConta) {
		this.guidConta = guidConta;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public String getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getNumeroParcelas() {
		return numeroParcelas;
	}

	public void setNumeroParcelas(Integer numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}

	public Integer getDescricao() {
		return descricao;
	}

	public void setDescricao(Integer descricao) {
		this.descricao = descricao;
	}

	public StatusPagamento getStatusPagamento() {
		return StatusPagamento.toEnum(statusPagamento);
	}

	public void setStatusPagamento(StatusPagamento statusPagamento) {
		this.statusPagamento = statusPagamento.getCod();
	}

	public Solicitante getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}

	public Endereco getEnderecoCobranca() {
		return enderecoCobranca;
	}

	public void setEnderecoCobranca(Endereco enderecoCobranca) {
		this.enderecoCobranca = enderecoCobranca;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((guidConta == null) ? 0 : guidConta.hashCode());
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
		Conta other = (Conta) obj;
		if (guidConta == null) {
			if (other.guidConta != null)
				return false;
		} else if (!guidConta.equals(other.guidConta))
			return false;
		return true;
	}
	

}
