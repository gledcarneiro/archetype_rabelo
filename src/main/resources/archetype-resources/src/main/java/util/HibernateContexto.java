#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class HibernateContexto implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		HibernateUtil.getFabricaSessoes().close();
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		HibernateUtil.getFabricaSessoes();
	}

}
