package enumerations;

public class EnumTeste {
	public static void main(String[] args) {
		//Enumerações não precisam ser declaradas. São tipos de variáveis.
		//As variáveis do tipo enum sempre devem possuir alguns dos valores do enum.
		
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
		
		//É possível fazer atribuição do valor de uma variável enum após a sua declaração.
		//p/ tal utiliza-se "valueOf()" e passa-se uma string com o valor enum desejado.
		//Caso o valor não exista dentro do enum, é retornado um exception.
		
		Priority priority2 = Priority.valueOf("LOW");
		//Priority priority3 = Priority.valueOf("low"); //Apresentará uma exceção
		
		
		//Cada valor do enum possui um "indice", portanto é possível realizar comparações diretas entre enuns.
		
		if(priority == Priority.MEDIUM)
			System.out.println("A prioridade é média");
		
		//ordinal() permite saber o "indice" do valor do enum
		System.out.println("Priority.HIGH.ordinal() = "+ Priority.HIGH.ordinal());
		
		//Essa mesma característica permite iterarmos por entre os valores de um enum
		//Values retorna um array com todos os valores do enum
		Priority[] values = Priority.values();
		
		for(Priority value: values) {
			System.out.println(value);
		}
		
		
		
		System.out.println("Métodos de enum-------------------------------------");
		
		System.out.println("Month.JANUARY.getDaysAmount() = "+ Month.JANUARY.getDaysAmount());
		
		
		
	}
}
