package model.entity;

public class User {

//niveles de acceso: private public protected default
	
	private Integer id;
	private Integer edad;
	private String nombre;
	private String apellido;
	
	
	public User(Integer id, Integer edad, String nombre, String apellido) {
		super();
		this.id = id;
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
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


	@Override
	public String toString() {
		return "User [id=" + id + ", edad=" + edad + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
}
