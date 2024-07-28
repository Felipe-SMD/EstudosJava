import java.util.Scanner;
class ParametrosInvalidosException extends Exception{

}

public class DesafioControleFluxo {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        System.out.print("Digite o primeiro parâmetro ");
        int parametroUm = terminal.nextInt();
        System.out.print("Digite o segundo parâmetro ");
        int parametroDois = terminal.nextInt();
        int contagem = parametroDois - parametroUm;
        terminal.close();

        try {
            contar(parametroUm, parametroDois);
            for (int i = 1; i<=contagem; i++){
                System.out.println("Imprimindo o número " + i);
            }
            
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    
        
    }
    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }

        }
            
}
