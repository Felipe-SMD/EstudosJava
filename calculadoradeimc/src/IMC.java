
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) throws Exception {
        
        double altura = 0;
        double peso = 0;
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");
    
        

        while (true) {
            try {
                System.out.print("Digite sua altura em centímetros: ");
                altura = scanner.nextDouble();
                if (altura <=0){
                    System.out.println("Erro: Digite uma altura maior que 0");
                    continue;
                }
                break;
                
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas números");
                scanner.next();
                
            }
        }

        while (true) {
            try {
                System.out.print("Digite seu peso em quilos: ");
                peso = scanner.nextDouble();
                if (peso<=0){
                    System.out.println("Erro: Digite um peso maior que 0");
                    continue;
                }
                break;

                
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas números");
                scanner.next();
                
            }
        }
        double imc = calcularIMC(altura, peso);
        

        if (imc<16.9){
            System.out.println("Seu IMC é: "+df.format(imc)+" Classificação - Muito abaixo do peso");
        } else if (imc>=17 && imc <=18.4){
            System.out.println("Seu IMC é: "+df.format(imc)+" Classificação - Abaixo do peso");
        } else if (imc>=18.5 && imc <=24.9){
            System.out.println("Seu IMC é: "+df.format(imc)+" Classificação - Peso ideal");
        } else if (imc>=25 && imc <=29.9){
            System.out.println("Seu IMC é: "+df.format(imc)+" Classificação - Acima do peso");
        } else if (imc>30 && imc <=34.9){
            System.out.println("Seu IMC é: "+df.format(imc)+" Classificação - Obesidade grau 1");
        } else if (imc>35 && imc <=40){
            System.out.println("Seu IMC é: "+df.format(imc)+" Classificação - Obesidade Grau 2");
        } else if (imc>40){
            System.out.println("Seu IMC é "+df.format(imc)+" Classificação - Obesidade Grau 3");
        }


        double pesoIdealMin = 18.5 * Math.pow(altura*0.01, 2);
        double pesoIdealMax = 24.9 * Math.pow(altura*0.01, 2);

        if (peso < pesoIdealMin){
            double ganharPeso = pesoIdealMin - peso;
            System.out.println("Você precisa ganhar "+ df.format(ganharPeso)+"KG para ficar no peso ideal");

        }else if (peso > pesoIdealMax){
            double perderPeso = peso - pesoIdealMax;
            System.out.println("Você precisa perder "+df.format(perderPeso)+"KG para ficar no peso ideal");
        }
        System.out.println("IMC - CLASSIFICAÇÃO \nMenor que 18.5 - Abaixo do peso \nEntre 18.5 e 24.9 - Peso normal \nEntre 25.0 e 29.9 - Pré-obesidade \nEntre 30.0 e 34.9 - Obesidade Grau 1 \nEntre 35.0 e 39.9 - Obesidade Grau 2  \nAcima de 40 - Obesidade Grau 3");

       
    }

    static double calcularIMC(double altura, double peso){
        return peso / (Math.pow((altura*0.01), 2));


    }
}
