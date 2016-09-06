#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * EcfAliquotas generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "ecf_aliquotas", catalog = "retaguarda")
public class EcfAliquotas extends GenericDomain {
	@Column(name = "TOTALIZADOR_PARCIAL", length = 10)
	private String totalizadorParcial;

	@Column(name = "ECF_ICMS_ST", length = 4)
	private String ecfIcmsSt;

	@Column(name = "PAF_P_ST", length = 1)
	private Character pafPSt;

	@Column(name = "Codigo", length = 3)
	private String codigo;

	@Column(name = "HASH_TRIPA", length = 32)
	private String hashTripa;

	@Column(name = "HASH_INCREMENTO")
	private Integer hashIncremento;

	public String getTotalizadorParcial() {
		return totalizadorParcial;
	}

	public void setTotalizadorParcial(String totalizadorParcial) {
		this.totalizadorParcial = totalizadorParcial;
	}

	public String getEcfIcmsSt() {
		return ecfIcmsSt;
	}

	public void setEcfIcmsSt(String ecfIcmsSt) {
		this.ecfIcmsSt = ecfIcmsSt;
	}

	public Character getPafPSt() {
		return pafPSt;
	}

	public void setPafPSt(Character pafPSt) {
		this.pafPSt = pafPSt;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getHashTripa() {
		return hashTripa;
	}

	public void setHashTripa(String hashTripa) {
		this.hashTripa = hashTripa;
	}

	public Integer getHashIncremento() {
		return hashIncremento;
	}

	public void setHashIncremento(Integer hashIncremento) {
		this.hashIncremento = hashIncremento;
	}

}
