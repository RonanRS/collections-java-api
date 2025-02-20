import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    // Atributo a receber uma List
    private List<Item> itemList;

    // Construtor para forçar o metodo a iniciar com um array vazio
    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    // Metodos de interação com o programa
    public void adicionarItem(String nomeItem, double preco, int quantidade) {
        itemList.add(new Item(nomeItem, preco, quantidade));
    }

    public void removerItem(String nomeItem){
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item t : itemList){
            if (t.getNomeItem().equalsIgnoreCase(nomeItem)){
                itensParaRemover.add(t);
            }
        }
        itemList.removeAll(itensParaRemover);
    }

    public void calcularValorTotal(){
        double valorTotal = 0;
        for (Item t : itemList){
            valorTotal = valorTotal + t.getPreco();
        }
        System.out.println("Valor total dos itens no carrinho €" + valorTotal);
    }

    public void exibirItens(){
        itemList.forEach(System.out::println);
    }

    // Metodo main para testar os metodos
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Maçã", 2.50, 3);
        carrinhoDeCompras.adicionarItem("Água", 1.80, 2);
        carrinhoDeCompras.adicionarItem("Café", 0.49, 10);

        carrinhoDeCompras.exibirItens();
        System.out.println("=======================================");
        System.out.println();

        carrinhoDeCompras.removerItem("Maçã");
        carrinhoDeCompras.exibirItens();
        System.out.println("=======================================");
        System.out.println();

        carrinhoDeCompras.calcularValorTotal();

    }


}
