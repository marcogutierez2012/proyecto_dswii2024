package DataJSON;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;

public class LeerJsonProducto {

	public static void main(String[] args) {
		// ubicamos la ruta del archivo que va hacer leido...
		String ruta="E:/archivo2025/producto.json";
		//recuparemos la ruta para ser leido el archivo json...
		try {
			Reader lectura=Files.newBufferedReader(Paths.get(ruta));
			//instanciamos la GSON...
			Gson leer=new Gson();
			//recuperamos los datos para darle lectura
			Producto[] producto=leer.fromJson(lectura, Producto[].class);
			//aplicamos un bucle for...
			for(Producto lis:producto){
				//imprimimos por pantalla
				System.out.println("Id "+lis.getIdproducto()+
						" Articulo "+lis.getNombre()+" Descripcion "+lis.getDescripcion()+" Stock "+lis.getCantidad()+
						" Nro. Lote "+lis.getNrolote()+" Codigo de Barras "+lis.getCodbarras());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	//fin del catch...

	}

}
