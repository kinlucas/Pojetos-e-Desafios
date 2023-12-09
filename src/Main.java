import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Você quer saber todos os números pares entre 0 e:");

        int num = sc.nextInt();
        int i = 0;
        System.out.print("Números pares até " + num + ": ");
        for(i = 2; i <= num; i = i + 2){
            System.out.print(i);
            if(i+2 <= num){
                System.out.print(", ");
            }
        }
        System.out.print(".");
    }
}