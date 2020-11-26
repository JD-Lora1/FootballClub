package ui;
import java.util.Scanner;
import model.*;

public class Main{
	public static Scanner sc = new Scanner(System.in);

	//Relationship

	public static void main(String[] args){

		int opt=-1;
		boolean ctrl= false;

		System.out.println( "" );

		while(!ctrl){
			System.out.println(
					"\nSeleccione una opcion:\n" +
					"(1) \n" +
					"(2) \n"+
					"(3) \n"+
					"(4) \n"+
					"(5) \n"+
					"(6) \n"+
					"(0) Salir" );

			System.out.print(": ");
			opt = sc.nextInt();
			sc.nextLine();

			switch (opt){
				case 1: ;
					break;
				case 2: ;
					break;
				case 3: ;
					break;
				case 4: ;
					break;
				case 5: ;
					break;
				case 6: ;
					break;
				case 0: System.out.println("   *Fin*");
					ctrl=true;
					break;
				default:System.out.println("Digite una opcion valida");		
			}
		}
	}

}