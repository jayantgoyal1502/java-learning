import java.util.Scanner;
public class RemoveDuplicates{

    public static int removeDuplicates(int[] arr){
        if(arr.length == 0)return 0;
        int i = 0;
        for(int j=1;j<arr.length;j++){
            if(arr[j] != arr[i]){
                i = i+1;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
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
        int count = removeDuplicates(arr);
        System.out.println("Count of unique elements in the array is "+ count);
        System.out.println("Unique elements are : ");
        for(int i=0;i<count;i++){
            System.out.println(arr[i]);
        }
    }
}