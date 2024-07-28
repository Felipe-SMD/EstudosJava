import java.util.Scanner;

public class ControleSimplesSaque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o limite de saque diário desejado ");
        double limiteDiario = scanner.nextDouble();
    
        double saqueTotal = 0;


        for(int i=1 ; ; i++){
            System.out.println("Digite o valor de saque ou digite 0 para sair");
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0){
                System.out.println("Transações encerradas.");
                break;
            }else if (saqueTotal+ valorSaque > limiteDiario){
                System.out.println("Limite diário de saque atingido. Transações encerradas.");
                break;
            }else {
                saqueTotal += valorSaque;
                if(limiteDiario-saqueTotal == 0){
                    System.out.println("Saque realizado, limite restante: 0");
                    break;
                }else
                System.out.println("Saque realizado. Limite restante: "+ (limiteDiario - saqueTotal));
            }
        }

    }        
}
