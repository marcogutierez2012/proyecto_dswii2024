package WebServiceRestBDServicio;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import WebServiceRestBaseDatos.ClassAutor;
import WebServiceRestBaseDatos.ClassAutorImpl;

@Path("/Crud")
public class ClassServicioAutor {
	//hacemos la respectiva instancia...
	//invocamos el metodo listar...
	ClassAutorImpl crud=new ClassAutorImpl();
	@GET
	@Path("/Listado")
	@Produces(MediaType.APPLICATION_JSON)
	public Response ListadoAutores(){
		List<ClassAutor> list=crud.ListadoAutor();
		
		
		return Response.ok(list	).build();
	}
	
	@POST
	@Path("/CrearAutor")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response CreateAutor(ClassAutor claut){
		//invocamos el metodo registrar..
		crud.RegistrarAutor(claut);
		List<ClassAutor> list=crud.ListadoAutor();
		return Response.ok(list).build();
	}
	
	@PUT
	@Path("/ActualizarAutor")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response UpdateAutor(ClassAutor claut){
		int idautor=0;
		List<ClassAutor> list=crud.ListadoAutor();
		//aplicamos un bucle for
		for(ClassAutor listar:list){
			//aplicamos una condicion
			if(listar.getIdautor()==claut.getIdautor()){
				idautor=listar.getIdautor();
			}
		}
		if(idautor==0){
			return Response.status(Status.BAD_REQUEST).entity("autor no encontrado").build();
		}else{
			//invocamos el metodo actualizar
			crud.ActualizarAutor(claut);
			//retornamos el listado actualizado
			List<ClassAutor> list2=crud.ListadoAutor();
			return Response.ok(list2).build();
		}
	}
	
	@DELETE
	@Path("/EliminarAutor/{cod}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response DeleteAutor(@PathParam("cod") int cod){
		ClassAutor clautor=new ClassAutor();
		//asignamos el codigo a eliminar
		clautor.setIdautor(cod);
		int idautor=0;
		List<ClassAutor> list=crud.ListadoAutor();
		for(ClassAutor listar:list){
			//aplicamos una condicion
			if(listar.getIdautor()==clautor.getIdautor()){
				idautor=listar.getIdautor();
			}
		}
		if(idautor==0){
			return Response.status(Status.BAD_REQUEST).entity("autor no encontrado").build();
		}else{
			crud.EliminarAutor(clautor);
			List<ClassAutor> list2=crud.ListadoAutor();
			return Response.ok(list2).build();
		}
	}
	
	@GET
	@Path("/BuscarAutor/{cod}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response SearchAutor(@PathParam("cod") int cod){
		ClassAutor clautor=new ClassAutor();
		//asignamos el codigo a eliminar
		clautor.setIdautor(cod);
		int idautor=0;
		List<ClassAutor> list=crud.ListadoAutor();
		for(ClassAutor listar:list){
			//aplicamos una condicion
			if(listar.getIdautor()==clautor.getIdautor()){
				idautor=listar.getIdautor();
			}
		}
		if(idautor==0){
			return Response.status(Status.BAD_REQUEST).entity("autor no encontrado").build();
		}else{
			ClassAutor bus=crud.BuscarAutor(clautor);
			return Response.ok(bus).build();
		}
	}
	
}	//fin de la clase
