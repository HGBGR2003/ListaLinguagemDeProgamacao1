package trabalho.linguagemdeprogramacao.ex30;

public class TestesPessoa {

	public static void main(String[] args) {

        Pessoa pai = new Pessoa("Luciano", 45, null, null);// os atributos referentes aos pais dos meus pais, foram colocados como nulos, afinal seria uma tarefa infinita, porém poderiam ser adicionados ao declararmos 4 novas pessoas( 2 avôs e 2 avós)
        Pessoa mae = new Pessoa("Rosana", 42, null, null);
        Pessoa pessoa = new Pessoa("João", 19, pai, mae);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Pai: " + pessoa.getPai().getNome());
        System.out.println("Mãe: " + pessoa.getMae().getNome());
    }
}