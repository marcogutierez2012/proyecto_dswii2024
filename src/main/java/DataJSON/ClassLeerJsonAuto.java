package DataJSON;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;

public class ClassLeerJsonAuto {

	public static void main(String[] args) {
		// ubicamos la ruta del archivo que va hacer leido...
		String ruta="E:/archivo2025/auto.json";
		//recuparemos la ruta para ser leido el archivo json...
		try {
			Reader lectura=Files.newBufferedReader(Paths.get(ruta));
			//instanciamos la GSON...
			Gson leer=new Gson();
			//recuperamos los datos para darle lectura
			ClassAuto[] autos=leer.fromJson(lectura, ClassAuto[].class);
			//aplicamos un bucle for...
			for(ClassAuto lis:autos){
				//imprimimos por pantalla
				System.out.println("codigo "+lis.getIdauto()+
						" marca "+lis.getMarca()+" modelo "+lis.getModelo()+" color "+lis.getColor()+
						" nro. placa "+lis.getNroplaca()+" motor "+lis.getMotor()+" tarjeta de propiedad "+lis.getTarjpropiedad()+
						" año de fabricacion "+lis.getYearfabri());
			}
			//aplicamos la interface map.. con el metodo fromjson...
			//Map[] leerfinal=leer.fromJson(lectura, Map[].class);
			//imprimimos por pantalla los valores recuperados
			//del archivo json...
			/*System.out.println("codigo "+leerfinal.get("codigo")+" marca "+
			leerfinal.get("marca de auto")+" modelo "+leerfinal.get("modelo")+" color "+leerfinal.get("color")+" nro. de placa "+
			leerfinal.get("nro. de placa")+" motor "+leerfinal.get("motor")+" tarjeta de propiedad "+leerfinal.get("tarjpropiedad")+
			" año de fabricacion "+leerfinal.get("fabricacion"));*/
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	//fin del catch...

	}

}
