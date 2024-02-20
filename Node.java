public class Node {
    private int value;
    private Node head, tail, next;

    public Node(int value){
        this.value = value;
        this.next = next;
        this.head = null;
        this.tail = null;
    }

    public int getValue(){
        return this.value;
    }
    public void setValue(int value){
        this.value = value;
    }
    public Node getNext(){
        return this.next;
    }
    public void setNext(Node next){
        this.next = next;
    }
    public Node getHead(){
        return this.head;
    }
    public void setHead(Node head){
        this.head = head;
    }
    public Node getTail(){
        return this.tail;
    }
    public void setTail(Node tail){
        this.tail = tail;
    }
}