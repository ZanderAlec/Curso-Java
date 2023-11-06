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
		 		Checked -> Erros que NÃO ESTÃO no controle do programa. Ex: Arquivo enviado por um usuário.
		 					Classe Exception -> É possível tentar novamente para corrigir o problema. Ex: Usuário enviar outro arquivo.
		 		Unchecked -> Erros que ESTÃO no controle do programa. Erros detectados na compilação. 
		 					Ex: tentar dividir por 0.
		 					Classe Erros -> Pois, não há nada que possa ser feito. Ex: StackOverflow
		 */
		
		try {
			Files.readAllLines(Paths.get("caminho inexistente pra um arquivo.txt"));
			var fr = new FileReader("arquivo.txt");
		
		//Quando existem 2 exceções possíveis de mesma hierarquia. A mais específica (filha) deve ser declarada
		//Antes da mais genérica (pai).
		//Caso não seja dessa forma, um erro será gerado, pois a exceção específica nunca será alcançada.
			
		//FileNotFound é filha de IoException
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		//bloco de código que será executado com ou sem exception.
		}finally {
			//Geralmente usado para finalizar processos.
			
			//Existem cenários nos quais finally não será completamente executado.
			
			//1. programa encerra antes do fim do finally
			//System.exit(0);
			
			//2. Exception ocorreu dentro do finally
			//throw new RuntimeException();
		}
		
		
		Object exemplo = null;
		
		if(exemplo == null) {
			//Existem cenários que não jogam exceptions, mas deveriam.
			//Toda exception que pode ser jogada(throw) possui um constructor que aceita "Exceptions regionais" 
				
			//Nesses cenários, é possível unir unchecked e checked exceptions:
			//Assim, quando uma exceção desse tipo é lançada, podemos instanciar uma exception regional 
			// e quem pega-la saberá o que causou a exception.
			throw new RuntimeException(new FileNotFoundException());
		}
	}
	
	
	public void metodoExemplo() throws FileNotFoundException{
		//Algum código
	}
}

//Classe filha de main
class OverrideExemplo extends Main{
	
	//Quando sobrescrevemos um método que joga uma exception, não é obrigatório que o método sobrescrito jogue também.
	//Contudo, se o fizer, a exception deve ser a mesma ou de mesma hierarquia do método original.
	//Caso contrário, gerará um erro de compilação.
	public void metodoExemplo(){
		//@Override
	}
}
