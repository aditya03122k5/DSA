public class SumMaxAvg {
    public static void main(String[] args) {
        
        int[] arr = { 1, 2, 3, 4, 5 };

        int sum=0;
        for(int i: arr) sum+=i;
        // printing sum
        System.out.println("Sum: "+sum);

        // printing avg
        System.out.println("Avg: "+(sum/arr.length));

        // printing maximum
        int max=arr[0];
        for(int i: arr) if(i>max) max=i;
        System.out.println("Sum: "+max);    
    }
}


