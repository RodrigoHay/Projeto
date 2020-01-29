/*	Faz a conexão com a base de dados e retorna as informações que precisa
 * Falta melhorar as frases para executar e retornar as informações mais precisamente
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ConnectionSingleton {

//	+--------------------------------------------------------------------------------------------------------------------------------------+
//  		Faz a conexão utilizando Singleton Pattern
//	+--------------------------------------------------------------------------------------------------------------------------------------+
	
	// Variaveis
	private Connection conexao;
	private String DB_URL = "jdbc:mysql://localhost/exercicios";
	private String USER = "root";
	private String PASS = "";
	private static ConnectionSingleton instancy;
	ArrayList<String> bd = new ArrayList<String>();
	static Statement stmt = null;
	

	private ConnectionSingleton() {
		try {
			this.conexao = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conexao.createStatement();
			//JOptionPane.showMessageDialog(null, "Conexão ok!"); //Retirei isso porque era chato aparecer em todo teste

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}
	
	public static ConnectionSingleton getInstancy() {
		if(instancy == null) {
			instancy = new ConnectionSingleton();
		}
		return instancy;
	}
	
	
	public Connection getConexao() {
		return this.conexao;
		
	}
	
//	+--------------------------------------------------------------------------------------------------------------------------------------+
//					Executa o que é pedido mas ainda precisa ser melhorado
//	+--------------------------------------------------------------------------------------------------------------------------------------+
	
	//Aqui conforme a string que recebe executa na tabela ex. ("DELETE FROM country WHERE country_id= 5")
	public static void alteraBD(String alteraBancoDeDados) throws SQLException { // Altera os dados conforme a string de comando (SELECT * FROM country) por exemplo
		stmt.executeUpdate(alteraBancoDeDados);
	}
	
	
	//Retorna os dados e coloca numa ArrayList / ainda falta melhorar para puxar só aqui-lo que preciso
	public void getDados() throws SQLException { //Imprime todos os dados
		
		ResultSet rs= stmt.executeQuery("SELECT * FROM country");

		while(rs.next()) {
//		System.out.print(rs.getString("country_id"));
//		System.out.print(", " + rs.getString("country"));
//		System.out.println();
			
		bd.add(rs.getString("country_id")); // inserere as informações no arraylist
		bd.add(rs.getString("country"));
		}
	}
	
	//Desponibiliza a arraylist com as informações
	public ArrayList<String> getBD() {
		return bd;
	}

}
