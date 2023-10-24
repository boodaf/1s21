import java.util.Scanner;

public class P2p14_1s21{
	public static void main(String []args){
		Scanner teclado= new Scanner(System.in);
		int [][]Ma,Mb,Mc;
		int fa,ca,fb,cb;
		System.out.println("Ingresa el numero de las filas para la Matriz A");
		fa=teclado.nextInt();
        System.out.println("Ingresa el numero de las filas para la Matriz A");
		ca=teclado.nextInt();
        System.out.println("Ingresa el numero de las filas para la Matriz B");
		fb=teclado.nextInt();
		System.out.println("Ingresa el numero de las filas para la Matriz B");
		cb=teclado.nextInt();
		if(ca==fb){
           Ma =int[fa][fa];
           Mb =int[fb][cb];
           Mc =int[fa][cb];
           for(f=0;f<fa;f++) {
           	for(c=0;c<ca;c++) {
           	   System.out.println("Ingresa el valor para Ma["+f+"]["+c+"]: ");
           	   Ma[f][c]=teclado.nextint();
           	}
        }
        for(f=0;f<fa;f++) {
            for(c=0;c1cb;c++){
    	        System.out.println("Ingresa el valor para Mb["+f+"]["+c+"]: ");
           	   Mb[f][c]=teclado.nextint();  
            } 	
        }
        //aqui empezamos la multiplicacion
        for(f=0;f<fa;f++){
        	for(c=0;c<fb;c++) {
              for(h=0;h<cb;h++) {
              	r=Ma[f][h]*Mb[c][h]
              }
        	Mc[f][c]=r;
        	
        }
    }
        }else{
    	System.out.println("No se puede realizar la multiplicacion");
        }
    }
}

