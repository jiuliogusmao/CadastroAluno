// Meu exercício
public class Data {
	// atributos
		public int dia = 1;
		public int mes = 1;
		public int ano = 1;
		private String mesext[] = {"janeiro", "fevereiro", "março", 
				"abril", "maio", "junho", "julho", "agosto", "setembro",
				"outubro", "novembro", "dezembro"};
		// construtor
		public Data(int dia, int mes, int ano) throws Exception {
			if (this.validaData(dia, mes, ano)) {
				this.dia = dia;
				this.mes = mes;
				this.ano = ano;
			} else {
				throw new Exception ("Data inválida!");
			}
		}
		private boolean validaData(int dia, int mes, int ano) {
		//verifica o mês
			if (mes < 1 || mes > 12)
				return false;
			//define um vetor com o número de dias que cada mês tem
			int diasMes[] = {31,28,31,30,31,30,31,31,30,31,30,31};
			
			//ajusta o mês de fevereiro para 29 se for ano bissexto
			if (ano % 400 == 0 || (ano %100 != 0 && ano % 4 == 0))
				diasMes[1] = 29;
			//verifica se o dia está de acordo
			if (dia < 1|| dia > diasMes[mes -1]) {
				return false;
			}
			//se passou por todas as validações acima
			return true;
		}

		public int getDia() {
			return dia;
		}

		public int getMes() {
			return mes;
		}
		
		public String[] getMesext() {
			return mesext;
		}
		
		public String mesExtenso() {
			return this.mesext[this.mes - 1];
		}

		public int getAno() {
			return ano;
		}
		
		public String getAno2DigStr() {
			//converte ano para string
			String anostr = String.valueOf(ano);
			//pega o tamanho da string
			int tamstr = anostr.length();
			//define a quantidade de dígitos a pegar da string verificando se o ano é positivo ou negativo
			//se for negativo e menor que -9, 3 caracteres devem ser retornardos para representar o ano
			//negativo com 2 dígitos. nos demais casos deve retornar 2 carcteres
			int ndig = 2;
			if (ano < -9) {
				ndig = 3;
			}
				//se o ano tiver 2 ou mais dígitos, retorna apenas os dois últimos
				//se tiver apenas 2 ou menos retorna todos
			if (tamstr >= 2) {
				return anostr.substring(tamstr -ndig, tamstr);
			} else {
				return anostr;
			}
		}
		
		public boolean isBissexto() {
			if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
				return true;			
			}		
			return false;		
		}
		
		@Override
		public String toString() {
			return getDia() + "/" + getMes() + "/" + getAno();
		}
		
//		public Data clone() {
//			Data dataClone = new Data(this.dia, this.mes, this.ano);
//			return dataClone;		
//		}
//		
}
