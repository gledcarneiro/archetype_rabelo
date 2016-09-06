#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * EcfPosicaoComponentes generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "ecf_posicao_componentes", catalog = "retaguarda")
public class EcfPosicaoComponentes extends GenericDomain {
	@Column(name = "NOME_CAIXA", length = 30)
	private String nomeCaixa;

	@Column(name = "ID_GERADO_CAIXA")
	private Integer idGeradoCaixa;

	@Column(name = "ID_EMPRESA")
	private Integer idEmpresa;

	@Column(name = "NOME", length = 100)
	private String nome;

	@Column(name = "ALTURA")
	private Integer altura;

	@Column(name = "LARGURA")
	private Integer largura;

	@Column(name = "TOPO")
	private Integer topo;

	@Column(name = "ESQUERDA")
	private Integer esquerda;

	@Column(name = "TAMANHO_FONTE")
	private Integer tamanhoFonte;

	@Column(name = "TEXTO", length = 250)
	private String texto;

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_SINCRONIZACAO", length = 10)
	private Date dataSincronizacao;

	@Column(name = "HORA_SINCRONIZACAO", length = 8)
	private String horaSincronizacao;

	@Column(name = "HASH_TRIPA", length = 32)
	private String hashTripa;

	@Column(name = "HASH_INCREMENTO")
	private Integer hashIncremento;

	public EcfPosicaoComponentes() {
	}

	public EcfPosicaoComponentes(String nomeCaixa, Integer idGeradoCaixa, Integer idEmpresa, String nome,
			Integer altura, Integer largura, Integer topo, Integer esquerda, Integer tamanhoFonte, String texto,
			Date dataSincronizacao, String horaSincronizacao, String hashTripa, Integer hashIncremento) {
		this.nomeCaixa = nomeCaixa;
		this.idGeradoCaixa = idGeradoCaixa;
		this.idEmpresa = idEmpresa;
		this.nome = nome;
		this.altura = altura;
		this.largura = largura;
		this.topo = topo;
		this.esquerda = esquerda;
		this.tamanhoFonte = tamanhoFonte;
		this.texto = texto;
		this.dataSincronizacao = dataSincronizacao;
		this.horaSincronizacao = horaSincronizacao;
		this.hashTripa = hashTripa;
		this.hashIncremento = hashIncremento;
	}

	public String getNomeCaixa() {
		return this.nomeCaixa;
	}

	public void setNomeCaixa(String nomeCaixa) {
		this.nomeCaixa = nomeCaixa;
	}

	public Integer getIdGeradoCaixa() {
		return this.idGeradoCaixa;
	}

	public void setIdGeradoCaixa(Integer idGeradoCaixa) {
		this.idGeradoCaixa = idGeradoCaixa;
	}

	public Integer getIdEmpresa() {
		return this.idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getAltura() {
		return this.altura;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
	}

	public Integer getLargura() {
		return this.largura;
	}

	public void setLargura(Integer largura) {
		this.largura = largura;
	}

	public Integer getTopo() {
		return this.topo;
	}

	public void setTopo(Integer topo) {
		this.topo = topo;
	}

	public Integer getEsquerda() {
		return this.esquerda;
	}

	public void setEsquerda(Integer esquerda) {
		this.esquerda = esquerda;
	}

	public Integer getTamanhoFonte() {
		return this.tamanhoFonte;
	}

	public void setTamanhoFonte(Integer tamanhoFonte) {
		this.tamanhoFonte = tamanhoFonte;
	}

	public String getTexto() {
		return this.texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getDataSincronizacao() {
		return this.dataSincronizacao;
	}

	public void setDataSincronizacao(Date dataSincronizacao) {
		this.dataSincronizacao = dataSincronizacao;
	}

	public String getHoraSincronizacao() {
		return this.horaSincronizacao;
	}

	public void setHoraSincronizacao(String horaSincronizacao) {
		this.horaSincronizacao = horaSincronizacao;
	}

	public String getHashTripa() {
		return this.hashTripa;
	}

	public void setHashTripa(String hashTripa) {
		this.hashTripa = hashTripa;
	}

	public Integer getHashIncremento() {
		return this.hashIncremento;
	}

	public void setHashIncremento(Integer hashIncremento) {
		this.hashIncremento = hashIncremento;
	}
}