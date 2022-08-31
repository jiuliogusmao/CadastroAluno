<<<<<<< HEAD
import javax.swing.JOptionPane;
=======
>>>>>>> d75303cd9e2d7e2211ccb0ebfbefddac0664ec76

public class Principal {

	public static void main(String[] args) {
    //aluno a1 = new aluno("João", 1234567);
    //
    //System.out.println("Matrícula: " + a1.getMatricula() + 
    //					" Nome: " + a1.getNome());
    //aluno a2 = new aluno();
    
//    System.out.println("Matrícula: " + a2.getMatricula() +
//    		" Nome: " + a2.getNome() + 
//    		" Nota prova 1: " + a2.getNotaProva1() + 
//    		" Nota prova 2: " + a2.getNotaProva2() +
//    		" Nota trabalho: " + a2.getNotaTrab());
<<<<<<< HEAD
		String dataInvalida = JOptionPane.showInputDialog("Insira dia, mês e ano corrretamente!");
		String[] parts = dataInvalida.split(" ");
		int dia = Integer.parseInt(parts[0]);
		int mes = Integer.parseInt(parts[1]);
		int ano = Integer.parseInt(parts[2]);
	aluno a3 = new aluno(1234567, "Pedro",dia, mes, ano, 7, 8, 9);
	
 System.out.println(" Matrícula: " + a3.getMatricula() +
    		"\n Nome: " + a3.getNome() +
    		"\n Data de nascimento: " + a3.getDataNasc() + 
=======
	aluno a3 = new aluno(1234567, "Pedro", 20, 2, 1990, 7, 8, 9);
	
 System.out.println(" Matrícula: " + a3.getMatricula() +
    		"\n Nome: " + a3.getNome() +
    		"\n Data de nascimento: " + a3.getDataNasc(0, 0, 0) + 
>>>>>>> d75303cd9e2d7e2211ccb0ebfbefddac0664ec76
    		"\n Nota prova 1: " + a3.getNotaProva1() + 
    		"\n Nota prova 2: " + a3.getNotaProva2() +
    		"\n Nota trabalho: " + a3.getNotaTrab() +
    		"\n Media: " + a3.Media() +
    		"\n Nota de recuperação: " + a3.NotaRec());

	}
	
}
