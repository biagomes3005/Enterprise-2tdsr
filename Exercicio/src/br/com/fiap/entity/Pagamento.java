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
@Table(name="T_PAGAMENTO")
@SequenceGenerator(name="pagamento", sequenceName="SQ_T_PAGAMENTO", allocationSize=1)
public class Pagamento {

	@Id
	@Column(name="CD_PAGAMENTO", nullable=false)
	@GeneratedValue(generator="pagamento",strategy=GenerationType.SEQUENCE)
	private int codPagamento;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_PAGAMENTO", nullable=false)
	private Calendar dtPagamento;
	
	@Column(name="VL_PAGAMENTO", nullable=false)
	private double vlPagamento;
	
	@Column(name="DS_FORMA_PAGAMENTO", nullable=false)
	private String formaPagamento;

	public Pagamento(int codPagamento, Calendar dtPagamento, double vlPagamento, String formaPagamento) {
		super();
		this.codPagamento = codPagamento;
		this.dtPagamento = dtPagamento;
		this.vlPagamento = vlPagamento;
		this.formaPagamento = formaPagamento;
	}

	public int getCodPagamento() {
		return codPagamento;
	}

	public void setCodPagamento(int codPagamento) {
		this.codPagamento = codPagamento;
	}

	public Calendar getDtPagamento() {
		return dtPagamento;
	}

	public void setDtPagamento(Calendar dtPagamento) {
		this.dtPagamento = dtPagamento;
	}

	public double getVlPagamento() {
		return vlPagamento;
	}

	public void setVlPagamento(double vlPagamento) {
		this.vlPagamento = vlPagamento;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	
}
