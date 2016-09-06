#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao;

import java.util.List;

import org.junit.Test;

import ${package}.domain.SituacaoPessoa;

public class SituacaoPessoaDAOTest {
	@Test
	public void listar(){
		SituacaoPessoaDAO situacaoPessoaDAO = new SituacaoPessoaDAO();
		List<SituacaoPessoa> resultado = situacaoPessoaDAO.listar();
		
		System.out.println("total de Situacoe cadastrada " + resultado.size());		
	}
}
