public class Reverse {
    static void reverse(int[] arr){
        int n=arr.length;
        int start=0;

        int end=n-1;
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        }
    }public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverse(arr);

    }
}
