import java.util.Scanner;

public class Principal{
    public static void main(String [] args){
        Scanner teclado=new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("------ Menu---------");
        System.out.println("1-classificar um animal-");
        System.out.println("2-Ver a classificação completa dos aniamais");
        System.out.println("Insira uma das opções acima");
        int opcao=teclado.nextLine();
        switch (opcao){
            case 1:
            System.out.println("Classificar um animal");
            break;

            case 2:
            System.out.println("Ver a classificação completa dos animais");
            break;

        }
        

    }
}

