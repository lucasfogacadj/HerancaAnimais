
public class Preguica extends Animal {
	
	private String cor;
	
	
	@Override
	public void ler() {
		super.ler();
		System.out.println("Informe a cor ");
		this.setCor(tc.next());
	}
	
	public String getCor() {
		return cor;
	}




	public void setCor(String cor) {
		this.cor = cor;
	}




	public void subirnaArvore(){
		System.out.println("Subindo na Arvore");
	}
	
	

}
