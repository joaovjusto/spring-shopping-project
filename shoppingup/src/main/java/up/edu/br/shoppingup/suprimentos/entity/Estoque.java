package up.edu.br.shoppingup.suprimentos.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ESTOQUESUPRIMENTO")
public class Estoque {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "GUIDESTOQUE")
	private Integer guidEstoque;
	
	@ManyToOne
	@JoinColumn(name="GUIDITEMENTRADA")
	private ItemEntradaSuprimento guidItemEntrada;
	
	@Column(name="QUANTIDADE")
	private Double quantidade;
	
	@Column(name="DATA_ENTRADA")
	private Date dataEntrada;
	
	@Column(name="FORNECEDOR")
	private String fornecedor; //id fake

	public Integer getGuidEstoque() {
		return guidEstoque;
	}

	public void setGuidEstoque(Integer guidEstoque) {
		this.guidEstoque = guidEstoque;
	}

	public ItemEntradaSuprimento getGuidItemEntrada() {
		return guidItemEntrada;
	}

	public void setGuidItemEntrada(ItemEntradaSuprimento guidItemEntrada) {
		this.guidItemEntrada = guidItemEntrada;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	
}
