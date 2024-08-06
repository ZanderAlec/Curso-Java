package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	/*
	 * ps: Toda implementa��o de collection possui a implementa��o de forEach.
	 * 
	 * Vantagens de cole��es em rela��o a arrays:
	 * Tamanho din�mico
	 * Algor�tmos para manipula��o de dados. Ex: Filtro
	 * Api �nica
	 * 
	 * 
	 * Desvantagens:
	 * Apenas podem lidar com "reference types"
	 * Baixa performance
	 * 
	 * 
	 * List implementations------------------------------
	 * Arraylists -> S�o arrays de tamanho din�mico.
	 * 
	 * Interfaces de marca��o -> N�o definem uma implementa��o obrigat�ria de nada
	 * 							Apenas servem para entender o tipo de uma classe.
	 * 							Essa marca��o � checkada com o "instance of" e utilizada
	 * 							para escolher a melhorar maneira de proceder caso a classe
	 * 							tenha ou n�o a marca.
	 * 
	 * vectors -> Mesmo que arrayList, por�m s�o conhecidos como "safe Containers", pois n�o permitem adicionar e remover elementos simultaneamente, evitando inconsistencia de dados.
					ele é mais utilizado para threads, onde há risco de concorrência. Em cenários nos quais  esse risco não existe, o vector acaba sendo bem mais lento em comparação com o arrayList e
					por isso não é muito usado.
	 * CopyAndWriteArrayList -> Mais r�pido que o vector.
	 * stack -> N�o � muito usado, pois � uma classe limitada que n�o possui multiplas implementa��es.
	 * 			Implementa obrigat�riamente lifo.
	 * 			Ainda � mantida por quest�es de compatibilidade com programas mais antigos.
	 * 
	 * 
	 * linkedList x ArrayList--------------------------------------------------------
	 * 
	 * LinkedList -> Deve ser usada quando se deseja remover ou adicionar elementos em tempo constante(O(1)) no in�cio ou fim da lista.
	 * ArrayList -> Deve ser usado quando se deseja adicionar elementos no fim da lista e resgatar um elemento de qualquer parte da lista em tempo costante.
	 * 				Mais usado.
	 * 				Muito r�pido para pequenas quantidades de elementos.
	 */
	
	
	public static void main(String args[]) {
		//iniciando uma lista com multiplos objetos:
		//Arrays possui o m�todo asList() que converte uma cole��o de elemetos em uma list.
		//Que � passada como par�metro no constructor de list.
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));
			
		//Lista possuem um m�todo "toString" que apresenta a lista na forma de array:
		System.out.println(list);
		
	}
}
