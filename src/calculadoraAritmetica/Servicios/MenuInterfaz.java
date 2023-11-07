package calculadoraAritmetica.Servicios;

import java.util.Scanner;

public interface MenuInterfaz
{

	
	public int mostrarMenuYSeleccion (Scanner conectarTeclado) ;
	
	public void sumar();
	   
    public void restar();
  
    public void multiplicar();
   
    public void dividir();
	
}