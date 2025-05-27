class MyHashMap {


    int size;
    Node table[];

    public MyHashMap() {
        size = 1000000;
        table = new Node[size];
    }
    
    private int getIndex(int key){
        Integer i = key;
        return Math.abs(i.hashCode())%size;
    }

    public void put(int key, int value) {
        
        int hash = getIndex(key);

        Node head = table[hash];

        if(head==null){
            table[hash] = new Node(key,value);
            return;
        }

        if(head.key==key){
            head.value=value;
            return;
        }

        while(head.next!=null){
            if(head.key==key){
                head.value = value;
                return;
            }
            head = head.next;
        }

        head.next = new Node(key,value);
    }
    
    public int get(int key) {
        int hash = getIndex(key);

        Node head = table[hash];
        while(head!=null){
            if(head.key==key){
                return head.value;
            }

            head = head.next;
        }

        return -1;
    }
    
    public void remove(int key) {
        
        int hash = getIndex(key);

        Node head = table[hash];

        if(head==null) return ;

        if(head.key==key){
            table[hash] = table[hash].next;
            return;
        }

        while(head.next!=null && head.key!=key){
            head= head.next;
        }

        Node temp = head.next;
        head.next=temp.next;
        
    }

    class Node{
        int value=-1;
        int key;
        Node next;
        public Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }

}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */