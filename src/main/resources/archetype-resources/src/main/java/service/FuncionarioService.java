#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.google.gson.Gson;

import ${package}.dao.FuncionarioDAO;
import ${package}.domain.Funcionario;

@Path("funcionario")
public class FuncionarioService {
	// http://localhost:8080/${artifactId}/rest/funcionario
	@GET
	public String listar() {
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		List<Funcionario> funcionarios = funcionarioDAO.listar();

		Gson gson = new Gson();
		String json = gson.toJson(funcionarios);

		return json;
	}

	// http://localhost:8080/${artifactId}/rest/funcionario/1
	@GET
	@Path("{id}")
	public String buscar(@PathParam("id") int id) {
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(id);

		Gson gson = new Gson();
		String json = gson.toJson(funcionario);

		return json;

	}

}
