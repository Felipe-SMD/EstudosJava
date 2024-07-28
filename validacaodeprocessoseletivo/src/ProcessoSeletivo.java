import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        selecaoCandidatos();
        imprimirSelecionados();
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        for (String candidato: candidatos){
            entrandoEmContato(candidato);

        }
}

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimindo a lista de candidados informando índice do elemento");
        
        for (int indice=0; indice < candidatos.length; indice++){
            System.out.println("O candidato de número " + (indice+1) + " é o " + candidatos[indice]);}
    

        System.out.println("Forma abreviada de interação for each");
        for (String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }


    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        
        int candidatosSelecionados = 0; 
        int candidatoAtual = 0; // [0] é felipe
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){ //aqui vai executar até o número de candidatos ser 5 e que o número de candidatos seja menor que os existentes da lista
            String candidato = candidatos[candidatoAtual]; //dentre os candidados, vai escolher o candidado atual[0] que é felipe, depois [1] que é márcia
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato "+ candidato + " Solicitou este valor de salário " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato "+ candidato + " Foi selecionado para a vaga");
                candidatosSelecionados++; //aqui vai mudar de candidato na ordem do array, indo para o próximo
            }
            candidatoAtual++;
        }
    }


    static double valorPretendido() {
     return ThreadLocalRandom.current().nextDouble(1800, 2200);
}


    static void analisarCandidato(double salarioPretendido){
    double salarioBase = 2000.0;
    if (salarioBase > salarioPretendido){
        System.out.println("Ligar para o candidato");
    }else if(salarioBase == salarioPretendido){
        System.out.println("Ligar para o candidato com contra proposta"); 
    }else System.out.println("Aguardando resultado dos demais candidatos");
}

    //metodo auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;}

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do { atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else
            System.out.println("Contato realizado com sucesso");
            
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu)
            {System.out.println("Conseguimos contato com " + candidato + " na "+ tentativasRealizadas + "° tentativa");
        }else
            System.out.println("Não conseguimos contato com " + candidato + ", número máximo de "+ tentativasRealizadas + " tentativas realizadas");

    }

}
