import java.util.Scanner;

public class Question5 {
    public static class Aluno {
        private String nome;
        private String cpf;
        private double nota1;
        private double nota2;
        private double nota3;
        private double nota4;
        private double calculoMedia;
        public Aluno(String nome, String cpf){
            this.nome = nome;
            this.cpf = cpf;

        }

        public Aluno (double calculoMedia){
            this.calculoMedia = calculoMedia;
        }

        

        public double getCalculoMedia() {
            return calculoMedia;
        }

        public double media(double nota1, double nota2, double nota3, double nota4) {
            double calculoMedia = (nota1+nota2+nota3+nota4)/4;
            return calculoMedia;
        }

        public void setNota1(double nota1) {
            this.nota1 = nota1;
        }

        public void setNota2(double nota2) {
            this.nota2 = nota2;
        }

        public void setNota3(double nota3) {
            this.nota3 = nota3;
        }

        public void setNota4(double nota4) {
            this.nota4 = nota4;
        }

        public void setCalculoMedia(double calculoMedia) {
            this.calculoMedia = calculoMedia;
        }

        @Override
        public String toString() {
            return "Aluno [nome=" + nome + ", cpf=" + cpf + "]";
        }
        
        
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        

        Aluno aluno = new Aluno("Matheus", "763537381-00");
        System.out.println("Nota 1: ");
        aluno.setNota1(s.nextDouble());     
        System.out.println("Nota 2: ");  
        aluno.setNota2(s.nextDouble());
        System.out.println("Nota 3: ");
        aluno.setNota3(s.nextDouble());
        System.out.println("Nota 4: ");
        aluno.setNota4(s.nextDouble());

        aluno.setCalculoMedia(aluno.media(aluno.nota1,aluno.nota2,aluno.nota3,aluno.nota4));
        
        System.out.println("Média: "+ aluno.getCalculoMedia());
        
        System.out.println("Mude a nota 2: ");
        aluno.setNota2(s.nextDouble());
        aluno.setCalculoMedia(aluno.media(aluno.nota1,aluno.nota2,aluno.nota3,aluno.nota4));

        System.out.println(aluno.toString());
        System.out.println("Nota 2 alterada: "+ aluno.getCalculoMedia());

        
    }
}
