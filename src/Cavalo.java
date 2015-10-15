
public class Cavalo extends Animal {
	
	public Cavalo(){
		super();
		System.out.println("Cavalo Criado");
	}
	
	@Override
	public void comer() {
		System.out.println("Cavalo Comendo");
	}
	
	@Override
	public void andar() {
		System.out.println("Cavalo Andando");
	}
	
	@Override
	public void comerRacao(String racao) {
		System.out.println("Comendo " + racao);
	}

}
