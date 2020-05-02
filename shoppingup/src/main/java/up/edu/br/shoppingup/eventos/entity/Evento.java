package up.edu.br.shoppingup.eventos.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "EVENTO")
public class Evento 
{
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "GUID_EVENTOS")
	private Integer guidEventos;
	
	
	@Column (name = "NOME")
	private String nome;
	

	@Column (name = "DATA_INICIO")
	private Date dataInicio;
	
	
	@Column (name = "DATA_FIM")
	private Date dataFim;
	
	
	@Column (name = "TIPO_CONSUMIDOR")
	private String tipoConsumidor;
	
	
	@Column (name = "CAPACIDADE")
	private Integer capacidade;


	public Integer getGuidEventos() {
		return guidEventos;
	}


	public void setGuidEventos(Integer guidEventos) {
		this.guidEventos = guidEventos;
	}


	public Date getDataInicio() {
		return dataInicio;
	}


	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}


	public Date getDataFim() {
		return dataFim;
	}


	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}


	public String getTipoConsumidor() {
		return tipoConsumidor;
	}


	public void setTipoConsumidor(String tipoConsumidor) {
		this.tipoConsumidor = tipoConsumidor;
	}


	public Integer getCapacidade() {
		return capacidade;
	}


	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	/*
	@Column (name = "LOCAL")
	private String local;
	*/
	
	
	
	
	
	

	
}

