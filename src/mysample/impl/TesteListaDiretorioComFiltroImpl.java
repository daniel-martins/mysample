package mysample.impl;

import java.io.File;
import java.io.FileFilter;

public class TesteListaDiretorioComFiltroImpl {

	public void listaDirtorio(String diretorio) {
		// TODO Auto-generated method stub
		
		File f = new File(diretorio); //-- O diretório
        //-- Lista de arquivos .java...
        File[] files = f.listFiles (new FileFilter() {
            public boolean accept(File pathname) {
                return pathname.getName().toLowerCase().endsWith(".txt");
            }
           
        });
        
        System.out.println("Quantidade arquivos txt na pasta " + files.length);
        
        for (int i = 0; i < files.length; ++i) {
            System.out.println (files[i]);
        }
		
	}

}
