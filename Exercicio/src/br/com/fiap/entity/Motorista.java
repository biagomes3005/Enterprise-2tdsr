package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_MOTORISTA")
public class Motorista {
	
	@Id
	@Column(name="NR_CARTEIRA", nullable=false)
	private int nrCarteira;
	
	@Column(name="NM_MOTORISTA", nullable=false)
	private String nome;
		
	@Column(name="DT_NASCIMENTO")
	@Temporal(TemporalType.DATE)
	private Calendar dtNascimento;
	
	@Lob
	@Column(name="FL_CARTEIRA")
	private byte[] ftCarteira;
	
	@Column(name="DS_GENERO")
	private Sexo sexo;

	public Motorista(int nrCarteira, String nome, Calendar dtNascimento, byte[] ftCarteira, Sexo sexo) {
		super();
		this.nrCarteira = nrCarteira;
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.ftCarteira = ftCarteira;
		this.sexo = sexo;
	}

	public int getNrCarteira() {
		return nrCarteira;
	}

	public void setNrCarteira(int nrCarteira) {
		this.nrCarteira = nrCarteira;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Calendar dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public byte[] getFtCarteira() {
		return ftCarteira;
	}

	public void setFtCarteira(byte[] ftCarteira) {
		this.ftCarteira = ftCarteira;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	
}
