public class Question1 {
    public static class Paciente {
        private int codigo;
        private String nomePaciente;
        private String dataNascimento;
        private String sexo;
        private String planoSaude;
        private String alergia;
        private String tipoSanguineo;

        public Paciente(int codigo, String nomePaciente, String dataNascimento, String sexo, String planoSaude, String alergia, String tipoSanguineo){
            this.codigo = codigo;
            this.nomePaciente = nomePaciente;
            this.dataNascimento = dataNascimento;
            this.sexo = sexo;
            this.planoSaude = planoSaude;
            this.tipoSanguineo = tipoSanguineo;
            this.alergia = alergia;
        }

        @Override
        public String toString() {
            return "Paciente [codigo=" + codigo + ", nome=" + nomePaciente + ", dataNascimento=" + dataNascimento + ", sexo="
                    + sexo + ", planoSaude=" + planoSaude + ", alergia=" + alergia + ", tipoSanguineo=" + tipoSanguineo
                    + "]";
        }

        public void imprimirDados(){
            System.out.println("Código do paciente: "+codigo);
            System.out.println("Nome do paciente: "+nomePaciente);
            System.out.println("Data de nascimento: "+dataNascimento);
            System.out.println("Sexo: "+sexo);
            System.out.println("Plano de saúde: "+planoSaude);
            System.out.println("Alergias: "+alergia);
            System.out.println("Tipo sanguíneo: "+tipoSanguineo);
        }

        public void novosDados(int codigoNovo, String nomePacienteNovo, String dataNascimentoNovo, String sexoNovo, String planoSaudeNovo, String alergiaNovo, String tipoSanguineoNovo){
            codigo = codigoNovo;
            nomePaciente = nomePacienteNovo;
            dataNascimento = dataNascimentoNovo;
            sexo = sexoNovo;
            planoSaude = planoSaudeNovo;
            alergia = alergiaNovo;
            tipoSanguineo = tipoSanguineoNovo;
        }

        
    }
    public static void main(String[] args) {
        Paciente paciente =  new Paciente(001, "Matheus", "20/10/2003", "Masculino","Unimed", "Sem alergia", "O");
        System.out.println("Informações do paciente: ");
        paciente.imprimirDados();
        System.out.println("--------------------------------------------------------------------------------------");
        paciente.novosDados(002, "Marina", "16/09/2004", "Feminino", "Unimed", "Asma", "A");
        System.out.println("Novo paciente: ");
        paciente.imprimirDados();;
        
    }
}
