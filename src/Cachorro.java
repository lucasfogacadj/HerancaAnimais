
public class Cachorro extends Animal {
	
	public Cachorro(){
		super();
		System.out.println("Criando Cachorro");
	}
	
	
	
	@Override
	public void comer() {
		System.out.println("Cachorro Comendo");
	}
	
	@Override
	public void andar() {
		System.out.println("Cachorro Andando");
	}
	
	
	@Override
	public void comerRacao(String racao) {
		System.out.println("Comendo " + racao);
	}


}
