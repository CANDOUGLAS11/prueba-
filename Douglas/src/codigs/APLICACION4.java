package codigs;
import java.util.Scanner;
public class APLICACION4 {
	
	
     public static String Concatenar (String txt1,String txt2,String txt3) {
    	 String txt4=txt1.concat(txt2);
    	 String txt5=txt4.concat(txt3);
		return txt5;
     }
     
     public static String leer(String mensaje) {
    	 Scanner teclado=new Scanner(System.in);
    	 System.out.println(mensaje);
     	
    	return teclado.nextLine();  
    	 
     }
    public static void main (String []args) {
    	
    	String txt1= leer("la primera palabra");
    	String txt2= leer("la segunda");
    	String txt3= leer("la tercera");
    	String txt5= Concatenar(txt1,txt2,txt3);
    	System.out.println(txt5);
    }	 
    	 
    	 
    	 
}


