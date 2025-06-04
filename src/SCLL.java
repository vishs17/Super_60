class Nnode {
 int data;
 Node next;
 Nnode(int data){
  this.data = data;
  this.next = null;
 }
}

public class SCLL {
 private Node head;

 public SCLL(){
  head = null;
 }

 // Print elements of the circular linked list
 public void printListElements(){
  if (head == null) {
   System.out.println("Empty list");
   return;
  }
  Node temp = head;
  do {
   System.out.print(temp.data + " -> ");
   temp = temp.next;
  } while (temp != head);
  System.out.println("HEAD");
 }

 // Insert at front in circular linked list
 public void insertAtFront(int newValue){
  Node newNode = new Node(newValue);
  if (head == null) {
   newNode.next = newNode; // Point to itself if first node
   head = newNode;
   return;
  }

  Node temp = head;
  while (temp.next != head) { // Traverse till last node
   temp = temp.next;
  }

  newNode.next = head;
  temp.next = newNode;
  head = newNode;
 }

 public static void main(String[] args) {
  SCLL list = new SCLL();
  list.insertAtFront(10);
  list.insertAtFront(20);
  list.insertAtFront(30);

  list.printListElements(); // Expected: 30 -> 20 -> 10 -> HEAD
 }
}