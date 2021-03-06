#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * EcfFuncionario generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "ecf_funcionario", catalog = "retaguarda")
public class EcfFuncionario extends GenericDomain {
	@Column(name = "CODIGO", length = 10)
	private String codigo;

	@Column(name = "CPF", length = 11)
	private String cpf;

	@Column(name = "NOME", length = 100)
	private String nome;

	@Column(name = "FUNCAO", length = 30)
	private String funcao;

	@Column(name = "TELEFONE", length = 10)
	private String telefone;

	@Column(name = "CELULAR", length = 10)
	private String celular;

	@Column(name = "EMAIL", length = 250)
	private String email;

	@Column(name = "COMISSAO_VISTA", precision = 18, scale = 6)
	private BigDecimal comissaoVista;

	@Column(name = "COMISSAO_PRAZO", precision = 18, scale = 6)
	private BigDecimal comissaoPrazo;

	@Column(name = "NIVEL_AUTORIZACAO", length = 1)
	private Character nivelAutorizacao;

	@Column(name = "HASH_TRIPA", length = 32)
	private String hashTripa;

	@Column(name = "HASH_INCREMENTO")
	private Integer hashIncremento;

	public EcfFuncionario() {
	}

	public EcfFuncionario(String codigo, String cpf, String nome, String funcao, String telefone, String celular,
			String email, BigDecimal comissaoVista, BigDecimal comissaoPrazo, Character nivelAutorizacao,
			String hashTripa, Integer hashIncremento) {
		this.codigo = codigo;
		this.cpf = cpf;
		this.nome = nome;
		this.funcao = funcao;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.comissaoVista = comissaoVista;
		this.comissaoPrazo = comissaoPrazo;
		this.nivelAutorizacao = nivelAutorizacao;
		this.hashTripa = hashTripa;
		this.hashIncremento = hashIncremento;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return this.funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getComissaoVista() {
		return comissaoVista;
	}

	public void setComissaoVista(BigDecimal comissaoVista) {
		this.comissaoVista = comissaoVista;
	}

	public BigDecimal getComissaoPrazo() {
		return comissaoPrazo;
	}

	public void setComissaoPrazo(BigDecimal comissaoPrazo) {
		this.comissaoPrazo = comissaoPrazo;
	}

	public Character getNivelAutorizacao() {
		return this.nivelAutorizacao;
	}

	public void setNivelAutorizacao(Character nivelAutorizacao) {
		this.nivelAutorizacao = nivelAutorizacao;
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
