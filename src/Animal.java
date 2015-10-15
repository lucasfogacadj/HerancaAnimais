import java.util.Scanner;

public class Animal {
	private String nome;
	private String familia;
	private int idade;
	
	Scanner tc = new Scanner(System.in);
	
	public Animal (){
		this.ler();
	}
	
	public void ler(){
		System.out.println("Informe o nome");
		this.setNome(tc.next());
		System.out.println("Informe a familia");
		this.setFamilia(tc.next());
		System.out.println("Informe a idade");
		this.setIdade(tc.nextInt());
	}
	
	public void andar(){
		System.out.println("Andando");
		
	}
	
	public void comer(){
		System.out.println("Comendo");
	}
	
	public void comerRacao(String racao){
		
	}
	
	public final void respirar(){
		System.out.println("Respirando");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", familia=" + familia + ", idade=" + idade + "]";
	}
	

	
	

}
