#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao;

import java.util.Date;

import org.junit.Test;

import ${package}.dao.CargoDAO;
import ${package}.dao.ColaboradorDAO;
import ${package}.dao.PessoaDAO;
import ${package}.dao.SetorDAO;
import ${package}.domain.Cargo;
import ${package}.domain.Colaborador;
import ${package}.domain.Pessoa;
import ${package}.domain.Setor;

public class ColaboradorDAOTest {
   @Test
   public void salvar(){
	   Colaborador colaborador = new Colaborador();
	   
	   CargoDAO cargoDAO = new CargoDAO();
	   Cargo cargo = cargoDAO.buscar(1);
	   
	   SetorDAO setorDAO = new SetorDAO();
	   Setor idDepartamento = setorDAO.buscar(1);
	   
	   PessoaDAO pessoaDAO = new PessoaDAO();
	   Pessoa pessoa = pessoaDAO.buscar(1);
	   
	   colaborador.setCargo(cargo);
	   colaborador.setIdDepartamento(idDepartamento);
	   colaborador.setPessoa(pessoa);
	   colaborador.setObservacoes("TESTE DE COLABORADOR");
	   colaborador.setDataCadastro(new Date());
	   
	   ColaboradorDAO colaboradorDAO = new ColaboradorDAO();
	   colaboradorDAO.salvar(colaborador);	      
   }
}
