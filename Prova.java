import java.util.Scanner;

public class Prova{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int time = sc.nextInt();
        if (time < 10) {
            System.out.println("good morning");
        }else if (time < 18) {
            System.out.println("good afternoon");
        }
        else{
            System.out.println("good evening");
        }
        sc.close();
    }
}