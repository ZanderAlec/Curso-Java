package OOPPrinciples.SOLID.O;

/**
 * open-close principle ->
 *  Diz que classes devem ser abertos para extensão, mas fechados pra modificação, ou seja,
 *   quando novos recursos precisam ser implementados, o código original da classe não deve ser modificado, mas sim essa classe extendida.
 *  A cada modificação na classe aumenta o risco de criar novos bugs no código já funcinal.
 *  
 * 
 * Problema: O objetivo da classe é aprovar empréstimos e podem ter 2 tipos até o momento.
 * Se um terceiro tipo de empréstimo fosse criado, seria necessário modificar a classe novamente para adicionar essa opção.
 * Também não podemos extender a classe, pois a que extender irá ser capaz de fazer os dois tipos anteriores de empréstimo.
 * 
 * Solução: Abstrair a classe transformando-a em uma interface com um método "approveLoan" genérico, para ser extendida pelos diferentes tipos de empréstimos.
 *          O mesmo pode ser feito para os validators.
 * Dessa forma, loanHandler não precisa ser mais modificado a cada novo empréstimo e poderá ser extendido sem problemas.
 */
public class LoanHandler {

    private PersonalLoanValidator personalLoanValidator;
    private MortgageLoanValidator mortgageLoanValidator;

    public void approvePersonalLoan(){
        //realiza validação
    }

    public void approveMortgage(){
        //realiza validação
    }
}
