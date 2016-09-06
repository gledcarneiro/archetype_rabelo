#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * EcfVendaPagamento generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "ecf_venda_pagamento", catalog = "retaguarda")
public class EcfVendaPagamento extends GenericDomain {
	private EcfTipoPagamento ecfTipoPagamento;
	private EcfVendaCabecalho ecfVendaCabecalho;
	private String nomeCaixa;
	private Integer idGeradoCaixa;
	private Integer idEmpresa;
	private String serieEcf;
	private Integer coo;
	private Integer ccf;
	private Integer gnf;
	private BigDecimal valor;
	private BigDecimal valorSaque;
	private BigDecimal valorDesconto;
	private String numeroCartao;
	private String nsu;
	private String autorizacao;
	private Character estorno;
	private String rede;
	private Character cartaoDc;
	private String parceladoPor;
	private Integer qtdParcelas;
	private Character sincronizado;
	private Date dataSincronizacao;
	private String horaSincronizacao;
	private String hashTripa;
	private Integer hashIncremento;
	private String nsuHost;
	private String nsuSitef;

	public EcfVendaPagamento() {
	}

	public EcfVendaPagamento(EcfTipoPagamento ecfTipoPagamento, EcfVendaCabecalho ecfVendaCabecalho) {
		this.ecfTipoPagamento = ecfTipoPagamento;
		this.ecfVendaCabecalho = ecfVendaCabecalho;
	}

	public EcfVendaPagamento(EcfTipoPagamento ecfTipoPagamento, EcfVendaCabecalho ecfVendaCabecalho, String nomeCaixa,
			Integer idGeradoCaixa, Integer idEmpresa, String serieEcf, Integer coo, Integer ccf, Integer gnf,
			BigDecimal valor, BigDecimal valorSaque, BigDecimal valorDesconto, String numeroCartao, String nsu,
			String autorizacao, Character estorno, String rede, Character cartaoDc, String parceladoPor,
			Integer qtdParcelas, Character sincronizado, Date dataSincronizacao, String horaSincronizacao,
			String hashTripa, Integer hashIncremento, String nsuHost, String nsuSitef) {
		this.ecfTipoPagamento = ecfTipoPagamento;
		this.ecfVendaCabecalho = ecfVendaCabecalho;
		this.nomeCaixa = nomeCaixa;
		this.idGeradoCaixa = idGeradoCaixa;
		this.idEmpresa = idEmpresa;
		this.serieEcf = serieEcf;
		this.coo = coo;
		this.ccf = ccf;
		this.gnf = gnf;
		this.valor = valor;
		this.valorSaque = valorSaque;
		this.valorDesconto = valorDesconto;
		this.numeroCartao = numeroCartao;
		this.nsu = nsu;
		this.autorizacao = autorizacao;
		this.estorno = estorno;
		this.rede = rede;
		this.cartaoDc = cartaoDc;
		this.parceladoPor = parceladoPor;
		this.qtdParcelas = qtdParcelas;
		this.sincronizado = sincronizado;
		this.dataSincronizacao = dataSincronizacao;
		this.horaSincronizacao = horaSincronizacao;
		this.hashTripa = hashTripa;
		this.hashIncremento = hashIncremento;
		this.nsuHost = nsuHost;
		this.nsuSitef = nsuSitef;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ECF_TIPO_PAGAMENTO", nullable = false)
	public EcfTipoPagamento getEcfTipoPagamento() {
		return this.ecfTipoPagamento;
	}

	public void setEcfTipoPagamento(EcfTipoPagamento ecfTipoPagamento) {
		this.ecfTipoPagamento = ecfTipoPagamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ECF_VENDA_CABECALHO", nullable = false)
	public EcfVendaCabecalho getEcfVendaCabecalho() {
		return this.ecfVendaCabecalho;
	}

	public void setEcfVendaCabecalho(EcfVendaCabecalho ecfVendaCabecalho) {
		this.ecfVendaCabecalho = ecfVendaCabecalho;
	}

	@Column(name = "NOME_CAIXA", length = 30)
	public String getNomeCaixa() {
		return this.nomeCaixa;
	}

	public void setNomeCaixa(String nomeCaixa) {
		this.nomeCaixa = nomeCaixa;
	}

	@Column(name = "ID_GERADO_CAIXA")
	public Integer getIdGeradoCaixa() {
		return this.idGeradoCaixa;
	}

	public void setIdGeradoCaixa(Integer idGeradoCaixa) {
		this.idGeradoCaixa = idGeradoCaixa;
	}

	@Column(name = "ID_EMPRESA")
	public Integer getIdEmpresa() {
		return this.idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	@Column(name = "SERIE_ECF", length = 20)
	public String getSerieEcf() {
		return this.serieEcf;
	}

	public void setSerieEcf(String serieEcf) {
		this.serieEcf = serieEcf;
	}

	@Column(name = "COO")
	public Integer getCoo() {
		return this.coo;
	}

	public void setCoo(Integer coo) {
		this.coo = coo;
	}

	@Column(name = "CCF")
	public Integer getCcf() {
		return this.ccf;
	}

	public void setCcf(Integer ccf) {
		this.ccf = ccf;
	}

	@Column(name = "GNF")
	public Integer getGnf() {
		return this.gnf;
	}

	public void setGnf(Integer gnf) {
		this.gnf = gnf;
	}

	@Column(name = "VALOR", precision = 18, scale = 6)
	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Column(name = "VALOR_SAQUE", precision = 18, scale = 6)
	public BigDecimal getValorSaque() {
		return this.valorSaque;
	}

	public void setValorSaque(BigDecimal valorSaque) {
		this.valorSaque = valorSaque;
	}

	@Column(name = "VALOR_DESCONTO", precision = 18, scale = 6)
	public BigDecimal getValorDesconto() {
		return this.valorDesconto;
	}

	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	@Column(name = "NUMERO_CARTAO", length = 16)
	public String getNumeroCartao() {
		return this.numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	@Column(name = "NSU", length = 30)
	public String getNsu() {
		return this.nsu;
	}

	public void setNsu(String nsu) {
		this.nsu = nsu;
	}

	@Column(name = "AUTORIZACAO", length = 30)
	public String getAutorizacao() {
		return this.autorizacao;
	}

	public void setAutorizacao(String autorizacao) {
		this.autorizacao = autorizacao;
	}

	@Column(name = "ESTORNO", length = 1)
	public Character getEstorno() {
		return this.estorno;
	}

	public void setEstorno(Character estorno) {
		this.estorno = estorno;
	}

	@Column(name = "REDE", length = 30)
	public String getRede() {
		return this.rede;
	}

	public void setRede(String rede) {
		this.rede = rede;
	}

	@Column(name = "CARTAO_DC", length = 1)
	public Character getCartaoDc() {
		return this.cartaoDc;
	}

	public void setCartaoDc(Character cartaoDc) {
		this.cartaoDc = cartaoDc;
	}

	@Column(name = "PARCELADO_POR", length = 1)
	public String getParceladoPor() {
		return this.parceladoPor;
	}

	public void setParceladoPor(String parceladoPor) {
		this.parceladoPor = parceladoPor;
	}

	@Column(name = "QTD_PARCELAS")
	public Integer getQtdParcelas() {
		return this.qtdParcelas;
	}

	public void setQtdParcelas(Integer qtdParcelas) {
		this.qtdParcelas = qtdParcelas;
	}

	@Column(name = "SINCRONIZADO", length = 1)
	public Character getSincronizado() {
		return this.sincronizado;
	}

	public void setSincronizado(Character sincronizado) {
		this.sincronizado = sincronizado;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_SINCRONIZACAO", length = 10)
	public Date getDataSincronizacao() {
		return this.dataSincronizacao;
	}

	public void setDataSincronizacao(Date dataSincronizacao) {
		this.dataSincronizacao = dataSincronizacao;
	}

	@Column(name = "HORA_SINCRONIZACAO", length = 8)
	public String getHoraSincronizacao() {
		return this.horaSincronizacao;
	}

	public void setHoraSincronizacao(String horaSincronizacao) {
		this.horaSincronizacao = horaSincronizacao;
	}

	@Column(name = "HASH_TRIPA", length = 32)
	public String getHashTripa() {
		return this.hashTripa;
	}

	public void setHashTripa(String hashTripa) {
		this.hashTripa = hashTripa;
	}

	@Column(name = "HASH_INCREMENTO")
	public Integer getHashIncremento() {
		return this.hashIncremento;
	}

	public void setHashIncremento(Integer hashIncremento) {
		this.hashIncremento = hashIncremento;
	}

	@Column(name = "NSU_HOST", length = 30)
	public String getNsuHost() {
		return this.nsuHost;
	}

	public void setNsuHost(String nsuHost) {
		this.nsuHost = nsuHost;
	}

	@Column(name = "NSU_SITEF", length = 30)
	public String getNsuSitef() {
		return this.nsuSitef;
	}

	public void setNsuSitef(String nsuSitef) {
		this.nsuSitef = nsuSitef;
	}

}
