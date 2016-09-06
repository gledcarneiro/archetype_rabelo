#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.util;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import org.omnifaces.util.Faces;

import ${package}.bean.AutenticacaoBean;
import ${package}.domain.Usuario;

@SuppressWarnings("serial")
public class AutenticacaoListener implements PhaseListener {

	@Override
	public void afterPhase(PhaseEvent event) {
		// System.out.println("antes da fase.: " + event.getPhaseId());
		String paginaAtual = Faces.getViewId();
		boolean ehPaginadeAutenticacao = paginaAtual.contains("autenticacao.xhtml");

		if (!ehPaginadeAutenticacao) {
			AutenticacaoBean autenticacaoBean = Faces.getSessionAttribute("autenticacaoBean");

			if (autenticacaoBean == null) {
				Faces.navigate("/pages/autenticacao.xhtml");
				return;
			}

			Usuario usuario = autenticacaoBean.getUsuarioLogado();
			if (usuario == null) {
				Faces.navigate("/pages/autenticacao.xhtml");
				return;
			}

		}

	}

	@Override
	public void beforePhase(PhaseEvent event) {
		// System.out.println("depois da fase: " + event.getPhaseId());
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.RESTORE_VIEW;
	}

}
