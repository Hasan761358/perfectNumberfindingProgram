import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int number,total=0;

        System.out.print("Lütfen bir sayı giriniz : ");
        number= scan.nextInt();
        for(int i=1; i<number;i++){
            if(number%i==0){
                total+=i;
                System.out.println(total);
            }
        }
        if (total==number){
            System.out.println("Sayı mükemmel sayıdır. ");
        }else{
            System.out.println("Mükemmel sayı değildir.");
        }
    }
}