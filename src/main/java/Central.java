public class Central implements Setor{
    private static Central instancia = new Central();

    private Central(){};

    public static Central getInstancia(){
        return instancia;
    }

    @Override
    public String receberLigacao() {
        return "Cetral de Atendimento";
    }
}
