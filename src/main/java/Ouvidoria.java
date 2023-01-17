public class Ouvidoria implements Setor{
    private static Ouvidoria instancia = new Ouvidoria();

    private Ouvidoria(){};

    public static Ouvidoria getInstancia(){
        return instancia;
    }

    @Override
    public String receberLigacao() {
        return "Ouvidoria";
    }
}
