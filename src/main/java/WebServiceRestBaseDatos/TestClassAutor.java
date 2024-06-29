package WebServiceRestBaseDatos;

import java.util.ArrayList;
import java.util.List;

public class TestClassAutor {

	public static void main(String[] args) {
		ConectarBD.getConexion();
		
		ClassAutorImpl clas=new ClassAutorImpl();
		
		//Registrar
		/*ClassAutor nuevoautor=new ClassAutor();
		nuevoautor.setNomautor("Jose Maria Arguedas");
		nuevoautor.setDescrip("Escritor y literario peruano conocido por sus obras Yawar Fiesta,etc");
		clas.RegistrarAutor(nuevoautor);*/
		//Actualizar
		/*ClassAutor actualizarautor=new ClassAutor();
		actualizarautor.setNomautor("Jose Maria Arguedas - Escritor");
		actualizarautor.setDescrip("Escritor y literario peruano conocido por sus obras Yawar Fiesta, El sexto, Rios Profundos, etc");
		actualizarautor.setIdautor(1);
		clas.ActualizarAutor(actualizarautor);*/
		//Eliminar
		/*ClassAutor actualizarautor=new ClassAutor();
		actualizarautor.setIdautor(1);
		clas.EliminarAutor(actualizarautor);*/
		
		//Buscar
		ClassAutor autorencontrado=new ClassAutor();
		autorencontrado.setIdautor(2);
		ClassAutor autor= clas.BuscarAutor(autorencontrado);
		System.out.println("ID : "+autor.getIdautor()+" Nombre: "+autor.getNomautor()+" Descripcion: "+autor.getDescrip());
		
		
		//Listar
		/*List<ClassAutor> lista = new ArrayList<ClassAutor>();
		lista = clas.ListadoAutor();

		// Iterar sobre la lista e imprimir los valores de cada objeto ClassAutor
		for (ClassAutor autor : lista) {
		    System.out.println("ID Autor: " + autor.getIdautor());
		    System.out.println("Nombre: " + autor.getNomautor());
		    System.out.println("Descripción: " + autor.getDescrip());
		    System.out.println("-----------------------------------");
		}*/
		
		
	}

}
