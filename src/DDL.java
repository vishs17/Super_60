class node {
 int data;
 Node prev;
 Node next;
 node(int data){
  this.data = data;
  prev = null;
  next = null;
 }
}



public class DDL {
 Node head;
 public void insert(int data) {
  Node newNode = new Node(data);
  if (head == null) {
   head = newNode;
   return;
  }
  Node temp = head;
  while (temp.next != null) {
   temp = temp.next;
  }
  temp.next = newNode;
  newNode.prev = temp;
 }



public void deleteFromEnd(){
  if(head== null){
   System.out.println("Empty list cant delete node");
   return;
  }
  if(head.next == null){
   head = null;
   return;
  }
  Node temp = head;
  while(temp.next!=null){
   temp = temp.next;
 }
  temp.prev.next = null;
 }



public void insertAtPosition(int data , int position) {
 Node newNode = new Node(data);
 if (position <= 0) {
  System.out.println("Invalid position");
  return;
 }
 if (position == 1) {
  newNode.next = head;
  if (head != null) {


   head.prev = newNode;
  }
  head = newNode;
  return;
 }
}



public void display(){
  Node temp = head;
  while(temp != null){
   System.out.print(temp.data+"->");
   temp = temp.next;
  }
 System.out.print("Null");
}



 public static void main(String[] args) {
  DDL dll = new DDL();
  dll.insert(10);
  dll.insert(20);
  dll.insert(30);
  dll.display();
  System.out.println();
  dll.deleteFromEnd();
  dll.display();
  System.out.println();
  dll.insertAtPosition(50,1);
  dll.display();
 }
}