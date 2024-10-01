import java.util.Scanner;
public class CalculadoraDeMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Luis", "Pedro"};

        int media = calcularMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %d  ", media);

    }

    public static int calcularMediaDaTurma(String[] alunos, Scanner scanner) {
        int soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s :", aluno);
            int nota = scanner.nextInt();
            soma += nota;

        }
        System.out.println(alunos.length);
        return soma / alunos.length;
    }

}
