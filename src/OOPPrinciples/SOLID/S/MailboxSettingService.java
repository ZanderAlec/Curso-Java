package OOPPrinciples.SOLID.S;




/*
 *  SOLID ->
 *      S-> SINGLE RESPONSABILITY PRINCIPLE
 *         Esse princípio diz que as classes devem ter apenas uma responsabilidade
 *          e apenas um motivo para mudar. 
 * 
 * Problema: A classe mailbox possui duas funções: mudar o email e validar o acesso do usuário.
 * Assim, se essa validação for mudada ou excluída, outras classes que utilizam o mailbox para essa validação deixaram de funcionar ou terão resultados inesperados.
 * 
 * Solução: criar uma classe exclusivamente para fazer o acesso.
 */
public class MailboxSettingService {

    public void changeEmail(User user, String newEmail){
        if(hasAccess(user)){
            //troca o email;
        }
    }
    
    public boolean hasAccess(User user){
        if(user.getRole() == ROLES.ADMIN) 
            return true;
        else    
            return false;
    }
}
