package DataJSON;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ClassTestConverJsonAuto {

	public static void main(String[] args) {
		ClassAuto autouno=new ClassAuto();
		autouno.setIdauto(10);
		autouno.setMarca("kia");
		autouno.setModelo("cerato");
		autouno.setColor("plomo");
		autouno.setNroplaca("T34456");
		autouno.setMotor("1.8");
		autouno.setTarjpropiedad("KJ1235");
		autouno.setYearfabri("2023");
		ClassAuto autodos=new ClassAuto();
		autodos.setIdauto(20);
		autodos.setMarca("toyota");
		autodos.setModelo("corolla");
		autodos.setColor("negro");
		autodos.setNroplaca("TR7896");
		autodos.setMotor("1.6");
		autodos.setTarjpropiedad("TY7896");
		autodos.setYearfabri("2024");
		ClassAuto autotres=new ClassAuto();
		autotres.setIdauto(30);
		autotres.setMarca("Subaru");
		autotres.setModelo("forester");
		autotres.setColor("blanco");
		autotres.setNroplaca("h5y854");
		autotres.setMotor("2.0");
		autotres.setTarjpropiedad("gth874");
		autotres.setYearfabri("2024");
		//declaramos un objeto de list classauto...
		List<ClassAuto> listadoautos=new ArrayList<ClassAuto>();
		//agregamos datos al listado
		listadoautos.add(autouno);
		listadoautos.add(autodos);
		listadoautos.add(autotres);
		//primer formato en json...
		Gson autojson=new Gson();
		//almacenamos en una variable de tipo string
		String datos=autojson.toJson(listadoautos);
		//imprimimos por pantalla
		System.out.println("************* primera forma en json **************");
		//imprimimos el resultado
		System.out.println(datos);
		//segunda forma en data json
		Gson autojsonsegundo=new GsonBuilder().setPrettyPrinting().create();
		//almacenamos los valores en una variable de tipo string
		String datosdos=autojsonsegundo.toJson(listadoautos);
		//imprimimos por pantalla
		System.out.println("************* segunda forma en json **************");
		//imprimimos el resultado
		System.out.println(datosdos);
		//crear una carpeta "archivo2025" en la unidad "E"
		//en dicha carpeta archivo2025 guardamos el archivo auto.json
		//para ello aplicamos la clase file...
		File archivojson=new File("E:/archivo2025/auto.json");
		//aplicamos la clase printwriter.
		PrintWriter pw;
		try {
			pw=new PrintWriter(archivojson);
			//utilizamos el metodo write...
			pw.write(datosdos);
			//cerramos
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
