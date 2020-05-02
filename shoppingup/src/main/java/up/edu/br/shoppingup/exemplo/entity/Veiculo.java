package up.edu.br.shoppingup.exemplo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VEICULO")
public class Veiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "GUIDVEICULO")
	private Integer guidVeiculo;

	@Column(name = "MARCA")
	private String marca;

	@Column(name = "MODELO")
	private String modelo;

	@Column(name = "ANO")
	private Integer ano;

	@Column(name = "QUILOMETRAGEM")
	private Integer quilometragem;

	public Integer getGuidVeiculo() {
		return guidVeiculo;
	}

	public void setGuidVeiculo(Integer guidVeiculo) {
		this.guidVeiculo = guidVeiculo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(Integer quilometragem) {
		this.quilometragem = quilometragem;
	}

}
