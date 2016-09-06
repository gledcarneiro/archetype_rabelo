#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.google.gson.Gson;

import ${package}.dao.EcfAliquotasDAO;
import ${package}.domain.EcfAliquotas;

@Path("aliquota")
public class AliquotaService {
	// http://localhost:8080/${artifactId}/rest/aliquota
	@GET
	public String listar() {
		EcfAliquotasDAO aliquotaDAO = new EcfAliquotasDAO();
		List<EcfAliquotas> aliquotas = aliquotaDAO.listar();
		
		Gson gson = new Gson();
		String json = gson.toJson(aliquotas);
		
		return json;
	}
	
	// http://localhost:8080/${artifactId}/rest/aliquota/10
	@GET
	@Path("{id}")
	public String buscar(@PathParam("id") int id){
		EcfAliquotasDAO aliquotaDAO = new EcfAliquotasDAO();
		EcfAliquotas aliquota = aliquotaDAO.buscar(id);

		Gson gson = new Gson();
		String json = gson.toJson(aliquota);
		
		return json;
		
	}
}
