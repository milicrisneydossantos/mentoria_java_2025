package entities;

public class Cliente {
    private String nome;
    private String nif;
    private String telefone;

    public Cliente() {
    }

    public Cliente(String nome, String nif, String telefone) {
        this.nome = nome;
        this.nif = nif;
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", nif=" + nif + ", telefone=" + telefone + '}';
    }
    
}
