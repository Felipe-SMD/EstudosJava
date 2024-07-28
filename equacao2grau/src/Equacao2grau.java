import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Equacao2grau {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");
        double primeiroTermo = 0;
        double segundoTermo = 0;
        double terceiroTermo = 0;
        boolean entradaValida = true;

        while (true) {
            System.out.print("Digite o primeiro termo: ");
            try {
                primeiroTermo = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas números");
                scanner.next();
            }
        }

        while (true) {
            System.out.print("Digite o segundo termo: ");
            try {
                segundoTermo = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas números");
                scanner.next();
            }
        }

        while (true) {
            System.out.print("Digite o terceiro termo: ");
            try {
                terceiroTermo = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas números");
                scanner.next();
            }
        }

        try {
            if (primeiroTermo ==0){  //Verifica se o coeficiente (a) é zero, transformando a equação em uma equação de primeiro grau
                double primeiroGrau = -terceiroTermo/segundoTermo;
                throw new ArithmeticException("A equação do 2° grau sem o primeiro termo (a), se torna uma equação do 1° grau, cujo valor é: x="+ df.format(primeiroGrau));
            }
            double delta = Math.pow(segundoTermo, 2) -4*primeiroTermo*terceiroTermo; // Calcula o valor de delta
            if (delta < 0){
                throw new IllegalArgumentException("Erro: Delta = "+df.format(delta)+" -> Não existe raiz real para delta negativo");
            }
            else{ // Calcula as raízes da equação quadrática
                double resultado1 = (-segundoTermo + Math.sqrt(delta))/(2*primeiroTermo);
                double resultado2 = (-segundoTermo - Math.sqrt(delta))/(2*primeiroTermo);
                double resultado1Numerador = (-segundoTermo + Math.sqrt(delta));
                double resultado2Numerador = (-segundoTermo - Math.sqrt(delta));
                double resultadoDenominador = (2*primeiroTermo);

                // Exibe os resultados formatados
                System.out.println("Primeira raiz: x1="+ df.format(resultado1Numerador)+"/"+df.format(resultadoDenominador)+" ou x1="+ df.format(resultado1));
                System.out.println("Segunda raiz: x2="+ df.format(resultado2Numerador)+ "/"+df.format(resultadoDenominador)+" ou x2="+ df.format(resultado2));

            }
            
            } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            }
    }
}   