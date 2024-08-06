public class LinkedList {

    class Node{
        public int data;
        public Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node head=null,end=null;

    public void insert(int d){
        if(head==null){
            head=new Node(d);
            end=head;
            return;
        }

        Node ptr = head;

        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=new Node(d);
        end=ptr.next;
    }

    public void delete(){
        Node ptr = head;
        if(head==null){
            System.out.println("Empty");
            return;
        }else if(head.next==null){
            head=null;
            return;
        }

        while (ptr.next.next!=null) {
            ptr=ptr.next;
        }
        ptr.next=null;
    }


    public void deleteNEnd(int n){

        Node ptr = head;
        Node t = ptr.next;
        
        while(true){

            for(int i=0;i<n;i++){
                if(t.next==null){
                    System.out.println("Invalid n");
                    return;
                }
                t=t.next;
            }

            if(t!=null){
                ptr=ptr.next;
                t=ptr.next;
            }else{
                ptr.next=ptr.next.next;
                break;
            }

        }



    }


    public void mergeList(LinkedList list){

        Node newList = list.head;

        if(head==null){
            head = newList;
            return;
        }
        end.next=newList;
    }

    public void display(){
        Node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
       

        LinkedList l1 = new LinkedList();
        l1.insert(1);
        l1.insert(2);
        l1.insert(3);
        l1.insert(4);
        l1.insert(5);

        l.mergeList(l1);

        l.display();

        
    }

}
