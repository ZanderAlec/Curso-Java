package OOPPrinciples.SOLID.I;

/**
 * Interface segregation Principle ->
 *  As interfaces não devem ser tão abstratas a ponto dos usuários dessa interface terem que implementar métodos que não utilizam.
 *  Ex: a classe veículo possui métodos pra andar, voar e nadar, mas nem todos os veículos irão fazer uso de todos esses métodos.
 * Isso é um sinal que a interface está muito grande e o código mais complexo. Portanto, não há garantia que o comportamento desejado será obtido.
 * 
 * Solução: criar 3 interfaces distintas pra cada método.
 *          É mais simples e escalável.
 * 
 */
public interface Vehicle {
    public void drive();

    public void sail();

    public void fly();
}
