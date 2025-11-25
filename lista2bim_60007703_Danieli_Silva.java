import java.util.Scanner;
import java.util.Random;

public class lista2bim_60007703_Danieli_Silva {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        char opcao;

        do {
            System.out.println("\nINICIO:");
            System.out.println("Digite a letra do exercício que deseja executar (S para sair)");
            opcao = sc.next().toUpperCase().charAt(0);

            switch (opcao) {
                case 'A':
                    exercicioA();
                    break;
                case 'B':
                    exercicioB();
                    break;
                case 'C':
                    exercicioC();
                    break;
                case 'D':
                    exercicioD();
                    break;
                case 'E':
                    exercicioE();
                    break;
                case 'F':
                    exercicioF();
                    break;
                case 'G':
                    exercicioG();
                    break;
                case 'H':
                    exercicioH();
                    break;
                case 'I':
                    exercicioI();
                    break;
                case 'J':
                    exercicioJ();
                    break;
                case 'K':
                    exercicioK();
                    break;
                case 'L':
                    exercicioL();
                    break;
                case 'M':
                    exercicioM();
                    break;
                case 'N':
                    exercicioN();
                    break;
                case 'O':
                    exercicioO();
                    break;

                case 'S':
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 'S');
    }

    // A
    public static void exercicioA() {
        System.out.println(" Exercício A ");
        System.out.print("Digite 3 números inteiros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(ordenar_inteiros(a, b, c));
    }

    public static String ordenar_inteiros(int a, int b, int c) {
        int x = a, y = b, z = c;
        if (x > y) {
            int t = x;
            x = y;
            y = t;
        }
        if (y > z) {
            int t = y;
            y = z;
            z = t;
        }
        if (x > y) {
            int t = x;
            x = y;
            y = t;
        }

        return "Número em ordem crescente: " + x + ", " + y + ", " + z + ".";
    }

    // B
    public static void exercicioB() {
        System.out.println("Exercício B ");
        String[][] matriz = {
                { "Ana", "Carlos" },
                { "João", "Pedro" }
        };
        imprime_vetor_string(matriz);
    }

    public static void imprime_vetor_string(String[][] m) {
        for (String[] linha : m) {
            for (String s : linha) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }

    // C
    public static void exercicioC() {
        System.out.println("Exercício C ");
        int[] vet = { 5, 2, 9, 1, 7 };
        int[] ordenado = ordena_vetor(vet);

        for (int n : ordenado)
            System.out.print(n + " ");
        System.out.println();
    }

    public static int[] ordena_vetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] > v[j]) {
                    int t = v[i];
                    v[i] = v[j];
                    v[j] = t;
                }
            }
        }
        return v;
    }

    // D
    public static void exercicioD() {
        System.out.println("Exercício D ");

        int[][] m = {
                { 5, 2, 1 },
                { 7, 3, 9 },
                { 4, 4, 4 }
        };

        somaLinhas(m);
    }

    public static void somaLinhas(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int soma = 0;
            for (int j = 0; j < m[i].length; j++)
                soma += m[i][j];
            System.out.println("Soma linha " + i + ": " + soma);
        }
    }

    // E
    public static void exercicioE() {
        System.out.println("Exercício E ");
        System.out.print("Nome: ");
        String nome = sc.next();
        System.out.print("Ano nascimento: ");
        int ano = sc.nextInt();

        System.out.println(transformarNome(nome, ano));
    }

    public static boolean primo(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static String transformarNome(String nome, int ano) {
        if (primo(ano)) {
            nome = nome.replaceAll("[Aa]", "@");
            nome = nome.replaceAll("[Ee]", "!");
        } else {
            nome = nome.replaceAll("[Ee]", "#");
            nome = nome.replaceAll("[Oo]", "*");
        }
        return nome;
    }

    // F
    public static void exercicioF() {
        System.out.println("Exercício F");

        String[][] alunos = {
                { "Ana Clara", "123" },
                { "Carlos Silva", "456" },
                { "Mariana Souza", "789" }
        };

        System.out.print("Buscar: ");
        sc.nextLine();
        String texto = sc.nextLine();

        String[][] achados = busca_aluno(alunos, texto);
        imprime_vetor_string(achados);
    }

    public static String[][] busca_aluno(String[][] m, String t) {
        int cont = 0;

        for (String[] linha : m) {
            if (linha[0].toLowerCase().contains(t.toLowerCase()))
                cont++;
        }

        String[][] res = new String[cont][2];
        int idx = 0;

        for (String[] linha : m) {
            if (linha[0].toLowerCase().contains(t.toLowerCase())) {
                res[idx][0] = linha[0];
                res[idx][1] = linha[1];
                idx++;
            }
        }

        return res;
    }

    // G
    public static void exercicioG() {
        System.out.println("Exercício G");

        int[] v1 = { 10, 20, 30, 40, 50, 60, 70, 80 };
        int[] v2 = { 2, 5, 0, 8, 10, 0, 7, 4 };

        double[] v3 = new double[8];

        for (int i = 0; i < 8; i++) {
            v3[i] = dividir(v1[i], v2[i]);
            System.out.println(v1[i] + " / " + v2[i] + " = " + v3[i]);
        }
    }

    public static double dividir(double a, double b) {
        if (b == 0)
            return 0;
        return a / b;
    }

    // H
    public static void exercicioH() {
        System.out.println("Exercício H");

        int[] v = new int[50];
        Random r = new Random();

        for (int i = 0; i < 50; i++)
            v[i] = r.nextInt(100) + 1;

        System.out.print("Digite número: ");
        int n = sc.nextInt();

        boolean achou = false;
        for (int x : v)
            if (x == n)
                achou = true;

        System.out.println(achou ? "Está presente" : "Não está presente");
    }

    // I
    public static void exercicioI() {
        System.out.println("Exercício I");

        int[][] m = new int[3][4];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 4; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
            }

        imprime_vetor_string(
                new String[][] {
                        { m[0][0] + "", m[0][1] + "", m[0][2] + "", m[0][3] + "" },
                        { m[1][0] + "", m[1][1] + "", m[1][2] + "", m[1][3] + "" },
                        { m[2][0] + "", m[2][1] + "", m[2][2] + "", m[2][3] + "" }
                });
    }

    // J
    public static void exercicioJ() {
        System.out.println("Exercício J");

        double[][] m = new double[5][4];
        Random r = new Random();

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 4; j++)
                m[i][j] = r.nextDouble() * 100;

        for (double[] linha : m) {
            for (double num : linha)
                System.out.printf("%.2f ", num);
            System.out.println();
        }
    }

    // K
    public static void exercicioK() {
        System.out.println("Exercício K");

        System.out.print("Digite mês (1-12): ");
        int mes = sc.nextInt();

        System.out.print("Digite tipo (1=nome, 2=abreviação): ");
        int tipo = sc.nextInt();

        System.out.println(converterMes(mes, tipo));
    }

    public static String converterMes(int mes, int tipo) {
        String[] nomes = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro" };
        String[] abrev = { "Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez" };

        if (mes < 1 || mes > 12)
            return "Mês inválido!";
        return (tipo == 1) ? nomes[mes - 1] : abrev[mes - 1];
    }

    // L
    public static void exercicioL() {
        System.out.println("Exercício L");

        sc.nextLine();
        System.out.print("Descrição: ");
        String desc = sc.nextLine();

        System.out.print("Preço bruto: ");
        double bruto = sc.nextDouble();

        System.out.print("Percentual desconto (%): ");
        double perc = sc.nextDouble();

        double liquido = bruto - (bruto * (perc / 100));

        System.out.println("Produto: " + desc);
        System.out.println("Preço bruto: " + bruto);
        System.out.println("Desconto: " + perc + "%");
        System.out.println("Preço líquido: " + liquido);
    }

    // M
    public static void exercicioM() {
        System.out.println("Exercício M");

        String[][] pedidos = {
                { "1", "Ana", "Azul", "Branco", "Preto" },
                { "2", "Maria", "Vermelho", "Cinza", "Rosa" },
                { "3", "Clara", "Verde", "Amarelo", "Preto" }
        };

        System.out.print("Digite o número do pedido: ");
        String cod = sc.next();

        boolean achou = false;
        for (String[] p : pedidos) {
            if (p[0].equals(cod)) {
                System.out.println("Pedido: " + p[0]);
                System.out.println("Cliente: " + p[1]);
                System.out.println("Cor Principal: " + p[2]);
                System.out.println("Cor Secundária: " + p[3]);
                System.out.println("Cor Complementar: " + p[4]);
                achou = true;
            }
        }

        if (!achou)
            System.out.println("Pedido não encontrado.");
    }

    // N
    public static void exercicioN() {
        System.out.println("Exercício N");

        System.out.print("Dividendo: ");
        double a = sc.nextDouble();

        System.out.print("Divisor: ");
        double b = sc.nextDouble();

        System.out.println("Resultado = " + dividir(a, b));
    }

    // O
    public static void exercicioO() {
        System.out.println("Exercício O");

        double[] notas = lerNotas();
        double media = calcularMedia(notas);

        System.out.println("Média: " + media);
        exibirSituacao(media);
    }

    public static double[] lerNotas() {
        double[] n = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            n[i] = sc.nextDouble();
        }
        return n;
    }

    public static double calcularMedia(double[] n) {
        return (n[0] + n[1] + n[2]) / 3;
    }

    public static void exibirSituacao(double m) {
        if (m >= 7)
            System.out.println("Aprovado!");
        else if (m >= 5)
            System.out.println("Recuperação.");
        else
            System.out.println("Reprovado.");
    }

}
