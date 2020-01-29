import java.sql.SQLException;
import java.util.ArrayList;

public class InfoArray {

	public static void buscaDados() throws SQLException {
		ArrayList bd = new ArrayList();

		ConnectionSingleton dadosBD = ConnectionSingleton.getInstancy();

			dadosBD.getDados();

			System.out.println("imprime a bd " + dadosBD.getBD()); // Manda imprimir todos os dados da arraylist
			bd.addAll(dadosBD.getBD());

			System.out.println("contains " + bd.contains("Brasolia"));  //verifica em todo array se tem uma determinada informação

			System.out.println("Impressão por get(i)");
			for(int i = 0; i<bd.size();i++) {
				System.out.println(bd.get(i));  //Pega um determinado dado
				
				if(bd.get(i).equals("Brasil")) { 				//Fez uma busca nos itens e achou o Brasil
					System.out.println("Achou o Brasil");
				}
			}
			
	}

}
