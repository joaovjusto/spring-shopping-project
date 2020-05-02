package up.edu.br.shoppingup.suprimentos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ITEMENTRADASUPRIMENTO")
public class ItemEntradaSuprimento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "GUIDITEMENTRADASUPRIMENTO")
	private Integer guidItemEntrada;
	
	@ManyToOne
	@JoinColumn(name="GUIDENTRADA")
	private EntradaSuprimento guidEntradaSuprimento;
	
	@ManyToOne
	@JoinColumn(name="GUIDSUPRIMENTO")
	private Suprimento guidSuprimento;
	
	@Column(name="QUANTIDADE")
	private Double quantidade;
	
	@Column(name="VALOR")
	private Double valor;

		
	//__________________________________________________________________________\\
	
	public Integer getGuidItemEntrada() {
		return guidItemEntrada;
	}

	public void setGuidItemEntrada(Integer guidItemEntrada) {
		this.guidItemEntrada = guidItemEntrada;
	}

	public EntradaSuprimento getGuidEntradaSuprimento() {
		return guidEntradaSuprimento;
	}

	public void setGuidEntradaSuprimento(EntradaSuprimento guidEntradaSuprimento) {
		this.guidEntradaSuprimento = guidEntradaSuprimento;
	}

	public Suprimento getGuidSuprimento() {
		return guidSuprimento;
	}

	public void setGuidSuprimento(Suprimento guidSuprimento) {
		this.guidSuprimento = guidSuprimento;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	

}
