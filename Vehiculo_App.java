package vehiculos;

import java.util.Scanner;

public class Vehiculo_App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String resp2;
		
		System.out.println("Ingresa la marca del auto:");
		String marca=sc.nextLine();
		
		System.out.println("Ingresa el modelo auto:");
		String modelo=sc.nextLine();
		
		System.out.println("Ingresa numero de puertas del auto:");
		int puertas=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Ingresa el tipo de moto:");
		String tipo=sc.nextLine();
		
		System.out.println("Ingresa la marca de la moto:");
		String marca1=sc.nextLine();
		
		System.out.println("Ingresa el modelo de la moto:");
		String modelo1=sc.nextLine();
		
		Auto A1= new Auto(puertas,modelo,marca);
		Moto M1=new Moto(tipo,marca1,modelo1);
		
		do {
			System.out.println("selecciona (A) para ver la informacion del automobil\nSelecciona (M) para ver la información de la moto\nSeleciona cualquier tecla para ver la información de ambos:");
			char letra=sc.next().charAt(0);  //(char) type goes in lowercase and this is the structure to set it.
			
		if(letra=='a' || letra=='A') {
			
			System.out.println("Información del automobil: ");
			A1.mostrarinf();
			A1.abrirpuertas();
			A1.Conectar_Wifi();
			A1.Actualizar_Software();
			
		}else if(letra=='m' || letra=='M') {
			System.out.println("Información de la motocicleta: ");
			M1.mostrarinf();
			M1.hacercaballito();
			M1.Conectar_Wifi();
			M1.Actualizar_Software();
		}else {
			System.out.println("Información del automobil: ");
			A1.mostrarinf();
			A1.abrirpuertas();
			A1.Conectar_Wifi();
			A1.Actualizar_Software();
			
			System.out.println("Información de la motocicleta: ");
			M1.mostrarinf();
			M1.hacercaballito();
			M1.Conectar_Wifi();
			M1.Actualizar_Software();
		}
		System.out.println("Quieres continuar? si/no ");
	      resp2=sc.next();
		
		}while(resp2.equalsIgnoreCase("si"));
		
		sc.close();
	}

}
