package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorView {

    public static void main(String args[]){

            /*
        * Diferenças do Iterator:
        *  - Permite voltar na lista
        *  - Modificar os valores dos elementos
        *  - Adicionar elementos
        */


        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		
        ListIterator<Integer> listIterator = integers.listIterator();

        //É possível definir o index de início da iteração.
        listIterator = integers.listIterator(2);
        
        System.out.println("Previous: " + listIterator.previous());
        
        listIterator.set(20);
        System.out.println("Next element after 'set(20)': " + listIterator.next());
        
        listIterator.add(21);
        System.out.println("Previous after adding 21: " + listIterator.previous());
        
        listIterator.remove();
        System.out.println(integers);
    }

    

       
}
