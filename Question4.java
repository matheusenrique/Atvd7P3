public class Question4 {
    public static class Post {
        private String texto;
        private String link;
        private int numeroCurtidas;
        private int numeroCompartilhamentos;
        
        public Post(String texto, String link) {
            this.texto = texto;
            this.link = link;
        }
        
        public void curtir(int curtida){
            curtida = numeroCurtidas;
            numeroCurtidas = curtida + 1;
        }

        public void compartilhamentos(int compartilhar){
            compartilhar = numeroCompartilhamentos;
            numeroCompartilhamentos = compartilhar +1;
        }
    }

    public static void main(String[] args) {
        Post post = new Post("Hello, World!", "https://discord.com/");
        for (int i = 0; i < 3; i++) {
            post.curtir(0);
        }
        System.out.println("Número de curtidas: " + post.numeroCurtidas);
        
        for (int i = 0; i < 2; i++) {
            post.compartilhamentos(0);
        }
        System.out.println("Compartilhamentos: "+ post.numeroCompartilhamentos);
    }
}
