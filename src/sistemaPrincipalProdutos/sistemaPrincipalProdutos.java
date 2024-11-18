package sistemaPrincipalProdutos;
import objeto.Produtos;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class sistemaPrincipalProdutos {

	static Scanner scan = new Scanner(System.in);
	static List<Produtos> listaProdutos = new ArrayList<>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu();
	}
	
	public static void Menu() {
		
		int escolha;
		
		System.out.println("ESCOLHA A ATIVIDADE");
		System.out.println("///////////////////");
		System.out.println("Digite 1 para *CADASTRO DE NOVO PRODUTO*");
		System.out.println("Digite 2 para *EXIBIR PRODUTOS*");
		System.out.println("Digite 3 para *ENCERRAR SISTEMA");
		
		escolha = scan.nextInt();
		
		switch(escolha) {
			
		case 1:
			CadastrarProduto();
		break;
		
		case 2:
			ExibirLista();
		break;
		
		case 3:
			System.out.println("Sistema encerrado!");
		System.exit(0);
		}
	}
	
	public static void CadastrarProduto() {
		
		Produtos produto = new Produtos();
		
		System.out.println("Nome do produto:");
		String nome = scan.next();
		produto.setNome(nome);
		
		System.out.println("Preço do produto:");
		Double preco = scan.nextDouble();
		produto.setPreco(preco);
		
		System.out.println("Quantidade do produto:");
		int quantidade = scan.nextInt();
		produto.setQuantidade(quantidade);
		
		listaProdutos.add(produto);
		
		System.out.println("");
		System.out.println("Produto cadastrado com sucesso!");
		
		Menu();
	}
	
	public static void ExibirLista() {
		
		System.out.println("Lista de Produtos cadastrados:");
		System.out.println("");
		
		for(Produtos listandoProdutos: listaProdutos) {
			
			System.out.println(listandoProdutos);
		}
		
		Menu();
	}
	
	

}
