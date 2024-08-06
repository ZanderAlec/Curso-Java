package OOPPrinciples.SOLID.L;



/**
 * Liskov Substitution Principle ->
 *     Uma classe filha deve poder ser substituída pela classe pai.
 *     Ex: A interface Bird pode ter várias implementações, 
 *          entre elas passaros que não voam e que ao tentar chamar o método fly eles retornam uma exceção.
 *          Isso quebra o princípio, pois se eu criar um array com objetos do tipo Bird, não tem como garantir que todos os métodos de todas as instâncias possam ser chamados.
 *          Dificultando a correção do código. 
 *   Solução: Criar uma interface separada para passaros que voam e ter dois arrays distintos. Um para passaros que voam e outro para passaros que não.
 * 
 */
public interface Bird {
    public void eat();

    public void fly();
}
