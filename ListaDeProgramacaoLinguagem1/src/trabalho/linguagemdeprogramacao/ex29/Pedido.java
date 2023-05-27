package trabalho.linguagemdeprogramacao.ex29;

public class Pedido {
    private ItemPedido[] itens;
    private String tipoPagamento;
    private int quantidadeItens;
    private int capacidade;

    public Pedido(int capacidade) {
        this.capacidade = capacidade;
        itens = new ItemPedido[capacidade];
        quantidadeItens = 0;
    }

    // Getters e setters

    public ItemPedido[] getItens() {
        return itens;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    // Método para adicionar itens ao pedido

    public void adicionarItem(ItemPedido item) {
        if (quantidadeItens < capacidade) {
            itens[quantidadeItens] = item;
            quantidadeItens++;
        } else {
            System.out.println("Capacidade máxima atingida. Não é possível adicionar mais itens ao pedido.");
        }
    }

    // Método para obter um item do pedido pelo índice

    public ItemPedido getItem(int indice) {
        if (indice >= 0 && indice < quantidadeItens) {
            return itens[indice];
        } else {
            return null;
        }
    }
}

