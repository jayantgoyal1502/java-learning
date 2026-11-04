import java.util.Scanner;
public class ArrayBasics{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of array ");
        int n = sc.nextInt();
        if(n <= 0){
            System.out.println("Array size is invalid");
            return;
        }
        int[] numbers = new int[n];
        System.out.println("Please enter the elements of your array ");
        for(int i=0;i<n;i++){
            numbers[i] = sc.nextInt();
        }
        int sum = numbers[0];
        int maxi = numbers[0];
        int mini = numbers[0];
        for(int i=1;i<n;i++){
            sum += numbers[i];
            if(maxi < numbers[i]){
                maxi = numbers[i];
            }
            if(mini > numbers[i]){
                mini = numbers[i];
            }
        }
        System.out.println("Sum of elements of array is "+ sum);
        System.out.println("Average of elements in array is "+ (double)sum/n);
        System.out.println("Maximum Element of Array is "+ maxi);
        System.out.println("Minimum element of Array is "+mini);
    }
}