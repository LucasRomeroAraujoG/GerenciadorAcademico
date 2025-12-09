import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean menu = true;

        while (menu) {
            //Menu do projeto
            System.out.println("1) Alunos");
            System.out.println("2) Cursos");
            System.out.println("3) Matrículas");
            System.out.println("4) Notas");
            System.out.println("5) Relatórios");
            System.out.println("0) Sair");

            //Validações das entradas, para que seja possível APENAS números entre 0, 5

            int opcaoMenu;

            while (true) {
                System.out.print("Escolha uma opção: ");

                if (sc.hasNextInt()) {
                    opcaoMenu = sc.nextInt();

                    if (opcaoMenu >= 0 && opcaoMenu <= 5) {
                        break;
                    }
                } else {
                    sc.next();
                }

                System.out.println("Opção inválida! Tente novamente.");
            }

            //Início das opções

            switch (opcaoMenu) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("O programa será encerrado... aguarde!");
                    menu = false;
                    break;

            }
        }
        System.out.println("Programa encerrado com sucesso!");
        sc.close();
    }
}
