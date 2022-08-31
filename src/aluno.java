
public class aluno {
	private int matricula;
	private String nome;
	public Data dataNasc;
	private float notaProva1;
	private float notaProva2;
	private float notaTrab;
	
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Data setDataNasc(Data dataNasc) { 
		this.dataNasc = dataNasc;
		return dataNasc;
	} 
	
	public Data getDataNasc() {
		return dataNasc; 
	}
	public float getNotaProva1() {
		return notaProva1;
	}
	public void setNotaProva1(float notaProva1) {
		this.notaProva1 = notaProva1;
	}
	public float getNotaProva2() {
		return notaProva2;
	}
	public void setNotaProva2(float notaProva2) {
		this.notaProva2 = notaProva2;
	}
	public float getNotaTrab() {
		return notaTrab;
	}
	public void setNotaTrab(float notaTrab) {
		this.notaTrab = notaTrab;
	}
	public float Media() {
		float pesoProva = 2.5f;
		float pesoTrab = 5f;
		
		return (this.notaProva1 * pesoProva) + (this.notaProva2 * pesoProva) + (this.notaTrab * pesoTrab)/((pesoProva * 2) + pesoTrab);
	}
	public float NotaRec() {
		float notaMin = 6f;
		if (this.Media() <= notaMin) {
			return  notaMin - this.Media();	
		}
		return 0;
	}
	public aluno() {
		this.matricula = 0000000;
		this.nome = "Nome não definido";
		this.notaProva1 = 0;
		this.notaProva2 = 0;
		this.notaTrab = 0;
	}
	public aluno(String nome, int matricula) {
		this.matricula = matricula;
		this.nome = nome;
		this.notaProva1 = 0;
		this.notaProva2 = 0;
		this.notaTrab = 0;
	}
	
	
	public aluno(int matricula, String nome, int dia, int mes, int ano, float notaProva1, float notaProva2, float notaTrab) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		try {
			this.dataNasc = new Data(dia, mes, ano);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.notaProva1 = notaProva1;
		this.notaProva2 = notaProva2;
		this.notaTrab = notaTrab;
	}
	

}

