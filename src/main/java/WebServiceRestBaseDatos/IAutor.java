package WebServiceRestBaseDatos;

import java.util.List;

public interface IAutor {
	//declarando metodos
	public void RegistrarAutor(ClassAutor clasautor);
	public void ActualizarAutor(ClassAutor clasautor);
	public void EliminarAutor(ClassAutor clasautor);
	public ClassAutor BuscarAutor(ClassAutor clasautor);
	public List<ClassAutor> ListadoAutor();
	
}
