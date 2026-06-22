public class ArrayTraversal {
    public static void main(String[] args) {
        
        int[] arr = new int[5];

        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1) * 10; 
        }

        
        System.out.print("arr: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println();

        
        int[] arr2 = { 1, 2, 3, 4, 5 };

        
        System.out.print("arr2: ");
        for (int value : arr2) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}


