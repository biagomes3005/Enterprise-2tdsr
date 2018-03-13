package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="T_VEICULO")
@SequenceGenerator(name="veiculo", sequenceName="SQ_T_VEICULO",allocationSize=1)
public class Veiculo {
	
	@Id
	@Column(name="cd_veiculo", nullable=false)
	@GeneratedValue(generator="veiculo",strategy=GenerationType.SEQUENCE)
	private int codVeiculo;

	@Column(name="DS_PLACA", nullable=false)
	private String placa;
	
	@Column(name="DS_COR", nullable=false)
	private String cor;
	
	@Column(name="NR_ANO")
	private int ano;
	
	
	public Veiculo(int codVeiculo, String placa, String cor, int ano) {
		super();
		this.codVeiculo = codVeiculo;
		this.placa = placa;
		this.cor = cor;
		this.ano = ano;
	}

	public int getCodVeiculo() {
		return codVeiculo;
	}

	public void setCodVeiculo(int codVeiculo) {
		this.codVeiculo = codVeiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	
}
