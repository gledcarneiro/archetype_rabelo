#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.google.gson.Gson;

import ${package}.dao.UsuarioDAO;
import ${package}.domain.Usuario;

@Path("usuario")
public class UsuarioService {
	// http://localhost:8080/${artifactId}/rest/usuario
	@GET
	public String listar() {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		List<Usuario> usuarios = usuarioDAO.listar();
		
		System.out.println(usuarios.size());
		
		Gson  gson = new Gson();
		String json = gson.toJson(usuarios);
		
		System.out.println("json obtido ->" + json);
		
		return json;
	}

}
