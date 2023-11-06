package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
	public static void Main(String args[]) {
		/*
		 Existem dois tipos exceptions: 
		 		Checked -> Erros que N�O EST�O no controle do programa. Ex: Arquivo enviado por um usu�rio.
		 					Classe Exception -> � poss�vel tentar novamente para corrigir o problema. Ex: Usu�rio enviar outro arquivo.
		 		Unchecked -> Erros que EST�O no controle do programa. Erros detectados na compila��o. 
		 					Ex: tentar dividir por 0.
		 					Classe Erros -> Pois, n�o h� nada que possa ser feito. Ex: StackOverflow
		 */
		
		try {
			Files.readAllLines(Paths.get("caminho inexistente pra um arquivo.txt"));
			var fr = new FileReader("arquivo.txt");
		
		//Quando existem 2 exce��es poss�veis de mesma hierarquia. A mais espec�fica (filha) deve ser declarada
		//Antes da mais gen�rica (pai).
		//Caso n�o seja dessa forma, um erro ser� gerado, pois a exce��o espec�fica nunca ser� alcan�ada.
			
		//FileNotFound � filha de IoException
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		//bloco de c�digo que ser� executado com ou sem exception.
		}finally {
			//Geralmente usado para finalizar processos.
			
			//Existem cen�rios nos quais finally n�o ser� completamente executado.
			
			//1. programa encerra antes do fim do finally
			//System.exit(0);
			
			//2. Exception ocorreu dentro do finally
			//throw new RuntimeException();
		}
		
		
		Object exemplo = null;
		
		if(exemplo == null) {
			//Existem cen�rios que n�o jogam exceptions, mas deveriam.
			//Toda exception que pode ser jogada(throw) possui um constructor que aceita "Exceptions regionais" 
				
			//Nesses cen�rios, � poss�vel unir unchecked e checked exceptions:
			//Assim, quando uma exce��o desse tipo � lan�ada, podemos instanciar uma exception regional 
			// e quem pega-la saber� o que causou a exception.
			throw new RuntimeException(new FileNotFoundException());
		}
	}
	
	
	public void metodoExemplo() throws FileNotFoundException{
		//Algum c�digo
	}
}

//Classe filha de main
class OverrideExemplo extends Main{
	
	//Quando sobrescrevemos um m�todo que joga uma exception, n�o � obrigat�rio que o m�todo sobrescrito jogue tamb�m.
	//Contudo, se o fizer, a exception deve ser a mesma ou de mesma hierarquia do m�todo original.
	//Caso contr�rio, gerar� um erro de compila��o.
	public void metodoExemplo(){
		//@Override
	}
}
