public class CSE329 {
    public static void main(String[] args) {

        int[] arr = { 10, 22, 35, 43, 51 };
        System.out.println(max(arr));
        System.out.println(secondMax(arr));
        
    }

    // finding max
    public static int max(int[] arr){
        int max=arr[0];
        for(int i: arr) if(max<i) max=i;
        return max;
    }

    // finding second largest
    public static int secondMax(int[] arr){
        int max, secondMax;
        if(arr[0]>arr[1]){
            max=arr[0];
            secondMax=arr[1];
        }
        else{
            max=arr[1];
            secondMax=arr[0];
        }
        for(int i: arr) if(max<i){ secondMax=max; max=i;}
        return secondMax;
    }
}