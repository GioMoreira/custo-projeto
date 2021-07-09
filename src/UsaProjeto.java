import java.util.Scanner;

public class UsaProjeto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome;
        double custo;
        Projeto objProjeto;
        Projeto arrProjeto[] = new Projeto[5];

        for (int i =0; i < arrProjeto.length; i++){
            System.out.println("Nome do Projeto" + (i+1) + ":");
            nome = ler.nextLine(); ler.nextLine();
            System.out.println("Custo da hora: ");
            custo = ler.nextDouble();
            objProjeto = new Projeto(nome,custo);
            arrProjeto[i] = objProjeto;
        }

        int opcao = 0;
        int totalHoras=0;
        int pjt;

        while (opcao != 9){
            System.out.println("Qual projeto quer consultar?  (de 1 a 5)");
            pjt = ler.nextInt() - 1;
            System.out.println("=== MENU ===");
            System.out.println("1. Registrar Horas");
            System.out.println("2. Consultar Custo do Projeto");
            System.out.println("9. Encerrar programa");
            opcao = ler.nextInt();


            switch (opcao){
                case 1:
                    System.out.println("Digite o número de horas: ");
                    totalHoras += ler.nextInt();
                    arrProjeto[pjt].registarHoras(totalHoras);
                    System.out.println("Total de horas trabalhadas: ");
                    System.out.println(totalHoras);
                    break;

                case 2:
                    System.out.println("Custo atual do projeto: ");
                    double custoTotal = arrProjeto[pjt].getCustoAtual();
                    System.out.println(custoTotal);
                    break;

                case 9:
                    System.out.println("Programa finalizado com sucesso!");
                    break;

                default:
                    System.out.println("Opção Inválida.");
            }

             /*
            if (opcao == 1){
                System.out.println("Digite o número de horas: ");
                int hora = ler.nextInt();
                totalHoras += hora;
                pjt1.registarHoras(totalHoras);
                System.out.println(totalHoras);
            }
            else if (opcao == 2){
                System.out.println("Custo atual do projeto: ");
                double custoTotal = pjt1.getCustoAtual();
                System.out.println(custoTotal);
            }
            else if (opcao == 9){
                break;
            }
            else{
                System.out.println("Opção Inválida!");
            } */
        }
    }
}
