#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao;

import org.junit.Test;

import ${package}.dao.PapelDAO;
import ${package}.domain.Papel;

public class PapelDAOTest {
	@Test
	public void salvar() {
		Papel papel = new Papel();
		papel.setNome("USARIO");
		papel.setDescricao("USUARIO SIMPLES DE SISTEMA");

		PapelDAO papelDAO = new PapelDAO();
		papelDAO.salvar(papel);
	}
}
