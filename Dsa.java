public class Dsa {
    public static int getMissingNum(int[] a,int n,int m){
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+a[i];
        }
        return (m*(m+1))/2-(sum);
    }
    public static void main(String[] args) {
        int n=5;
        int m=n+1;
        int[] a={1,4,5,3,6};
        int result=getMissingNum(a,n,m);
        System.out.println(result);


    }}