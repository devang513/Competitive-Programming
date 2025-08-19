import java.util.Scanner;
class DivisibleBy7OrLastDigit5 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 7 == 0 || n % 10 == 5)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
