package codigs;
import java.util.Scanner;

public class APLICACION5 {
	public static String leer(String mensaje) {
   	 Scanner teclado =new Scanner(System.in);
   	 System.out.println(mensaje);
    	
   	return teclado.nextLine(); }

	public static void main(String[] args) {
		String texto= leer(" inbgrese la palabra chochera: ");
		
	 
		
	}
	public static String invertertexto (String txt1) {
		char [] intxt1 = new char[txt1.length()];
		for(int i=txt1.length()-1;i>=0;i-- ) {
			for(int j=0;j<txt1.length();j++) {
			 intxt1[j]=txt1.charAt(i);
				
			}
		
		}
		
		return intxt2;
		
	}

}
