import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        int  contagem = parametroDois - parametroUm;
        if(parametroUm < parametroDois){

            for(int i = 0; i < contagem; i++){
                System.out.println("Primeiro número: "+ parametroUm +", Segundo número: "+parametroDois);
            }

        }else {
            throw new ParametrosInvalidosException("Os parâmetros estão incorretos");
        }
    }
}
