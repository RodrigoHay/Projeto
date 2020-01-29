import java.sql.SQLException;

public class ClienteTeste {
	
	
	public static void ClienteTeste() throws SQLException {
		ConnectionSingleton testeConexao = ConnectionSingleton.getInstancy();
		
		System.out.println("Deletando o ID 5");
		testeConexao.alteraBD("DELETE FROM country WHERE country_id= 5");
		
		System.out.println("Imprimindo");
		testeConexao.getDados();
		System.out.println("Foram impressos");
		
	}
	
}
