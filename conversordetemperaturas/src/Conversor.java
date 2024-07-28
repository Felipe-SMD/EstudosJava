import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Conversor de temperaturas: Graus Celsius, Graus Fahrenheit e Kelvin");
        int opcao = 0;
        double temperatura = 0;
        DecimalFormat df = new DecimalFormat("0.##");
        
    
        while (true) { 
            System.out.println("Digite de 0 a 6 para continuar:\n1-Celsius para Fahrenheit\n2-Celsius para Kelvin\n3-Fahrenheit para Celsius\n4-Fahrenheit para Kelvin\n5-Kelvin para Celsius\n6-Kelvin para Fahrenheit\n0-Encerrar");
            try {
                opcao = scanner.nextInt();  
                if (opcao >= 0 && opcao <=6){
                    break;
                } else {
                    System.out.println("Digite apenas números de 0 a 6");
                }
             
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números de 0 a 6");
                scanner.next();
            }
        }
    
        if(opcao != 0){
            while (true) {
                System.out.print("Temperatura: ");
                try {
                    temperatura = scanner.nextDouble();
                    break;   
                } catch (InputMismatchException e) {
                    System.out.print("Digite a temperatura (use ponto para decimais). ");
                    scanner.next();   
                }
            }
        }
    
    
        

       switch (opcao) {
        case 0:
            System.out.println("Programa encerrado");
            
            break;
        case 1:
            System.out.println("Convertendo de Celsius para Fahrenheit:");
            double celsiusParaFahrenheit = (temperatura * 9 / 5) + 32;
            System.out.println(df.format(temperatura)+"°C = "+df.format(celsiusParaFahrenheit)+"°F");
            break;
        case 2:
            System.out.println("Convertendo de Celsius para Kelvin:");
            double celsiusParaKelvin = temperatura + 273.15;
            System.out.println(df.format(temperatura)+"°C = "+df.format(celsiusParaKelvin)+"K");
            break;
        case 3:
            System.out.println("Convertendo de Fahrenheit para Celsius:");
            double fahrenheitParaCelsius = (temperatura - 32) * 5 / 9;
            System.out.println(df.format(temperatura)+"°F = "+df.format(fahrenheitParaCelsius)+"°C");
            break;
        case 4:
            System.out.println("Convertendo de Fahrenheit para Kelvin;");
            double fahrenheitParaKelvin = (temperatura - 32) * 5 / 9 + 273.15;
            System.out.println(df.format(temperatura)+"°F = "+df.format(fahrenheitParaKelvin)+"K");
            break;
        case 5:
            System.out.println("Convertendo de Kelvin para Celsius");
            double kelvinParaCelsius = temperatura - 273.15;
            System.out.println(df.format(temperatura)+"K = "+df.format(kelvinParaCelsius)+"°C");
            break;
        case 6:
            System.out.println("Convertendo de Kelvin para Fahrenheit");
            double kelvinParaFahrenheit = (temperatura - 273.15) * 9 / 5 + 32;
            System.out.println(df.format(temperatura)+"K = "+df.format(kelvinParaFahrenheit)+"°F");
            break;    
        default:
            System.out.println("Número inválido, digite entre 0 a 6");
            break;
       }

    }
}
