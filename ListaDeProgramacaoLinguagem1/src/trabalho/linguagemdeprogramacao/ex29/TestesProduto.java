package trabalho.linguagemdeprogramacao.ex29;

import java.util.Scanner;

public class TestesProduto {
    public static void main(String[] args) {
        // Criação de alguns produtos para teste
        Produto produto1 = new Produto("Arroz", 10.0, 20);
        Produto produto2 = new Produto("Feijão", 5.0, 15);
        Produto produto3 = new Produto("Macarrão", 3.5, 30);

        // Criação do pedido com capacidade para 5 itens
        Pedido pedido = new Pedido(5);

        // Adição de itens ao pedido
        pedido.adicionarItem(new ItemPedido(produto1, 2));
        pedido.adicionarItem(new ItemPedido(produto2, 3));
        pedido.adicionarItem(new ItemPedido(produto3, 1));

        // Informações do pedido
        System.out.println("Itens do pedido:");
        
        for (int i = 0; i < pedido.getQuantidadeItens(); i++) {
            ItemPedido item = pedido.getItem(i);
            System.out.println(item.getProduto().getNome() + " - Quantidade: " + item.getQuantidade());
        }

        // Informações de pagamento
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o tipo de pagamento (dinheiro, pix ou cartão):");
        String tipoPagamento = scanner.nextLine();
        
        pedido.setTipoPagamento(tipoPagamento);

        // Exibição do resumo do pedido
        System.out.println("Resumo do pedido:");
        double totalPedido = 0.0;
        
        for (int i = 0; i < pedido.getQuantidadeItens(); i++) {
        	
            ItemPedido item = pedido.getItem(i);
            
            double valorItem = item.getQuantidade() * item.getProduto().getPreco();
            
            totalPedido += valorItem;
            
            System.out.println(item.getProduto().getNome() + " - Valor unitário: " + item.getProduto().getPreco() +
                    " - Quantidade: " + item.getQuantidade() + " - Valor total: " + valorItem);
        }
        
        System.out.println("Valor total do pedido: " + totalPedido);
        System.out.println("Tipo de pagamento: " + pedido.getTipoPagamento());
    }
}
