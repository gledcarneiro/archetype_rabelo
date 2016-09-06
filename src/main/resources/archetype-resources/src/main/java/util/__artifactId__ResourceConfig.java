#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.util;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("rest")
public class ${artifactId}ResourceConfig extends ResourceConfig {
	public ${artifactId}ResourceConfig() {
		packages("${package}.service");
	}
}
