package mysample;

import mysample.impl.TesteHashMap;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TesteHashMap t = new TesteHashMap();
		
			try {
				if(args.length == 2) {
					String param1 = args[0];
					String param2 = args[1];
					System.out.println("Teste " + param1 + " " + param2);
				}else {
				    System.out.println(args[0]);
				    
				    t.caregarDadosnoHashMap(args[0]);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Erro ao processar parametro "+ e);
			}
	    
	}

}
