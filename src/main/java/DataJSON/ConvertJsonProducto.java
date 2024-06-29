package DataJSON;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConvertJsonProducto {

	public static void main(String[] args) {
		Producto produno=new Producto();
		produno.setIdproducto(101);
		produno.setNombre("Libro");
		produno.setDescripcion("Libro para colorear");
		produno.setCantidad(50);
		produno.setNrolote(1000);
		produno.setCodbarras(10000002);
		Producto proddos=new Producto();
		proddos.setIdproducto(102);
		proddos.setNombre("Cuaderno");
		proddos.setDescripcion("Cuaderno para escribir");
		proddos.setCantidad(100);
		proddos.setNrolote(1005);
		proddos.setCodbarras(111114522);
		Producto prodtres=new Producto();
		prodtres.setIdproducto(103);
		prodtres.setNombre("Mochila");
		prodtres.setDescripcion("Mochila para cargar");
		prodtres.setCantidad(75);
		prodtres.setNrolote(4222);
		prodtres.setCodbarras(555544111);
		List<Producto> listadoproductos=new ArrayList<Producto>();
		listadoproductos.add(produno);
		listadoproductos.add(proddos);
		listadoproductos.add(prodtres);
		Gson producto=new GsonBuilder().setPrettyPrinting().create();
		//almacenamos los valores en una variable de tipo string
		String datos=producto.toJson(listadoproductos);
		//imprimimos por pantalla
		System.out.println("************* GsonBuilder **************");
		//imprimimos el resultado
		System.out.println(datos);
		//crear una carpeta "archivo2025" en la unidad "E"
		//en dicha carpeta archivo2025 guardamos el archivo auto.json
		//para ello aplicamos la clase file...
		File archivojson=new File("E:/archivo2025/producto.json");
		//aplicamos la clase printwriter.
		PrintWriter pw;
		try {
			pw=new PrintWriter(archivojson);
			//utilizamos el metodo write...
			pw.write(datos);
			//cerramos
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
