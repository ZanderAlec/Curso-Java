package enumerations;

public enum Month {
	
	//Enumera��es podem ter constructors, vari�veis e m�todos para cada enum.
	
	//Quando se cria um constructor, todos os enuns precisam chamar esse constructor e passar 
	//os valores que forem obrigat�rios.
	// Essa chamada � feita em cada declara��o de enum na forma: VALOR();
	
	JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31), AUGUST(31),
	SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);
	
	//Ao criar-se uma vari�vel, cada tipo de enum ter� sua pr�pria inst�ncia da quela vari�vel
	//Dessa forma, cada enum pode atribuir um valor diferente a ela sem interferir nos outros.
	private int daysAmount;
	
	private Month(int daysAmount){
		this.daysAmount = daysAmount;
	}
	
	public int getDaysAmount(){
		//O valor do enum que chamar esse m�todos ser� o referenciado em this.
		//Visto que a chamada � feita como "Month.JANUARY.getDaysAmount()" e "Month.getDaysAmount()" n�o � poss�vel.
		return this.daysAmount;
	}
	
	
}
