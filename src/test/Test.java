package test;

public class Test {

	public static void main(String[] args) {
		
		// == , equals
		
//		int num1 = 1;
//		int num2 = 1;
		
//		if (num1 == num2) {
//			System.out.println("son iguales  ==");
//		}
		
//		Integer integer1 = 1; //fgdfgfdgfdgdfgdfh
//		Integer integer2 = new Integer(1); //ttttttttt
//		
//		if (integer1 == integer2) {
//			System.out.println("son iguales  ==");
//		} else {
//			System.out.println("no son iguales ==");
//		}
//		
//		if (integer1.equals(integer2)) {
//			System.out.println("son iguales  equals");
//		} else {
//			System.out.println("no son iguales equals=");
//		}
		
		
		
		Test test = new Test();
		
		Person person1 = test.new Person();
		int suma1 = person1.sumar(2);
		System.out.println("suma de person1 : "+suma1);
		
		
		Person person2 = test.new User();
		int suma2 = person2.sumar(2);
		System.out.println("suma de person2 : "+suma2);
		
		User user = test.new User();
		user.calcularHoras(2);
		
		
		Person person3 = test.new Customer();
		int suma3 = person3.sumar(2);
		System.out.println("suma de person3 : "+suma3);
		
		
	}

	
	class Person {
		private String nombre;
		private String apellido;
		private Integer edad;
		
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
		public Integer getEdad() {
			return edad;
		}
		public void setEdad(Integer edad) {
			this.edad = edad;
		}
		
		public int sumar(int horas) {
			return horas+1;
		}
	}
	
	class User extends Person{
		private String rol;

		public String getRol() {
			return rol;
		}

		public void setRol(String rol) {
			this.rol = rol;
		}
		
		public int calcularHoras(int horas) {
			return horas+1;
		}
		
		public int sumar(int horas) {
			return horas+2;
		}
	}
	
	class Customer extends Person{
		private String direccion;

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}


		public int commprar(int horas) {
			return horas+1;
		}
		
		public int sumar(int horas) {
			return horas+3;
		}
	}
	
	
}
