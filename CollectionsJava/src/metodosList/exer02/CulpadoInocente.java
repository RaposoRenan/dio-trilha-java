package metodosList.exer02;

import java.util.*;

public class CulpadoInocente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();

        System.out.println("Perguntas: ");
        System.out.println("\nTelefonou para vítima? ");
        String resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Esteve no local do crime? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Mora perto da vítima? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Devia para vítima? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Já trabalhou com a vítima? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(respostas);

        int count = 0;
        Iterator<String> contador = respostas.iterator();
        while (contador.hasNext()){
            String resp = contador.next();
            if (resp.contains("s")){
                count++;
            }
        }
        switch (count){
            case (2):
                System.out.println(">> SUSPEITA <<"); break;
            case (3):
            case (4):
                System.out.println(">> CÚMPLICE <<"); break;
            case (5):
                System.out.println(">> ASSASSINO <<"); break;
            default:
                System.out.println(">> INOCENTE <<"); break;
        }

    }
}
