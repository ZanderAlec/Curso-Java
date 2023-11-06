package enumerations;

public class EnumTeste {
	public static void main(String[] args) {
		//Enumera��es n�o precisam ser declaradas. S�o tipos de vari�veis.
		//As vari�veis do tipo enum sempre devem possuir alguns dos valores do enum.
		
		Priority priority = Priority.HIGH;
		
		switch(priority) {
			case HIGH:
				System.out.println("High priority");
				break;
			case MEDIUM:
				System.out.println("Medium priority");
				break;
			case LOW:
				System.out.println("Low priority");
				break;
		}
		
		//� poss�vel fazer atribui��o do valor de uma vari�vel enum ap�s a sua declara��o.
		//p/ tal utiliza-se "valueOf()" e passa-se uma string com o valor enum desejado.
		//Caso o valor n�o exista dentro do enum, � retornado um exception.
		
		Priority priority2 = Priority.valueOf("LOW");
		//Priority priority3 = Priority.valueOf("low"); //Apresentar� uma exce��o
		
		
		//Cada valor do enum possui um "indice", portanto � poss�vel realizar compara��es diretas entre enuns.
		
		if(priority == Priority.MEDIUM)
			System.out.println("A prioridade � m�dia");
		
		//ordinal() permite saber o "indice" do valor do enum
		System.out.println("Priority.HIGH.ordinal() = "+ Priority.HIGH.ordinal());
		
		//Essa mesma caracter�stica permite iterarmos por entre os valores de um enum
		//Values retorna um array com todos os valores do enum
		Priority[] values = Priority.values();
		
		for(Priority value: values) {
			System.out.println(value);
		}
		
		
		
		System.out.println("M�todos de enum-------------------------------------");
		
		System.out.println("Month.JANUARY.getDaysAmount() = "+ Month.JANUARY.getDaysAmount());
		
		
		
	}
}
