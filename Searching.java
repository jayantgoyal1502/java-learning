import java.util.Scanner;
public class Searching{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Enter a valid array size");
            return;
        }
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter the number you wish to search for : ");
        int target = sc.nextInt();
        for(int i=0;i<n;i++){
            if(numbers[i] == target){
                System.out.println(target + "is found at index " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}