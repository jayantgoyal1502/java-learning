import java.util.Scanner;
public class MethodPractice{

    public static int square(int n){
        return n*n;
    }
    public static boolean isEven(int n){
        return n%2 == 0;
    }

    public static int findMax(int a, int b, int c){
        if(a >= b && a >= c){
            return a;
        }else if(b >= a && b >= c){
            return b;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int sq = square(num1);
        System.out.println("Sqaure of "+ num1 + " is "+ sq);
        if(isEven(num2)){
            System.out.println(num2 + " is Even");
        }else{
            System.out.println(num2 + " is Odd");
        }
        int largest = findMax(num1, num2, num3);
        System.out.println("Largest of the three numbers "+num1 + " , "+num2 + " & " +num3 + " is " + largest);
    }
}