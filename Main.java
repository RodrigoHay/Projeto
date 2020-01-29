import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {

		//ClienteTeste.ClienteTeste(); // Chama a classe ClienteTeste que eu desabilitei porque imprimir tudo 2 vezes
		
		System.out.println("Chamando a classe InfoArray");
		
		InfoArray.buscaDados();
		
//		System.out.println("Voltou para main");
//		ConnectionSingleton conSing = ConnectionSingleton.getInstancy(); // Objeto da classe singleton
//		//Connection conexao = conSing.getConexao();
//		Scanner stdIn = new Scanner(System.in);
//
//		System.out.println("Insira um país");
//		String resposta = stdIn.nextLine();
//		conSing.alteraBD("UPDATE country SET country = '" + resposta + "' WHERE country_id = 7");

	}

}
