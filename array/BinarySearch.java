public class BinarySearch {

    public int search(int arr[],int left ,int right , int data){



            if(left>right){
                return -1;
            }
            int  mid = left+(right-left) /2;

            if(arr[mid] == data){
                return mid;
            }else if(data>arr[mid]){
               return  search(arr,mid+1,right,data);
            }else if(data<arr[mid]){
              return search(arr,left,mid-1,data);
            }

            return -1;


    }

    public static void main(String[] args) {

        int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10};


        int res = new BinarySearch().search(arr,0,arr.length-1,11);
        System.out.printf(res+"");
    }
}
