#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.bean;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.model.chart.PieChartModel;

import ${package}.websocket.Apuracao;

@Named
@ViewScoped
public class DadosBean {

	@Inject
	private Apuracao apuracao;

	private PieChartModel dados = new PieChartModel();;

	public PieChartModel getDados() {

		System.out.println("Montando o gr�fico...");

		String[][] ultimosDados = apuracao.getUltimosDados();

		for (String[] info : ultimosDados) {
			dados.set(info[0], Integer.parseInt(info[1]));
		}

		dados.setTitle("Dados de apura��o");
		dados.setLegendPosition("w");
		dados.setShowDataLabels(true);
		return dados;
	}

}
