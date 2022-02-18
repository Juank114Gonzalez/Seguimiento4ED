package main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
public class Main {
	
	public static void main(String args[]) {
		
		try (Scanner sc = new Scanner(System.in)) {
			HashMap<String, String> map = new HashMap<String,String>();
			String position = "";
			String valor = "";
			String stop = "";
			
			ArrayList<String> dominio= new ArrayList<>();
			ArrayList<String> rango= new ArrayList<>();
			
			boolean flag1 = false;
			
			do {
				System.out.println("Ingrese un elemento del dominio");
				dominio.add(sc.nextLine());
				System.out.println("¿Desea ingresar más elementos al dominio?... Enter para seguit, digitar N para detenerse");
				stop = sc.nextLine().toUpperCase();
				if(stop.equals("N")){
					flag1 = true;
				}
			}while(!flag1);
			
			System.out.println("El dominio es:\n");
			for(String x : dominio) {
				System.out.println(x+"\n");
			}
			
			boolean flag2 = false;
			do {
				System.out.println("Ingrese un elemento del rango");
				dominio.add(sc.nextLine());
				System.out.println("¿Desea ingresar más elementos al rango?... Enter para seguit, digitar N para detenerse");
				stop = sc.nextLine().toUpperCase();
				if(stop.equals("N")){
					flag2 = true;
				}
			}while(!flag2 );
			
			System.out.println("El rango es:\n");
			System.out.println(rango.size());
			for(String x : rango) {
				System.out.println(x+"\n");
			}
			
			
			boolean flag3 = false;
			
			do{
				System.out.println("Digite el index del par:");
				position = sc.nextLine().toUpperCase();
				for(int i = dominio.size();i>0;i--) {
					if(!dominio.get(i).equals(position)) {
						dominio.add(position);
					}
				}
				System.out.println("Digite el valor que se alojará en esa posición");
				valor = sc.nextLine().toUpperCase();
				for(int i = rango.size();i>0;i--) {
					if(!rango.get(i).equals(valor)) {
						dominio.add(valor);
					}
				}
				map.put(position,valor);
				System.out.println("¿Desea crear más pares?... Enter para seguit, digitar N para parar");
				stop = sc.nextLine().toUpperCase();
				if(stop.equals("N")){
					flag3 = true;
				}
			}while(!flag3);
			
			boolean biyectiva = false;
			boolean sobreyectiva = false;
			boolean inyectiva = false;
			boolean function = true;
			
			
			for(Map.Entry m : map.entrySet()) {
				
				String key =(String) m.getKey();
				
					if (!dominio.contains(key)) {
						function= false;
						break;
					}
					
			}
		
		}
	}
}
