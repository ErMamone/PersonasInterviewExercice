import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Personas> listaPersonas = harcodeoPersonas();
		HashMap <String, List<Personas>> mapaPersonas = personasPorProvincia(listaPersonas);
		
		
		for(Personas per : listaPersonas) {
			System.out.println(per.toString());
		}
		
		
	}

	public static List<Personas> harcodeoPersonas() {
		List<Personas> lista = new ArrayList<Personas>();
		Personas p1 = new Personas();
		p1.setApellido("Argento");
		p1.setNombre("Pepe");
		p1.setDireccion("Corrientes 2111");
		p1.setProvincia("Buenos Aires");
		p1.setTelefono("000000000");
		lista.add(p1);

		Personas p2 = new Personas();
		p2.setApellido("Murrieta");
		p2.setNombre("Carlos");
		p2.setDireccion("Mendoza 222");
		p2.setProvincia("Mendoza");
		p2.setTelefono("1111111111");
		lista.add(p2);
		
		Personas p3 = new Personas();
		p3.setApellido("Murrieta");
		p3.setNombre("Carla");
		p3.setDireccion("Cordoba 3002");
		p3.setProvincia("Cordoba");
		p3.setTelefono("22222222");
		lista.add(p3);
		
		Personas p4 = new Personas();
		p4.setApellido("Florentino");
		p4.setNombre("Walter");
		p4.setDireccion("Entre rios 200");
		p4.setProvincia("Entre Rios");
		p4.setTelefono("333333333");
		lista.add(p4);
		
		Personas p5 = new Personas();
		p5.setApellido("Shchonzilg");
		p5.setNombre("Mary");
		p5.setDireccion("Malabia 222");
		p5.setProvincia("Buenos Aires");
		p5.setTelefono("44444444");
		lista.add(p5);
		
		return lista;
	}

	public static HashMap<String, List<Personas>> personasPorProvincia(List<Personas> lista, List<Provincias> listaProvincias) {
		HashMap <String, List<Personas>> mapa = new HashMap<String, List<Personas>>();
		List<Personas> listaPersonasProvincia = new ArrayList<Personas>();
		
		//Iterar sobre la clase de provincias
		for (Provincias provincia : listaProvincias) {
			
			//Limpiar lista auxiliar de Personas
			listaPersonasProvincia.clear();
			
			//Iterar sobre las personas
			for(Personas per : lista) {
				//Validar la provincia
				if(per.getProvincia().equals(provincia.getNombre())) {
					//Agregar provincia a la lista auxiliar
					listaPersonasProvincia.add(per);
				}
			}
			
			//Finalizado el agregado de personas por provincia, se da la provincia al mapa y se le agrega la lista de personas
			mapa.entrySet(provincia.getNombre(), listaPersonasProvincia);
		}
		
		return mapa;
	}
}
