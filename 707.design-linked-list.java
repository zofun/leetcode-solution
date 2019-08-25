/*
 * @lc app=leetcode id=707 lang=java
 *
 * [707] Design Linked List
 */
class MyLinkedList {
    class Node{
        int val;
        Node next;
        public Node(int v){
            val = v;
        }
    }
   int length;
   Node head; 
   /** Initialize your data structure here. */
   public MyLinkedList() {
       length = 0;
       head = null;
   }
   
   /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
   public int get(int index) {
       if(index<length&&index>=0){
           Node cur = head;
           while(index>0){
               cur = cur.next;
               index--;
           }
           return cur.val;
       }
       else return -1;
   }
   
   /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
   public void addAtHead(int val) {
       Node newnode = new Node(val);
       newnode.next = head;
       head = newnode;
       length++;
   }
   
   /** Append a node of value val to the last element of the linked list. */
   public void addAtTail(int val) {
       Node newnode = new Node(val);
       length++;
       if(head==null){
          head = newnode;
          /*head.next = null;*/
       }else{
          Node cur = head;
          while(cur.next!=null){
           cur = cur.next;
           }
          cur.next = newnode;
       }
   }
   
   /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
   public void addAtIndex(int index, int val) {
       if(index>length) return;
       if(index<0) {
           addAtHead(val);
           length++;
       }
       else{
           Node dmy = new Node(-1);
           dmy.next = head;
           Node cur = dmy;
           while(index>0)
           {
               cur = cur.next;
               index--;
           }
           Node newnode = new Node(val);
           Node temp = cur.next;
           cur.next = newnode;
           newnode.next = temp;
           head = dmy.next;
           length++;
       }
   }
   
   /** Delete the index-th node in the linked list, if the index is valid. */
   public void deleteAtIndex(int index) {
       if(index<length&&index>=0){
           length--;
           Node dmy = new Node(0);
           dmy.next = head;
           Node cur = dmy;
           while(index>0){
               cur = cur.next;
               index--;
           }
           cur.next = cur.next.next;
           head = dmy.next;
       }
       else return;
   }
}
    

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

