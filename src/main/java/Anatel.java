public class Anatel implements Setor{
    private static Anatel instancia = new Anatel();

    private Anatel(){};

    public static Anatel getInstancia(){
        return instancia;
    }

    @Override
    public String receberLigacao() {
        return "Anatel";
    }
}
