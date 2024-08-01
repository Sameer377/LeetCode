public class Q {
    private int maxSize;
    private int front;
    private int rear;
    private String[] queueArray;

    public Q(int size) {
        maxSize = size;
        queueArray = new String[maxSize];
        front = 0;
        rear = -1;
    }

    public void insert(String value) {
        if(rear == maxSize-1) {
            rear = -1;
        }
        queueArray[++rear] = value;
    }

    public String remove() {
        String temp = queueArray[front++];
        if(front == maxSize) {
            front = 0;
        }
        return temp;
    }

    public boolean isEmpty() {
        return (rear+1 == front || (front+maxSize-1 == rear));
    }

}

