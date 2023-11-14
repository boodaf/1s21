import java.util.Scanner;
    public class P3p1_1s21{
        public static void main(String[]args);
        System.out.println("Introdusca el primer valor");
        Scanner valor1=new Scanner(System.in);
        int numero1=valor1.nextInt();
        System.out.println("Introdusca el segundo valor");
        Scanner valor2=new Scanner(System.in);
        int numero2=valor2.nextInt();

        menu(); 
        int "A"=Suma(valor1+valor2);
        int "B"=Resta(valor1-valor2);
        int "C"=Multiplicacion(valor1*valor2);
        int "D"=Division(valor1/valor2);
        int "S"=Salida();
        
        System.out.println("Suma"+Suma);
        System.out.println("Resta"+Resta);
        System.out.println("Multiplicacion"+Multiplicacion);
        System.out.println("Division"+Division);
        System.out.println("¿Que opcion deseas?");
    }






