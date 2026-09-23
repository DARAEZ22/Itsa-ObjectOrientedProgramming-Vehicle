package vehiculos;

public class Vehiculos {
	protected String marca,modelo;
	
	public Vehiculos(String marca,String modelo) {
		this.marca=marca;
		this.modelo=modelo;
	}
	
	public void mostrarinf() {
		System.out.println("La marca es: "+marca+"\nEl modelo es: "+modelo);
	}
}
