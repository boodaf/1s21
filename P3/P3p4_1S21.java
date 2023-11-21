import java.util.Scanner;
public class P3p4_1s21{
	static int veses;
    public static void elevacion(int a,int contador){
	System.out.println("El valor es"+a);
	if(!(contador=veses))elevacion(a*2,contador+1);
	else System.out.println("El valor es"+a);



public static void main(String[] args){
	Scanner teclado=new Scanner(Sistem.in);
	System.out.println("Cuantas veses desea repetir");
	veses=teclado.nextInt();
    int valor=2;
	elevacion(valor,1);
	}
}