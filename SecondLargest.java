import java.util.Scanner;
public class SecondLargest{

    public static Integer findSecondLargest(int[] arr){
        int n = arr.length;
        if(n < 2) return null;
        int largest = arr[0];
        Integer secondLargest = null;
        for (int i = 1; i < n; i++) {
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] < largest && (secondLargest == null || arr[i] > secondLargest)){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        if(n <= 0){
            System.out.println("Please enter a valid array size");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter the elements of array ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Integer result = findSecondLargest(arr);
        if(result == null){
            System.out.println("No second largest");
            return;
        }
        System.out.println("Second largest element in the array is "+ result);
    }
}