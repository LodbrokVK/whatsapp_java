package src;

/**
 *
 * @author ebner.m
 */
public class Whatsapp {

    public static void main(String[] args) {
        // Instanciar os Usuários
        System.out.println("-----------------------------------------");
        System.out.println("---------Criamos os usuários-------------");
        Usuario usuario1 = new Usuario("Danilo");
        Usuario usuario2 = new Usuario("Ebner");
        Usuario usuario3 = new Usuario("Maria");
        System.out.println(usuario1.getNome());
        System.out.println(usuario2.getNome());
        System.out.println(usuario3.getNome());

        
        // Criar Contatos para o Usuário X
        System.out.println("-----------------------------------------");
        System.out.println("---------Criamos os contatos-------------");
   
        Contato contato1 = new Contato("Marco");
        Contato contato2 = new Contato("Jackson");
        Contato contato3 = new Contato("Emerson");
        
        Contato contato4 = new Contato("Joana");
        Contato contato5 = new Contato("Raimunda");
        Contato contato6 = new Contato("Jurema");
        
        usuario1.inserirContato(contato1);
        usuario1.inserirContato(contato2);
        usuario1.inserirContato(contato3);
        
        usuario2.inserirContato(contato4);
        usuario2.inserirContato(contato5);
        usuario2.inserirContato(contato6);

        // Mostra a quantidade de contatos
        usuario1.getContatos();
        usuario2.getContatos();
        usuario3.getContatos();
        
        
        // Iniciar uma conversa com um contato
        System.out.println("-----------------------------------------");
        System.out.println("--------Iniciando as conversas-----------");
        
        Conversa conversa1 = new Conversa(usuario1, contato1);
        Conversa conversa2 = new Conversa(usuario1, contato2);
        Conversa conversa3 = new Conversa(usuario1, contato3);
        Conversa conversa4 = new Conversa(usuario2, contato4);
        Conversa conversa5 = new Conversa(usuario2, contato5);
        Conversa conversa6 = new Conversa(usuario2, contato6);
        
        usuario1.iniciaConversa(conversa1);
        usuario1.iniciaConversa(conversa2);
        usuario1.iniciaConversa(conversa3);
        
        usuario2.iniciaConversa(conversa4);
        usuario2.iniciaConversa(conversa5);
        usuario2.iniciaConversa(conversa6);
        
        //Mostra a quantidade de conversas por usuário
        usuario1.getConversas();
        usuario2.getConversas();
        usuario3.getConversas();
        
        System.out.println("-----------------------------------------");
        System.out.println("----------Enviando mensagem--------------");
        // Enviar uma mensagem em uma conversa
        Mensagem mensagem1 = new Mensagem("O Emerson é bom em DBA");
        Mensagem mensagem2 = new Mensagem("O Marco é bom no fox e é chorão");
        Mensagem mensagem3 = new Mensagem("O Jackson está em SP");
        
        Mensagem mensagem7 = new Mensagem("Mensagem 7");
        Mensagem mensagem8 = new Mensagem("Mensagem 8");
        Mensagem mensagem9 = new Mensagem("Mensagem 9");
       
        usuario1.enviaMensagem(usuario1, mensagem1, conversa2);
        usuario1.enviaMensagem(usuario1, mensagem2, conversa2);
        usuario1.enviaMensagem(usuario1, mensagem3, conversa2);
        
        usuario2.enviaMensagem(usuario2, mensagem7, conversa4);
        usuario2.enviaMensagem(usuario2, mensagem8, conversa4);
        usuario2.enviaMensagem(usuario2, mensagem9, conversa4);
        
        // Receber uma mensagem em uma conversa
        System.out.println("-----------------------------------------");
        System.out.println("-------Recebendo uma mensagem------------");
        
        Mensagem mensagem4 = new Mensagem("Testando a mensagem 4");
        Mensagem mensagem5 = new Mensagem("Testando a mensagem 5");
        Mensagem mensagem6 = new Mensagem("Testando a mensagem 6");
        
        Mensagem mensagem10 = new Mensagem("Testando a mensagem 10");
        Mensagem mensagem11 = new Mensagem("Testando a mensagem 11");
        Mensagem mensagem12 = new Mensagem("Testando a mensagem 12");
        
        usuario1.recebeMensagem(usuario1, conversa2, mensagem4);
        usuario1.recebeMensagem(usuario1, conversa2, mensagem5);
        usuario1.recebeMensagem(usuario1, conversa2, mensagem6);
        
        usuario2.recebeMensagem(usuario2, conversa4, mensagem10);
        usuario2.recebeMensagem(usuario2, conversa4, mensagem11);
        usuario2.recebeMensagem(usuario2, conversa4, mensagem12);
                
 
        // Imprimir todas as mensagens de uma conversa
        System.out.println("-----------------------------------------");
        System.out.println("----Imprimindo todas mensagens----------");
        usuario1.imprimeTodasMensagens(conversa2, usuario1);
        System.out.println("-----------------------------------------");
        usuario2.imprimeTodasMensagens(conversa4, usuario2);
    }
}
