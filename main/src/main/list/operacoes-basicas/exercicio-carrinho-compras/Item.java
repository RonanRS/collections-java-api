public class Item {
    String nomeItem;
    double preco;
    int quantidade;

    public Item(String nomeItem, double preco, int quantidade) {
        this.nomeItem = nomeItem;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return  "Item: " + nomeItem + '\'' +
                ", Preco: " + preco +
                ", Quantidade: " + quantidade
                ;
    }
}
