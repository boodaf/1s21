import java.util.Scanner;

public class p2p7_1s21{
	public static void main(String[] args) {
		char opc:
		Scanner teclado = new Scanner(System.in);
        boolean estado = true;
		do{
			System.out.println("Menu de opciones");
			System.out.println("1.– Suma");
            System.out.println("2.- Resta");
            System.out.println("3.– Multiplicacion");
            System.out.println("4.– Division");
            System.out.println("S.– Salir");
            System.out.println("¿Que opcion deseas?");
        opc = teclado.next().charAt(0);
            switch (opc){
            case '1':System.out.println("aqui va la suma");break;
			case '2':System.out.println("aqui va la resta");break;
            case '3':System.out.println("aqui va la Multiplicacion");break;
            case '4':System.out.println("aqui va la Division");break;
            case 'S':
            case 's':
            	System.out.println("aqui va la opcion de salir");break;
                estado=false;
                break;
            }
        }while(estado);
    }
}




		

	
