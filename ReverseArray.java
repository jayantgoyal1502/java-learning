import java.util.Scanner;
public class ReverseArray{
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
        if(n==1){
            System.out.println(numbers[0]);
            return;
        }
        int left = 0, right = n-1;
        while(left < right){
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
        for(int num : numbers){
            System.out.print(num + " ");
        }
    }
}