package objeto;

public class Produtos {

	private String nome;
	private Double preco;
	private int quantidade;
	
	
	public Produtos() {
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	@Override
	public String toString() {
		return "Produtos [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
}
