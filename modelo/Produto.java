package modelo;

/**
 *
 * @author Davi Alves
 * @since 14/03/2019 - 10:57
 * @version 1.0 Balerion Version
 */
public class Produto {
    private String nomeProduto;
    private int qtdProduto;
    private double valorProduto;

    public Produto() {}
    
    /**
     * 
     * @param nomeProduto recebe o nome do produto
     * @param qtdProduto recebe a quantidade de produtos
     * @param valorProduto recebe o valor do produto
     */
    public Produto(String nomeProduto, int qtdProduto, double valorProduto) {
        this.nomeProduto = nomeProduto;
        this.qtdProduto = qtdProduto;
        this.valorProduto = valorProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }
    
    public double valorTotal(){
        return this.valorProduto * this.qtdProduto;
    }
    
    @Override
    public String toString() {
        return "Nome do Produto: " + nomeProduto + "\nQuantidade: " + qtdProduto + "\nPreço Unitário: " + valorProduto + "\nValor total: " + valorTotal();
    }
    
}
