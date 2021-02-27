
public class Personas {
	private String nombre;
	private String apellido;
	private String direccion;
	//Clase provincia
	private String provincia;
	private String telefono;
	
	public Personas() {
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String toString() {
		return "Nombre completo: "+this.apellido+" "+this.nombre+
				"\nDireccion: "+this.direccion+", Provincia de "+this.provincia+
				"\nTelefono: "+this.telefono+"\n";
	}
}
