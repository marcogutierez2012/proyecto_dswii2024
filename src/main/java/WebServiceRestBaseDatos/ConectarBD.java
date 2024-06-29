package WebServiceRestBaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConectarBD {

	//declaramos las variables
	private static String url = "jdbc:mysql://localhost:3306/bdservicioBiblico2024";
	private static String usuario = "root";
	private static String password = "";
	private static Connection con;
	//creamos el metodo
	public static Connection getConexion(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,usuario,password);
			if(con!=null){
				JOptionPane.showMessageDialog(null, "Conexion Exitosa!");
			}else{
				System.out.println("No se pudo conectar a la BD");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
