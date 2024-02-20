import java.util.Scanner;

public class Stack {
    private Node head, tail;
    private int value;

    public Stack(){
        this.value = -1;
        this.head = null;
    }

    public void push(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese  el valor a insertar: ");
        value = sc.nextInt();
        Node node = new Node(value);
        if(head==null){
            head = node;
            tail = node;
        }else{
            Node aux = head;
            while(aux.getNext()!=null){
                aux = aux.getNext();
            }
            aux.setNext(node);
            tail = node;
        }
        show();
    }

    
    public void pop(){
        if(head==null){
            System.out.println("La cola esta vacia");
        }else if(head.getNext() == null){
            System.out.println( "Elemento eliminado: "+ head.getValue());
            head = null;
            tail = null;
        }else{
            Node aux = head;
            while(aux.getNext().getNext()!=null){
                aux=aux.getNext();
            }
            tail = aux;
            System.out.println("Elemento eliminado: "+ aux.getNext().getValue());
            aux.setNext(null);
        }
        show();
    }

    public void show(){
        if(head==null){
            System.out.println("No hay elementos");
        }else{
            Node aux = head;
            while (aux!=null){
                System.out.print(aux.getValue()+" ");
                aux = aux.getNext();
            }
        }
        System.out.println();
    }
}