import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculadoraGordura {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");
        double peso = 0;
        double altura = 0;
        double cintura = 0;
        double pescoco = 0;
        double quadril = 0;
        double idade = 0;

        int sexo = 0;
        System.out.println("Calculadora de gordura da Marinha dos EUA");

        while (true) {
            try {
                System.out.println("1-Homem\n2-Mulher");
                System.out.print("Sexo: ");
                sexo = scanner.nextInt();

                if (sexo != 1 && sexo != 2) {
                    System.out.println("Valor inválido, digite 1 ou 2 ");
                    continue;
                }
                if (sexo==1){
                    System.out.print("Idade: ");
                    idade = scanner.nextDouble();
                    System.out.print("Peso(kg): ");
                    peso = scanner.nextDouble();
                    System.out.print("Altura(cm): ");
                    altura = scanner.nextDouble();
                    System.out.print("Pescoço(cm): ");
                    pescoco = scanner.nextDouble();
                    System.out.print("Cintura(cm): ");
                    cintura = scanner.nextDouble();
                        
                    double porcentagemGorduraHomem = 495 / (1.0324 - 0.19077 * Math.log10(cintura - pescoco) + 0.15456 * Math.log10(altura)) - 450;
                    System.out.println("Porcentagem de gordura corporal: "+df.format(porcentagemGorduraHomem));
                    System.out.println("18 a 21 anos - saudável até 22%\n22 a 29 anos - saudável até 23%\n30 a 39 anos - saudável até 24%\n40 anos ou mais - saudável até 26%");
                }
                if (sexo ==2){
                    System.out.print("Idade: ");
                    idade = scanner.nextDouble();
                    System.out.print("Peso(kg): ");
                    peso = scanner.nextDouble();
                    System.out.print("Altura(cm): ");
                    altura = scanner.nextDouble();
                    System.out.print("Pescoço(cm): ");
                    pescoco = scanner.nextDouble();
                    System.out.print("Cintura(cm): ");
                    cintura = scanner.nextDouble();
                    System.out.print("Quadril(cm): ");
                    quadril = scanner.nextDouble();

                    double porcentagemGorduraMulher = 495 / (1.29579 - 0.35004 * Math.log10(cintura + quadril - pescoco) + 0.22100 * Math.log10(altura)) - 450;
                    System.out.println("Porcentagem de gordura corporal: "+ df.format(porcentagemGorduraMulher));
                    System.out.println("18 a 21 anos - saudável até 33%\n22 a 29 anos - saudável até 34%\n30 a 39 anos - saudável até 35%\n40 anos ou mais - saudável até 36%");
                }
            
 
            } catch (InputMismatchException e) {
                System.out.println("Digite somente números");
                scanner.next();
            }
                
        }
    
    }

}

