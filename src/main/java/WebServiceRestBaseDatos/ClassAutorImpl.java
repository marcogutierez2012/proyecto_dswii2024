package WebServiceRestBaseDatos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClassAutorImpl implements IAutor{

	public void RegistrarAutor(ClassAutor clasautor) {
		String sql="insert into tbl_autor(idautor,nombre,descrip) values(null,?,?)";
		//declaramos la interface
		PreparedStatement ps=null;
		//asignamos la conexion cadena
		try {
			ps=ConectarBD.getConexion().prepareStatement(sql);
			ps.setString(1, clasautor.getNomautor());
			ps.setString(2, clasautor.getDescrip());
			//realizamos la ejecucion
			int x=ps.executeUpdate();
			//aplicamos una condicion
			if(x>0){
				//imprimimos un mensaje por pantalla
				System.out.println("DATO REGISTRADO EN LA BD");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void ActualizarAutor(ClassAutor clasautor) {
		String sql="update tbl_autor set nombre=?,descrip=? where idautor=?";
		//declaramos la interface
		PreparedStatement ps=null;
		//asignamos la conexion cadena
		try {
			ps=ConectarBD.getConexion().prepareStatement(sql);
			ps.setString(1, clasautor.getNomautor());
			ps.setString(2, clasautor.getDescrip());
			ps.setInt(3, clasautor.getIdautor());
			//realizamos la ejecucion
			int y=ps.executeUpdate();
			//aplicamos una condicion
			if(y>0){
				//imprimimos un mensaje por pantalla
				System.out.println("DATO ACTUALIZADO EN LA BD");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void EliminarAutor(ClassAutor clasautor) {
		String sql="delete from tbl_autor where idautor=?";
		//declaramos la interface
				PreparedStatement ps=null;
				//asignamos la conexion cadena
				try {
					ps=ConectarBD.getConexion().prepareStatement(sql);
					ps.setInt(1, clasautor.getIdautor());
					//realizamos la ejecucion
					int x=ps.executeUpdate();
					//aplicamos una condicion
					if(x>0){
						//imprimimos un mensaje por pantalla
						System.out.println("DATO ELIMINADO DE LA BD");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

	public ClassAutor BuscarAutor(ClassAutor clasautor) {
		
		ClassAutor autorencontrado=new ClassAutor();
		String sql="select * from tbl_autor where idautor=?";
		//declaramos la interface
		PreparedStatement ps=null;
		ResultSet rs=null;
		//asignamos la conexion cadena
		try {
			ps=ConectarBD.getConexion().prepareStatement(sql);
			ps.setInt(1, clasautor.getIdautor());
			
			rs = ps.executeQuery();
			
			if (rs.next()) {
		            // Si encontramos resultados, creamos un nuevo objeto ClassAutor
		            autorencontrado.setIdautor(rs.getInt("idautor"));
		            autorencontrado.setNomautor(rs.getString("nombre"));
		            autorencontrado.setDescrip(rs.getString("descrip"));
		    } else {
		            System.out.println("No se encontró ningún autor con ese nombre en la BD");
		   }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
	        // Cerramos recursos en el orden inverso de apertura para evitar fugas de memoria
	        try {
	            if (rs != null) rs.close();
	            if (ps != null) ps.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
		return autorencontrado;
	}

	public List<ClassAutor> ListadoAutor() {
		String sql="select * from tbl_autor";
		//declaramos la interface
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<ClassAutor> listaAutores = new ArrayList<ClassAutor>();
		try {
			ps=ConectarBD.getConexion().prepareStatement(sql);			
			rs = ps.executeQuery();
			
	        while (rs.next()) {
	            ClassAutor lista = new ClassAutor();
	            lista.setIdautor(rs.getInt(1));
	            lista.setNomautor(rs.getString(2));
	            lista.setDescrip(rs.getString(3	));
	            
	            listaAutores.add(lista);
	        }
	        
	        if (listaAutores.isEmpty()) {
	            System.out.println("No hay autores en la BD");
	        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
	        // Cerramos recursos en el orden inverso de apertura para evitar fugas de memoria
	        try {
	            if (rs != null) rs.close();
	            if (ps != null) ps.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
		return listaAutores;
	}

}
