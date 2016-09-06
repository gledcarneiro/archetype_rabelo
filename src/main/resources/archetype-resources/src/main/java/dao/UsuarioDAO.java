#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import ${package}.domain.Usuario;
import ${package}.util.HibernateUtil;

public class UsuarioDAO extends GenericDAO<Usuario> {
	public Usuario autenticar(String login, String senha) {
		Session sessao = HibernateUtil.getFabricaSessoes().openSession();

		try {
			Criteria consulta = sessao.createCriteria(Usuario.class);
			// consulta.createAlias("usuario", "usr");
			consulta.add(Restrictions.eq("login", login));

			SimpleHash hash = new SimpleHash("md5", senha);
			consulta.add(Restrictions.eq("senha", hash.toHex()));

			Usuario resultado = (Usuario) consulta.uniqueResult();

			return resultado;

		} catch (

		RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}

}
