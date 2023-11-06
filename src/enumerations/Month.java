package enumerations;

public enum Month {
	
	//Enumerações podem ter constructors, variáveis e métodos para cada enum.
	
	//Quando se cria um constructor, todos os enuns precisam chamar esse constructor e passar 
	//os valores que forem obrigatórios.
	// Essa chamada é feita em cada declaração de enum na forma: VALOR();
	
	JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31), AUGUST(31),
	SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);
	
	//Ao criar-se uma variável, cada tipo de enum terá sua própria instância da quela variável
	//Dessa forma, cada enum pode atribuir um valor diferente a ela sem interferir nos outros.
	private int daysAmount;
	
	private Month(int daysAmount){
		this.daysAmount = daysAmount;
	}
	
	public int getDaysAmount(){
		//O valor do enum que chamar esse métodos será o referenciado em this.
		//Visto que a chamada é feita como "Month.JANUARY.getDaysAmount()" e "Month.getDaysAmount()" não é possível.
		return this.daysAmount;
	}
	
	
}
