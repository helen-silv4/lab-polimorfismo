public class Logradouro {
    private String nome;

    public Logradouro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "(Logradouro: " + this.getNome() + ")";
    }
}
