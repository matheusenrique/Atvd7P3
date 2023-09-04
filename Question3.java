public class Question3 {
    public static class Lutador {
        private String nome;
        private int energia;
        private int forca;

        public Lutador(String nome, int energia, int forca){
            this.nome = nome;
            this.energia = energia;
            this.forca = forca;
        }

        public void reduzirEnergia(int vida){
            vida = this.energia;
            this.energia = this.energia - getForca();
        }

        public void aplicarGolpe(Lutador lutador){
            int dano = this.forca;
            lutador.reduzirEnergia(dano);
            System.out.println(this.nome + " aplicou "+this.getForca()+" em "+lutador.getNome());
        }
        public String getNome() {
            return nome;
        }
    
        public int getEnergia() {
            return energia;
        }
    
        public int getForca() {
            return forca;
        }
    
    }
    public static void main(String[] args) {
        Lutador ryu = new Lutador("RYU", 100, 10);
        Lutador bison =  new Lutador("BISON", 100, 12);

        for (int i = 0; i < 3; i++) {
            ryu.aplicarGolpe(bison);
       }
        System.out.println("Energia de Bison: "+ bison.getEnergia());

        System.out.println("------------------------------------------------");
       for (int i = 0; i < 8 ; i++) {
            bison.aplicarGolpe(ryu);
       }
       System.out.println("Energia de Ryu: "+ryu.getEnergia());
        
    }
    
}
