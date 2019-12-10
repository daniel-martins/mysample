package mysample;

import java.io.File;

public class TesteMoverArquivoImpl {

	public void moverArquivo(String arquivo1, String arquivo2) {
		// TODO Auto-generated method stub
		
		File file1 = new File(arquivo1);
		File file2 = new File(arquivo2);
		
		if(file1.renameTo(file2)) {
			System.out.println("Arquivo movido de " + file1.toString()+ " para " + file2.toString());
			//file1.renameTo(file2);
		} else {
			System.out.println(file1.toString() + " Não foi possivel mover");
		}
		
		
		
		
	}


}
