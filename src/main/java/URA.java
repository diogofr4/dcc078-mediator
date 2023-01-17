public class URA {
    private static URA instancia = new URA();

    private URA(){};

    public static URA getInstancia(){
        return instancia;
    }

    public String transferirChamada(Setor setor){
        return  "Conectando com um de nossos atendentes na " + setor.receberLigacao();
    }
}
