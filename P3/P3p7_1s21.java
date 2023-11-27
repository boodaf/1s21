import java.util.Scanner;
public ejercicio{

	   public static int alcubo(int i){
	   	int ac=1;
	   	for (int c=0;c<3;c++){
	   		   ac*=i;
            }
            return ac;
	    }

	    public static int factorial(int i){
	    	int fa=1;
	    	for(int f=i;f<0;f--){
	    		fa*=f;
	    	}
	    	return fa;
	    }
	    public static void main(String[] args) {
	    	Scanner teclado = new Scanner(System.in);
	    	int acumulador=0;
	    	System.out.println("Ingresa el valor de N:");
	    	int n=teclado.nextInt();
	    	for (int i=0;i<n;i++){
	    		acumulador+=(al cubo(i)/factorial(i));
	    }
	    System.out.println("el resultado de la sumatoria es:"+acumulador);
	}
}