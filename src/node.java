class Node {
 int data;
 Node next;

 Node(int data) {
  this.data = data;
  this.next = null;
 }
}

class SLL {
 Node head;
 Node tail;

 SLL() {
  head = null;
  tail = null;
 }

 void insertAtHead(int val) {
  Node n = new Node(val);
  n.next = head;
  head = n;
  if (tail == null) {
   tail = head;
  }
 }

 void insertAtTail(int val) {
  Node n = new Node(val);
  if (head == null) {
   head = tail = n;
   return;
  }
  tail.next = n;
  tail = n;
 }

 void insertAtPos(int val, int pos) {
  if (pos < 1) {
   System.out.println("Invalid position!");
   return;
  }

  Node n = new Node(val);
  if (pos == 1) {
   n.next = head;
   head = n;
   return;
  }

  Node temp = head;
  for (int i = 1; i < pos - 1; i++) {
   if (temp == null) {
    System.out.println("Position out of bounds!");
    return;
   }
   temp = temp.next;
  }

  n.next = temp.next;
  temp.next = n;

  if (n.next == null) {
   tail = n;
  }
 }

 void deleteAtHead() {
  if (head != null) {
   head = head.next;
   if (head == null) {
    tail = null;
   }
  }
 }

 void deleteByVal(int val) {
  if (head == null) return;

  if (head.data == val) {
   deleteAtHead();
   return;
  }

  Node temp = head;
  while (temp.next != null && temp.next.data != val) {
   temp = temp.next;
  }

  if (temp.next == null) {
   System.out.println("Value not found");
   return;
  }

  temp.next = temp.next.next;

  if (temp.next == null) {
   tail = temp;
  }
 }

 void printLL() {
  Node temp = head;
  while (temp != null) {
   System.out.print(temp.data + "->");
   temp = temp.next;
  }
  System.out.println("NULL");
 }
}

class DriverCode {
 public static void main(String[] args) {
  SLL sll = new SLL();
  sll.insertAtTail(100);
  sll.insertAtHead(10);
  sll.insertAtHead(20);
  sll.insertAtHead(30);
  sll.insertAtHead(40);
  sll.insertAtTail(50);
  sll.insertAtPos(500, 3);
  sll.printLL();
 }
}
