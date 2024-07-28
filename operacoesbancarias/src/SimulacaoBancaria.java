import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        DecimalFormat df = new DecimalFormat("0.0");
        boolean continuar = true;
        System.out.println("Olá, em qual das opções você deseja continuar? Digite \n1-Depositar \n2-Sacar \n3-Consultar Saldo \n4-Encerrar");

        while (continuar) {

            int opcao = 0;
                try {
                    opcao = scanner.nextInt();
                } catch (InputMismatchException e) { //para o usuário sempre digitar o valor entre 0 e 3
                    System.out.println("Digite o valor entre 0 e 3");
                    scanner.next();
                    continue;
                }

            switch (opcao) {
                case 1:
                    boolean depositoValido = false;
                    while(!depositoValido){
                        System.out.print("Digite o valor do depósito ");
                    
                        try {double deposito = scanner.nextDouble();
                        depositarDinheiro(saldo, deposito);
                        saldo = depositarDinheiro(saldo, deposito);
                            if (deposito < 0 ){
                            System.out.println("Valor inválido");
                            }else System.out.println("Seu novo saldo é de "+ df.format(saldo));
                                depositoValido = true;
                        
                        } catch (InputMismatchException e){
                        System.out.println("Valor inválido, tente novamente");
                        scanner.next();
                        continue;}
                    }
                    break;
                case 2:
                    boolean saqueValido = false;
                    while(!saqueValido){
                    System.out.println("Digite o valor de saque ");
                    try {double saque = scanner.nextDouble();
                        if (saque <0){
                            System.out.println("Valor inválido");
                        }
                        else if (saque > saldo){
                            System.out.println("Não foi possível realizar o saque de "+ df.format(saldo) +" por falta de saldo. Seu saldo atual é "+ df.format(saldo));
                        }else {saldo = sacarDinheiro(saldo, saque);
                        System.out.println("Seu novo saldo é de "+ df.format(saldo));
                        saqueValido = true;
                        }

                        
                    } catch (InputMismatchException e) {
                        System.out.println("Digite um número");
                        scanner.next();
                    }}
                    break;
                case 3:
                    System.out.println("Saldo atual da conta: " + df.format(saldo));
                    
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    
        scanner.close();
    }
        static double depositarDinheiro(double saldo, double deposito) throws InputMismatchException{
            if(Double.isNaN(deposito) || deposito < 0){
                throw new InputMismatchException();
            
            }
            return saldo + deposito;
    }
        static double sacarDinheiro(double saldo, double saque) throws InputMismatchException{
            if(Double.isNaN(saque) || saque < 0){
                throw new InputMismatchException();
            }
            return saldo - saque;
        }
}