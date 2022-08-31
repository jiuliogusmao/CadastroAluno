import javax.swing.JOptionPane;

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
		String dataInvalida = JOptionPane.showInputDialog("Insira dia, mês e ano corrretamente!");
		String[] parts = dataInvalida.split(" ");
		int dia = Integer.parseInt(parts[0]);
		int mes = Integer.parseInt(parts[1]);
		int ano = Integer.parseInt(parts[2]);
	aluno a3 = new aluno(1234567, "Pedro",dia, mes, ano, 7, 8, 9);
	
 System.out.println(" Matrícula: " + a3.getMatricula() +
    		"\n Nome: " + a3.getNome() +
    		"\n Data de nascimento: " + a3.getDataNasc() + 
    		"\n Nota prova 1: " + a3.getNotaProva1() + 
    		"\n Nota prova 2: " + a3.getNotaProva2() +
    		"\n Nota trabalho: " + a3.getNotaTrab() +
    		"\n Media: " + a3.Media() +
    		"\n Nota de recuperação: " + a3.NotaRec());

	}
	
}
