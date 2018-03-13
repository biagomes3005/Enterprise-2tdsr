package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_CORRIDA")
@SequenceGenerator(name="corrida" , sequenceName="SQ_T_CORRIDA", allocationSize=1)
public class Corrida {
	
	@Id
	@Column(name="CD_CORRIDA", nullable=false)
	@GeneratedValue(generator="corrida",strategy=GenerationType.SEQUENCE)
	private int cdCorrida;
	
	@Column(name="DS_ORIGEM")
	private String origem;
	
	@Column(name="DS_DESTINO")
	private String destino;
	
	@Column(name="DT_CORRIDA")
	@Temporal(TemporalType.DATE)
	private Calendar dtCorrida;
	
	@Column(name="VL_CORRIDA", nullable=false)
	private double vlCorrida;

	public Corrida(int cdCorrida, String origem, String destino, Calendar dtCorrida, double vlCorrida) {
		super();
		this.cdCorrida = cdCorrida;
		this.origem = origem;
		this.destino = destino;
		this.dtCorrida = dtCorrida;
		this.vlCorrida = vlCorrida;
	}

	public int getCdCorrida() {
		return cdCorrida;
	}

	public void setCdCorrida(int cdCorrida) {
		this.cdCorrida = cdCorrida;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Calendar getDtCorrida() {
		return dtCorrida;
	}

	public void setDtCorrida(Calendar dtCorrida) {
		this.dtCorrida = dtCorrida;
	}

	public double getVlCorrida() {
		return vlCorrida;
	}

	public void setVlCorrida(double vlCorrida) {
		this.vlCorrida = vlCorrida;
	}
	

}
