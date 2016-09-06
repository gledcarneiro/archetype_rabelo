#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("smartserver")
public class ${artifactId}Service {
	@GET
	public String exibir(){
		return "TEste REst";
	}
}
