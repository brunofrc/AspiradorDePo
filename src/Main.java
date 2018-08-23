import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String op1;
		String op2;
		String op3;
		int custo = 0;
		Agente agente = new Agente();
		Quadro quadroA = new Quadro("A");
		Quadro quadroB = new Quadro("B");
		
		System.out.println("\n=============== Aspirador de sujeira ===============\n");
        System.out.println("Quadro A esta sujo? (S/N):\n");
        op1 = scanner.nextLine();
        if(op1.equals("S")) {
        	quadroA.setSujo(true);
        }else if(op1.equals("N")) {
        	quadroA.setSujo(false);
        }else {
        	System.out.println("Opcao invalida, quadro sera considerado limpo\n");
        	quadroA.setSujo(false);
        }
        System.out.println("Quadro B esta sujo? (S/N):\n");
        op2 = scanner.nextLine();
        if(op2.equals("S")) {
        	quadroB.setSujo(true);
        }else if(op2.equals("N")) {
        	quadroB.setSujo(false);
        }else {
        	System.out.println("Opcao invalida, quadro sera considerado limpo\n");
        	quadroB.setSujo(false);
        }
        System.out.println("Selecione o quadro atual do agente (A/B):\n");
        op3 = scanner.nextLine();
        if(op3.equals("A")) {
        	agente.setQuadroAtual(quadroA);
        }else if(op3.equals("B")) {
        	agente.setQuadroAtual(quadroB);
        }else {
        	System.out.println("Opcao invalida\n");
        }
        System.out.println("Comandos:\n");
        while(quadroA.getSujo() == true || quadroB.getSujo() == true) {
        	if(agente.getQuadroAtual().getNome()  == "A") {
        		if(quadroA.getSujo()) {
        			System.out.println("Aspirar; ");
        			quadroA.setSujo(false);
        			agente.setQuadroAtual(quadroA);
        			custo++;
        		}else {
        			System.out.println("Direita; ");
        			agente.setQuadroAtual(quadroB);
        			custo++;
        		}
        	}else {
        		if(quadroB.getSujo()) {
        			System.out.println("Aspirar; ");
        			quadroB.setSujo(false);
        			agente.setQuadroAtual(quadroB);
        			custo++;
        		}else {
        			System.out.println("Esquerda; ");
        			agente.setQuadroAtual(quadroA);
        			custo++;
        		}
        	}
        }
        
        System.out.println("\nCusto para limpar os dois quadros:" + custo);
	}

}
