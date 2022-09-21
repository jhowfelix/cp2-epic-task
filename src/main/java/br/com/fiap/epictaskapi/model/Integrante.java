package br.com.fiap.epictaskapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonProperty;

@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
@Entity
public class Integrante{

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
	private Long id;
	
	@JsonProperty("NOME")
	private String nome;
	
	@JsonProperty("RM")
	private String rm;

	public Integrante() {
		super();
	}

	public Integrante(String nome, String rm) {
		super();
		this.nome = nome;
		this.rm = rm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRm() {
		return rm;
	}

	public void setRm(String rm) {
		this.rm = rm;
	}

}
