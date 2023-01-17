public class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String ligarPara(Setor setor){
        return URA.getInstancia().transferirChamada(setor);
    }
}
