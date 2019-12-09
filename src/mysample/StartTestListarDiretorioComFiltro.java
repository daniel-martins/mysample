package mysample;

import mysample.impl.TesteListaDiretorioComFiltroImpl;

public class StartTestListarDiretorioComFiltro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String diretorio = args[0].toString();
		
		TesteListaDiretorioComFiltroImpl list = new TesteListaDiretorioComFiltroImpl();
		list.listaDirtorio(diretorio);
		
		
		

	}

}
