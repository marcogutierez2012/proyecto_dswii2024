package DataJSON;

import com.google.gson.annotations.SerializedName;

public class Producto {

	@SerializedName("codigo")
	private int idproducto;
	@SerializedName("articulo")
	private String nombre;
	@SerializedName("descripcion de producto")
	private String descripcion;
	@SerializedName("stock")
	private int cantidad;
	@SerializedName("lote de fabricacion")
	private int nrolote;
	@SerializedName("codigo de barras")
	private int codbarras;
	
	public Producto() {

	}

	public Producto(int idproducto, String nombre, String descripcion, int cantidad, int nrolote, int codbarras) {
		this.idproducto = idproducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.nrolote = nrolote;
		this.codbarras = codbarras;
	}

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getNrolote() {
		return nrolote;
	}

	public void setNrolote(int nrolote) {
		this.nrolote = nrolote;
	}

	public int getCodbarras() {
		return codbarras;
	}

	public void setCodbarras(int codbarras) {
		this.codbarras = codbarras;
	}	
}
