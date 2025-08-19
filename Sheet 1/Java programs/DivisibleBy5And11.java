import java.util.Scanner;
class DivisibleBy5And11 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a % 5 == 0 && a % 11 == 0)
            System.out.println("Divisible by both");
        else
            System.out.println("Not divisible by both");
    }
}
