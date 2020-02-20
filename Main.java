import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o numero de identificacao do aluno: " + 
				"");
		int numID = sc.nextInt();
		
		System.out.println("Informe a nota 1: " + 
				"");
		double not1 = sc.nextDouble();
		System.out.println("Informe a nota 2: " + 
				"");
		double not2 = sc.nextDouble();
		System.out.println("Informe a nota 3: " + 
				"");
		double not3 = sc.nextDouble();
		System.out.println("Informe a media dos exercicios: " + 
				"");
		double ME = sc.nextDouble();
		
		double MA = (not1 + not2 * 2 + not3 * 3 + ME)/7*10;
		
		if(MA>=90) {
			System.out.println("Aluno: "+ numID + ", Media Aproveitamento = "+ MA + ", Conceito: A, Aprovado");
		}else if(MA >=75 && MA < 90) {
			System.out.println("Aluno: "+ numID + ", Media Aproveitamento = "+ MA + ", Conceito: B, Aprovado");
		}else if(MA >= 60 && MA < 75) {
			System.out.println("Aluno: "+ numID + ", Media Aproveitamento = "+ MA + ", Conceito: C, Aprovado");
		}else if(MA >= 40 && MA < 60) {
			System.out.println("Aluno: "+ numID + ", Media Aproveitamento = "+ MA + ", Conceito: D, Reprovado");
		}else if(MA < 40) {
			System.out.println("Aluno: "+ numID + ", Media Aproveitamento = "+ MA + ", Conceito: E, Reprovado");
		}
		
		
		sc.close();
	}

}
