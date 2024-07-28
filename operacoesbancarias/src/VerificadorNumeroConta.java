import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número da sua conta ");

    try {
        String numeroConta = scanner.nextLine();
        VerificarNumeroConta(numeroConta);
        if (numeroConta.length()==8){
            System.out.println("Número de conta válido");
        }

    } catch (IllegalArgumentException e) {
        System.out.println("Número de conta inválido "+ e.getMessage());
    } finally {
        scanner.close();
    }
    

    }
    private static void VerificarNumeroConta(String numeroConta){
        if (numeroConta.length() != 8){
            System.out.println("Erro: Número de conta inválido. Digite exatamente 8 dígitos.");
        }
    }
}