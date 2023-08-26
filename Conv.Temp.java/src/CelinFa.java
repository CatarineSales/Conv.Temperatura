import java.util.Scanner;
public class CelinFa{
    public static void main(String[] args){
        int cel;
        int far;
        int aux;
        int far1;
        double cel1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite '0' para converter graus celsius em Fahrenheit ou digite '1' para converter graus Fahrenheit em graus Celsius.");
        aux = sc.nextInt();

        if(aux == 0){
            System.out.print("Digite a temperatura em graus Celsius: ");
            cel = sc.nextInt();

            far = (9 * cel + 160)/5;
            System.out.println("A temperatura convertida em Fahrenheit é: " + far);

        }else{
            System.out.print("Digite a temperatura em graus Fahrenheit: ");
            far1 = sc.nextInt();

            cel1 = (far1 - 32)/1.8;
            System.out.println("A temperatura convertida em Celsius é: " + cel1); 
        }


    }
}