/*
 * @lc app=leetcode id=707 lang=java
 *
 * [707] Design Linked List
 */
class MyLinkedList {
    class Entry{
        int val;
        Entry next;
        public Entry(){

        }
        public Entry(int n){
            val = n;
        }
    }
    Entry head = null;
    int size;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = new Entry();
        size = 0;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index>=size||index<0){
            return -1;
        }
        Entry t = head;
        for(int i=0;i<=index;i++){
            t = t.next;
        }
        return t.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Entry t = new Entry(val);
        if(head.next==null){
            head.next = t;
        }else{
            t.next = head.next;
            head.next = t;
        }
        size++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Entry t = new Entry(val);
        Entry x = head;
        while (x.next!=null){
            x= x.next;
        }
        x.next = t;
        size++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index>size||index<0){
            return;
        }else if(index==size){
            addAtTail(val);
        }else{
            Entry x = head;
            for(int i=0;i<index;i++){
                x=x.next;
            }

            Entry t = new Entry(val);

            t.next=x.next;

            x.next = t;
             size++;
        }

    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index>=size||index<0){
            return;
        }else{
            Entry x = head;
            for(int i=0;i<index;i++){
                x=x.next;
            }
            Entry delE = x.next;
            x.next = delE.next;
            delE.next = null;
        }
        size--;
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

