import java.util.Scanner;

public class APLICACION2 {

	public static void main(String[] args) {
		String nome1,nome2,nome3;
		Scanner metela= new Scanner(System.in);
		System.out.println(" méte la primera letra chochera: ");
		nome1=metela.nextLine();
		System.out.println(" méte la segunda letra chochera: ");
		nome2=metela.nextLine();
		System.out.println(" méte la tercera letra chochera: ");
		nome3=metela.nextLine();
		
		String [] lucho= new String[3];
		lucho[0]=nome1;
		lucho[1]=nome2;
		lucho[2]=nome3;
		System.out.println(" ");
		for(int i=0;i<lucho.length;i++) {
			System.out.println(lucho[i]);
			
			
		}
	}

}
