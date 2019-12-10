package mysample;

public class StartMoveFileWithRenameTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arquivo1 = args[0].toString();
		String arquivo2 = args[1].toString();
		
		System.out.println("Arquivo origem " + args[0].toString());
		System.out.println("Arquivo destino " + args[1].toString());
		
		TesteMoverArquivoImpl move = new TesteMoverArquivoImpl();
		move.moverArquivo(arquivo1, arquivo2);

	}

}
