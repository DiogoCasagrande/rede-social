package packet;

import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        Rede rede = new Rede();
        Scanner entradaInt = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);
        
        boolean loop = true;
        do {
            System.out.println("Escolha a opção 1 a 5 ");
            int opcao = entradaInt.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome");
                    String nome = entradaString.nextLine();
                    System.out.println("Digite a idade");
                    int idade = entradaInt.nextInt();
                    Pessoa temp = new Pessoa(nome,idade);
                    rede.inserir(temp);
                    break;
                case 2:
                    rede.remover();
                    break;
                case 3:
                    rede.conectarPessoas();
                    break;
                case 4:
                    rede.verificarAmigos();
                    break;
                case 5:
                    rede.noDistancia();
                    break;
                case 6:
                    rede.qtdUsuarios();
                    break;
                case 7:
                    //qtd de conexoes
                    Conexao.getQtdConexoes();
                    break;
                case 8:
                    //quais pessoas estao conectadas
                    rede.listarConexoes();
                    break;
                case 9:
                    //somatoria do peso das arestas
                    break;
                default:
                    loop = false;
                    break;
            }
        } while (loop);
    }
}
