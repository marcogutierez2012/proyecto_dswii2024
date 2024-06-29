package WebServiceRestBaseDatos;

public class ClassAutor {
	//declaramos atributos
	private int idautor;
	private String nomautor;
	private String descrip;
	//constructores
	
	public ClassAutor() {
		
	}
	public ClassAutor(int idautor, String nomautor, String descrip) {
		this.idautor = idautor;
		this.nomautor = nomautor;
		this.descrip = descrip;
	}
	public int getIdautor() {
		return idautor;
	}
	public void setIdautor(int idautor) {
		this.idautor = idautor;
	}
	public String getNomautor() {
		return nomautor;
	}
	public void setNomautor(String nomautor) {
		this.nomautor = nomautor;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}	
}
