package vehiculos;

public class Auto extends Vehiculos implements Conectividad{
	
 int numpuertas;
 
 public Auto(int numpuertas, String modelo, String marca) {
 super(marca,modelo);
 this.numpuertas=numpuertas;
 
 }
 
 public void abrirpuertas() {
	 System.out.println("Las puertas estan abiertas");
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
	 System.out.println("El numero de puertas es: "+numpuertas);
	
	
 }
}
