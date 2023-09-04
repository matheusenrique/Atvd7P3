public class Question2 {
    public static class Medico {
        private int codigo;
        private String nome;
        private String sexo;
        private String especialidade;
        private String endereco;

        public Medico(int codigo, String nome, String sexo, String especialidade, String endereco){
            this.codigo = codigo;
            this.nome = nome;
            this.sexo = sexo;
            this.especialidade = especialidade;
            this.endereco = endereco;
        }

        @Override
        public String toString() {
            return "Medico [codigo=" + codigo + ", nome=" + nome + ", sexo=" + sexo + ", especialidade=" + especialidade
                    + ", endereco=" + endereco + "]";
        }

        public void imprimirDados(){
            System.out.println("Código: "+codigo);
            System.out.println("Nome do médico: "+nome);
            System.out.println("Sexo: "+sexo);
            System.out.println("Especialidade médica: "+especialidade);
            System.out.println("Endereço: "+endereco);
        }

        public void novosDados(int codigoNovo, String nomeNovo, String sexoNovo, String especialidadeNovo, String enderecoNovo){
            codigo =  codigoNovo;
            nome = nomeNovo;
            sexo = sexoNovo;
            especialidade = especialidadeNovo;
            endereco = enderecoNovo;
        }
        

    }
    public static class Endereco {
        private String rua;
        private int numero;
        private String complemento;
        private String bairro;
        private String cidade;
        private String uf;
        private String cep;

        public Endereco(String rua, int numero, String complemento, String bairro, String cidade, String uf, String cep){
            this.rua = rua;
            this.numero = numero;
            this.complemento = complemento;
            this.bairro = bairro;
            this.cidade = cidade;
            this.uf = uf;
            this.cep = cep;
        }

        @Override
        public String toString() {
            return "Endereco [rua=" + rua + ", numero=" + numero + ", complemento=" + complemento + ", bairro=" + bairro
                    + ", cidade=" + cidade + ", uf=" + uf + ", cep=" + cep + "]";
        }

        public void imprimirDados(){
            System.out.println("Rua: "+rua);
            System.out.println("Número: "+numero);
            System.out.println("Complemento: "+complemento);
            System.out.println("Bairro: "+bairro);
            System.out.println("Cidade: "+cidade);
            System.out.println("UF: "+uf);
            System.out.println("Cep: "+cep);
        }

        public void novosDados(String ruaNovo, int numeroNovo, String complementoNovo, String bairroNovo, String cidadeNovo, String ufNovo, String cepNovo){
            rua = ruaNovo;
            numero = numeroNovo;
            complemento = complementoNovo;
            bairro = bairroNovo;
            cidade =  cidadeNovo;
            uf = ufNovo;
            cep = cepNovo;
        }

        

    }
    public static void main(String[] args) {
        Medico medico = new Medico(1, "Matheus", "Masculino", "Cirurgião", "ABC");
        System.out.println("Dados do médico: ");
        medico.imprimirDados();

        System.out.println("");
        
        Endereco endereco = new Endereco("ABC", 1, "Apartamento 10", "Boa Viagem", "Recife", "abc", "123-45");
        System.out.println("Endereço: ");
        endereco.imprimirDados();
        
        System.out.println("----------------------------------------------------------------------------------");
        
        medico.novosDados(2, "Rennan", "Masculino", "Cirurgião", "DEF");
        System.out.println("Dados do médico: ");
        medico.imprimirDados();

        System.out.println("");

        endereco.novosDados("DEF", 2, "Apartamento 2", "Candeias", "Recife", "def", "678-90");
        System.out.println("Endereço: ");
        endereco.imprimirDados();
    }
}
