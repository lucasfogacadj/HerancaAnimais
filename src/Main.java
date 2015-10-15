import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Criando cachorro");
		Cachorro c = new Cachorro();
		System.out.println("Informe a racao do cachorro");
		String racao;
		racao = tc.next();
		c.comerRacao(racao);
		System.out.println("Metodos cachorro");
		acoes(c);
		System.out.println("");
		
		System.out.println("Criando cavalo");
		Cavalo ca = new Cavalo();
		System.out.println("Informe a raçao");
		String racao2;
		racao2 = tc.next();
		System.out.println("Metodos do Cavalo");
		acoes(ca);
		ca.comerRacao(racao2);
		System.out.println("");
		
		System.out.println("Criando preguiça");
		Preguica p = new Preguica();
		System.out.println("Metodos da preguiça");
		acoes(p);
		p.subirnaArvore();
		}
	
		
	private static void acoes(Animal a){
		a.andar();
		a.comer();
		a.respirar();
}
}