package models;

public class Fornecedor {

    private String CNPJ;
    private String telefone;
    private String nome;

    public Fornecedor(){

    }

    public Fornecedor(String CNPJ, String telefone, String nome) {
        this.CNPJ = CNPJ;
        this.telefone = telefone;
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNome() {
        return nome;
    }


}
