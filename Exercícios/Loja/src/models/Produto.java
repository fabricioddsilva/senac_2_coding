package models;

public class Produto {

    private int cod;
    private String nome;
    private double valor;
    Fornecedor fornecedor;

    public Produto() {
    }

    public Produto(int cod, String nome, double valor, Fornecedor fornecedor) {
        this.cod = cod;
        this.nome = nome;
        this.valor = valor;
        this.fornecedor = fornecedor;
    }

    public void atualizarPreco(float porcentagem) {
        double aumento = valor * (porcentagem/100);
        valor += aumento;
        System.out.println("Atualização bem sucedida");
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}


