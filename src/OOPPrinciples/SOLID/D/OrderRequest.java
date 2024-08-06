package OOPPrinciples.SOLID.D;


/**
 * Dependency inversion principle ->
 *  Módulos de alto nível não devem depender de módulos de baixo nível, mas sim de abstrações ou interfaces.
 *  
 *  OrderResquest salva os pedidos rebecidos e para isso ela depende de OrderRepository.
 * Problema: Order repository é uma classe (módulo de baixo nível), assim se outra forma de repositória fosse criada, outra classe do tipo "orderRequest" 
 * teria que ser criada.
 * 
 * Solução: OrderRepository se torna uma interface (abstração) com o método saveOrder(). Assim, independente do tipo de salvamente feito, OrderRequest não precisa ser duplicada/modificada.
 * ou seja, não depende mais de OrderRepository, mas sim de sua abstração.
 *
 */
public class OrderRequest {
    private OrderRepository repository;

    public OrderRequest(OrderRepository repository){
        this.repository = repository;
    }

    public void approveOrder(Order order){
        //lógica de validação
        repository.saveOrder();
    }

}
