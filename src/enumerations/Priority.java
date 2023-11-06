package enumerations;

/*
 * 	Enum éum tipo de especial de dado. Que serve para permitir que uma variável assuma
 * um conjunto de valores constantes pre-definidos.
 	Enum é utilizado quando conhecemos todos os possíveis valores que um tipo de variável pode assumir.
 	
 	Ex: Estações do ano (Primavera, inverno, outono e verão)
 		Meses do ano (Janeira, fevereiro..., dezembro)
 		Dias da semana(segunda,...,domingo)
 		etc
*/

public enum Priority {
	//Todos os valores de enum são constantes e por convenção declarados em letras maiúsculas.
	HIGH, MEDIUM, LOW;
}
