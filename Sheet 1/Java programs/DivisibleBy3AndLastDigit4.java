import java.util.Scanner;
class DivisibleBy3AndLastDigit4 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        if(n % 3 == 0 && n % 10 == 4){
            System.out.println("Yes");}
        else{
            System.out.println("No");}
    }
}
