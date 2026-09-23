package vehiculos;

public class Moto extends Vehiculos implements Conectividad{
	String tipo;
	
	public Moto(String tipo,String modelo,String marca) {
		super(modelo,marca);
		this.tipo=tipo;
	}
	public void hacercaballito() {
		System.out.println("Estas haciendo un caballito con la moto");
	}
	 @Override
	 public void Conectar_Wifi() {
		 System.out.println("Estas conectando a internet Infinitum_3727");
	 }
	 public void Actualizar_Software() {
		 System.out.println("Estamos actualizando tu Software, espera unos segundos...\n");
	 }
	 public void mostrarinf() {
		 super.mostrarinf();
		 System.out.println("El tipo de moto es: "+tipo);
		 
	 }
}
