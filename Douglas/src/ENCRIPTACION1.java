import java.util.Scanner;

public class ENCRIPTACION1 {

	public static String leer(String mensaje) {
   	 Scanner teclado=new Scanner(System.in);
   	 System.out.println(mensaje);
    	
   	return teclado.nextLine();  
   	 
    }
	public static String encriptar(String text1) {
		
		char[] text2= new char[7];
		char[] text3= new char[7];
		for(int i=0;i<7;i++) {
			text2[i]=text1.charAt(i);
		}
		
		for(int i=0;i<7;i++) {
		
		switch (text2[i]) {
		case 'a':
		case 'b':
		case 'c':
		case 'd':
			text3[i]='D';
			break;
		case 'e':
		case 'f':
		case 'g':
		case 'h':
			text3[i]='O';
			break;
		case 'i':
		case 'j':
		case 'k':
			text3[i]='U';
			break;
		case 'l':
		case 'm':
		case 'n':
			text3[i]='G';
			break;
		case 'o':
		case 'p':
		case 'q':
			text3[i]='S';
			break;
		case 'r':
		case 's':
		case 't':
		case 'u':
			text3[i]='S';
			break;
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			text3[i]='P';
			break;
			default:
				System.out.println("ingrese los datos correctamete");
			
		}
		
		
		}
		String text4=text3[0];
			
			
		return ;

		}
		
		
		
		
		
				
		

	public static void main(String[] args) {
		String text1=leer("ingrese la palabre");
		String text6= encriptar (text1);
		
			
			
		}

	}


