import java.util.Scanner;
class Lastdigit4 {
    public static void  main(String[] args){
        System.out.println("Enter a number");
        Scanner obj=new Scanner(System.in);
        int num = obj.nextInt();
        int lastDigit = num % 10;
        if(lastDigit == 4){
            System.out.println("Last digit is 4");
        }
        else{
            System.out.println("Last digit is not 4");
        }
    }
    
}
