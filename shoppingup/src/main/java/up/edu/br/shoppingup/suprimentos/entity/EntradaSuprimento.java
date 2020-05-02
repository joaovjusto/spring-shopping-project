package up.edu.br.shoppingup.suprimentos.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//Controle de Entradas de Suprimentos de estoque
@Entity
@Table(name = "ENTRADASUPRIMENTO")
public class EntradaSuprimento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "GUIDENTRADA")
	private Integer guidEntrada;
	@Column(name="NOTA_FISCAL")
	private Integer notaFiscal;
	@Column(name="REQUISICAO_COMPRA")
	private Integer requisicaoCompra;
	@Column(name="VALOR_TOTAL")
	private Double valorTotal;
	@Column(name="DATA")
	private Date data;
		
	//__________________________________________________________________________\\
	
	public Integer getGuidEntrada() {
		return guidEntrada;
	}
	public void setGuidEntrada(Integer guidEntrada) {
		this.guidEntrada = guidEntrada;
	}
	public Integer getNotaFiscal() {
		return notaFiscal;
	}
	public void setNotaFiscal(Integer notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	public Integer getRequisicaoCompra() {
		return requisicaoCompra;
	}
	public void setRequisicaoCompra(Integer requisicaoCompra) {
		this.requisicaoCompra = requisicaoCompra;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}

	
}
