package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorView {
    public static void main(String args[]){
        List<Integer> integers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        //collections implementa iterator
        Iterator<Integer> iterator = integers.iterator();

        //next() retorna o próximo elemento ou uma exceção caso o elemento não exista.
        //é por isso que hasNext() deve sempre ser chamado primeiro.
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Após o iterator percorrer todos os elementos não há como utilizar 
        //o mesmo para percorrer a lista novamente.
        //É preciso instanciar um novo.
        if(!iterator.hasNext()) System.out.println("fim da lista!");
        
        iterator = integers.iterator();
        while(iterator.hasNext()){
            //remove deve ser sempre chamado após next(), ou retornará uma exceção
            //Arraylist overrides iterator.remove()
            //caso não fizesse, seria retornada uma exceção.
            int nextInt = iterator.next();
            if(nextInt % 2 == 0)
                iterator.remove();
        }

        iterator = integers.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
