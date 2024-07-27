



public class SinglyLinkedList{

    class Node{
        public int data;
        public Node next=null;
        
        public Node(int data){
            this.data=data;
        }

    }

    Node head=null;

    void insert(int data){
        Node newnNode = new Node(data);
        
        if(head==null){
            head=newnNode;
            return;
        }

        Node ptr=head;
        while(ptr.next!=null){
            ptr=ptr.next;
        }

        ptr.next=newnNode;

    }

    

    void traverse(){
        Node ptr = head;
        while(ptr!=null){
            System.out.println(ptr.data+"->");
            ptr=ptr.next;
        }
    }

    
public void addNum(Node l1,Node l2){

    int carry=0;
    while(l1!=null||l2!=null||carry!=0){
        int res = carry+(l1!=null?l1.data:0)+(l1!=null?l1.data:0);
            res = res/10;
            carry = res%10;
            insert(res);

        l1=l1.next;
        l2=l2.next;    
    }

    traverse();
}
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insert(2);
        singlyLinkedList.insert(4);
        singlyLinkedList.insert(3);

        SinglyLinkedList singlyLinkedList1 = new SinglyLinkedList();
        singlyLinkedList1.insert(5);
        singlyLinkedList1.insert(6);
        singlyLinkedList1.insert(4);


        SinglyLinkedList ddd = new SinglyLinkedList();
        ddd.addNum(singlyLinkedList.head, singlyLinkedList1.head);

    }
}