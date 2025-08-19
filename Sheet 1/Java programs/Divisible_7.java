import java.util.Scanner;
class Divisible_7{
    public static void main (String[] args){
        System.out.println("enter a number");
        Scanner obj =new Scanner(System.in);
        int num =obj.nextInt();
        if(num % 7 == 0){
            System.out.println("Divisible by 7");
        }
        else{
            System.out.println("Not divisible by 7");
        }
    }
}
