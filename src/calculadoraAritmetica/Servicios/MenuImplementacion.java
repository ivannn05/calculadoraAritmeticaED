package calculadoraAritmetica.Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz
{

	public int mostrarMenuYSeleccion (Scanner conectarTeclado) 
	{
		
		String mensajeBienbenida="Elija una opción ";
		
		System.out.println(mensajeBienbenida);
		
		 int opcionIntroducida;
		  
		  System.out.println("##############################");
		  System.out.println("0.Cerrar menu");
		  System.out.println("1.Sumar");
		  System.out.println("2.Restar");
		  System.out.println("3.Multiplicar");
		  System.out.println("4.Dividir");
		  System.out.println("##############################");
		  System.out.println("Seleccione una opcion");
		 
		  opcionIntroducida=conectarTeclado.nextInt(); 
		  return opcionIntroducida;
	
	}
    private double pedirOperando()
   {
    	Scanner sc = new Scanner(System.in);
       double operando;
       System.out.println("Indique un operando: ");
       operando = sc.nextDouble();
       return operando;
   } 
   public void dividir()
   {
       double operandoUno = pedirOperando();
       double operandoDos = pedirOperando();
       double resultado = operandoUno / operandoDos;
       System.out.println(resultado);
   }

   public void multiplicar()
   {
       double operandoUno = pedirOperando();
       double operandoDos = pedirOperando();
       double resultado = operandoUno * operandoDos;
       System.out.println(resultado);
   }

   public void restar()
   {
       double operandoUno = pedirOperando();
       double operandoDos = pedirOperando();
       double resultado = operandoUno - operandoDos;
       System.out.println(resultado);
   }

   public void sumar()
   {
       double operandoUno = pedirOperando();
       double operandoDos = pedirOperando();
       double resultado = operandoUno + operandoDos;
       System.out.println(resultado);
	
   }
}