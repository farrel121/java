import java.util.Scanner;

public class Calculadora{
	public static void main (String args[]){
	int opcao = 5;
	while (opcao !=0) {
	System.out.println("EXERCICIO LTP2 - CALCULADORA V1.0");
        System.out.println("--Escolha uma opÃ§Ã£o--");  
        System.out.println("(1) Soma");    
        System.out.println("(2) Subtracao");    
        System.out.println("(3) Multiplicacao");    
        System.out.println("(4) Divisao");    
        System.out.println("(0) Sair");    
        System.out.println("Operaçao: ");

    	Scanner scanner = new Scanner(System.in);
        opcao = scanner.nextInt(); 	

	switch	(opcao) {

	case 1:
		Soma soma = new Soma();
		soma.fazerOperacao();
		break;

	case 2:
		Subtracao sub = new Subtracao();
		sub.fazerOperacao();
		break;

	case 4:
		Divisao div = new Divisao();
		div.fazerOperacao();
		break;

	case 3:
		Multiplicacao mult = new Multiplicacao();
		mult.fazerOperacao();
		break;

	}
}
}
}
