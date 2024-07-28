import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculadora2Numeros {
    public static void main(String[] args) throws Exception {
        DecimalFormat df = new DecimalFormat("0.####");
        Scanner scanner = new Scanner(System.in);
        double numero1 = 0;
        double numero2 = 0;
        char simbolo = ' ';
        boolean continuar = true;
        

        while (true) {
            System.out.print("Digite o primeiro número: ");
            try {
                numero1 = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas números");
                scanner.next();
            }
        }

        
        while(continuar){
            while (true) {
                System.out.print("Digite um dos operadores (+, -, *, /, ^): ");
                try {
                    simbolo = scanner.next().charAt(0);
                    if ("+-*/^".indexOf(simbolo) == -1) {
                        throw new IllegalArgumentException("Operador inválido!");
                    }
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println("Erro: Operador inválido");
                }
            }
        
            while (true) {
                System.out.print("Digite o segundo número: ");
                try {
                    numero2 = scanner.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Digite apenas números");
                    scanner.next();
                }
            }

            if (simbolo == '/' && numero2 == 0) {
                System.out.println("Erro: Não é possível dividir por zero");
            } else {
                double resultado = calcular(numero1, numero2, simbolo);
                if (Double.isNaN(resultado)) {
                    System.out.println("Erro: Operador inválido!");
                } else {
                    System.out.println("Calculando: " + df.format(numero1) + " " + simbolo + " " + df.format(numero2) + " = " + df.format(resultado));
                    numero1 = resultado; //Armazena o resultado para ser usado se o usuário desejar continuar
                }
            }
            while (true) {
                System.out.println("Deseja continuar? (s/n): ");
                char resposta = scanner.next().charAt(0);
                if (resposta == 's' || resposta == 'S'){
                    continuar = true;
                    break;
                } else if (resposta == 'n' || resposta == 'N'){
                    continuar = false;
                    break;
                } else {System.out.println("Erro: Digite apenas 's' ou 'n'");}
            }
        }
    }

    public static double calcular(double numero1, double numero2, char operador){
        switch(operador){
            case('+'):
                return numero1 + numero2;
            case('-'):
                return numero1 - numero2;
            case('*'):
                return numero1 * numero2;
            case('/'):
                return numero1 / numero2;
            case('^'):
                return Math.pow(numero1, numero2);
            default:
                return Double.NaN;
        }

        
    }
    
    
}
