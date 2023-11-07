package calculadoraAritmetica.Controladores;

import java.util.Scanner;

import calculadoraAritmetica.Servicios.MenuImplementacion;
import calculadoraAritmetica.Servicios.MenuInterfaz;

/**
 * Clase principal de la aplicacion 
 * 031123 - ilp
 */

public class InicioAplicacion 
{
	
	public static void main(String[] args) 
	{
		  MenuInterfaz mi =new MenuImplementacion();
		  Scanner conectarTeclado = new Scanner(System.in);
		 
	      
	      int seleccionUsuario  ;
			boolean cerrarMenu = false;
			
	      
	      
	      while (!cerrarMenu)
	      {
				
	    	  seleccionUsuario = mi.mostrarMenuYSeleccion(conectarTeclado);
				
				switch(seleccionUsuario) 
			{
				case 0:
					System.out.println("Se ejecuta caso 0");
					cerrarMenu=true;
					break;
				case 1:
				mi.sumar();
					break;
				case 2:
					mi.restar();
					break;
				case 3:
					mi.multiplicar();
					break;
				case 4:
					mi.dividir();
					break;
					default:
						System.out.println("Se ejecuta caso default");
						break;
		
			
			}
		}
	}
}
