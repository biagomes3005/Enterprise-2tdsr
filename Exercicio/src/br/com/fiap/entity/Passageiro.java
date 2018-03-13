package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_PASSAGEIRO")
@SequenceGenerator(name="passageiro",sequenceName="SQ_TB_PASSAGEIRO",allocationSize=1)
public class Passageiro {
	
	@Id
	@Column(name="CD_PASSAGEIRO", nullable=false)
	@GeneratedValue(generator="passageiro",strategy=GenerationType.SEQUENCE)
	private int codPassageiro;
	
	@Column(name="NM_PASSAGEIRO", nullable=false)
	private String nome;
	
	@Column(name="DT_PASSAGEIRO")
	private Calendar dtNascimento;
	
	@Column(name="DS_GENERO")
	private Sexo sexo;

	public Passageiro(int codPassageiro, String nome, Calendar dtNascimento, Sexo sexo) {
		super();
		this.codPassageiro = codPassageiro;
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.sexo = sexo;
	}

	public int getCodPassageiro() {
		return codPassageiro;
	}

	public void setCodPassageiro(int codPassageiro) {
		this.codPassageiro = codPassageiro;
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

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	
}
