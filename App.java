import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int opc=0;
        int n;
        Stack stack = new Stack();
        Queue queue = new Queue();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Elija una opción:");
            System.out.println("1. Push a la pila");
            System.out.println("2. Pop a la pila");
            System.out.println("3. Push a la cola");
            System.out.println("4. Pop a la cola");
            System.out.println("0. Salir del programa");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    stack.push();
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    queue.push();
                    break;
                case 4:
                    queue.pop();    
                case 0:
                default:
                    break;
            }
        }while(opc!=0);
    }
}