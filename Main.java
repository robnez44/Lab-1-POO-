import java.util.Scanner;
public class Main {
   public static void main(String[] arg){
       Scanner sc = new Scanner(System.in);
       int n1, n2, opc;
           System.out.print("Bienvenido a la calculadora \n\nEscribe dos numeros\nNumero 1: ");
           n1 = sc.nextInt();
           System.out.println("Numero 2: ");
           n2 = sc.nextInt();
           do{
           System.out.println("Elige una opcion: \n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n5. Salir");
           opc = sc.nextInt();
           switch (opc) {
               case 1:
                   System.out.println("Numero 1: ");
                   System.out.println("Resultado: " + suma(n1, n2));
                   break;
               case 2:
                   System.out.println("Resultado: " + resta(n1, n2));
                   break;
               case 3:
                   System.out.println("Resultado: " + multiplicacion(n1, n2));
                   break;
               case 4:
                   System.out.println("Resultado: " + division(n1, n2));
                   break;
           }
           System.out.println(" ");
       }while (opc != 5);
   }
    public static int suma(int a, int b){
        return a+b;
    }
    public static int resta(int a, int b){
        return a-b;
    }
    public static int multiplicacion(int a, int b){
        return a*b;
    }
    public static int division(int a, int b){
        return a/b;
    }
}
