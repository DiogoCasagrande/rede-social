package packet;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Rede rede = new Rede();
        Scanner entradaInt = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

        boolean loop = true;
        do {
            System.out.println(" ");
            System.out.println("-------------------");
            System.out.println("Escolha a opção 1 a 5 ");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Remover");
            System.out.println("3 - criar conexao entre pessoas");
            System.out.println("4 - Listar amigos");
            System.out.println("5 - distancia de nos (incompleto)");
            System.out.println("6 - Status da rede");
            System.out.println("7 - listar matriz de adj");
            System.out.println("0 - exit");
            System.out.println("----------------------");
            System.out.println(" ");
            int opcao = entradaInt.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome");
                    String nome = entradaString.nextLine();
                    System.out.println("Digite a idade");
                    int idade = entradaInt.nextInt();
                    Pessoa temp = new Pessoa(nome, idade);
                    rede.inserir(temp);
                    break;
                case 2:
                    System.out.println("Digite o nome que quer remover");
                    rede.remover(entradaString.nextLine());
                    break;
                case 3:
                    System.out.println("Criar conexao");
                    System.out.println("Pessoa A");
                    String pessoaA = entradaString.nextLine();
                    System.out.println("Pessoa B");
                    String pessoaB = entradaString.nextLine();
                    System.out.println("quantos anos se conhecem");
                    int tempo = entradaInt.nextInt();
                    rede.conectarPessoas(pessoaA, pessoaB, tempo);
                    break;
                case 4:
                    System.out.println("Digite o nome da pessoa a qual quer buscar amigos");
                    String busca;
                    busca = entradaString.nextLine();
                    System.out.println(" ");
                    String resultBusca = rede.verificarAmigos(busca);
                    System.out.println(resultBusca);
                    break;
                case 5:
                    System.out.println("Distancia de Nos entre pessoas");
                    System.out.println("Pessoa A");
                    String pessoa1 = entradaString.nextLine();
                    System.out.println("Pessoa B");
                    String pessoa2 = entradaString.nextLine();
                    if (rede.noDistancia(pessoa1, pessoa2) != 0) {
                        System.out.println(" a quantidade de nos de distancia é = " + rede.noDistancia(pessoa1, pessoa2));
                    } else {
                        System.out.println("essas duas pessoas não são amigas");
                    }
                    break;

                case 6:
                    //--------status da rede-----------
                    System.out.println(" ");
                    System.out.println("Status da rede");
                    //qtd de usuarios cadastrados
                    System.out.println("Quantidade de usuários");
                    System.out.println(rede.qtdUsuarios());
                    //qtd de conexoes
                    System.out.println("Quantidade de conexoes");
                    System.out.println(Conexao.getQtdConexoes());
                    //quais pessoas estao conectadas
                    System.out.println("quais pessoas estao conectadas");
                    rede.listarConexoes();
                    //somatoria do peso das arestas
                    System.out.println("somatoria do peso das arestas");
                    rede.qtdArestas();

                    //listar todos os usuarios
                    System.out.println("listar todos os usuarios");
                    System.out.println(rede.listarUsuarios());

                    break;
                case 7:
                    //listar matriz de adj
                    System.out.println("matriz de adj");
                    System.out.println("___________");
                    System.out.println(rede.listarMatriz());
                    System.out.println("               ");
                    break;
                default:
                    loop = false;
                    break;
            }

        } while (loop);
    }
}
