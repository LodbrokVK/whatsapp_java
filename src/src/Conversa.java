package src;

import java.util.ArrayList;

/**
 *
 * @author ebner.m
 */
public class Conversa {
    private Usuario usuario;
    private Contato contato;
    private ArrayList<Mensagem> lista_de_mensagens;
    
    public Conversa(Usuario usuario, Contato contato) {
        this.usuario = usuario;
        this.contato = contato;
        lista_de_mensagens = new ArrayList<Mensagem>();
    }   
    
    public void adicionaMensagem(Mensagem mensagem) {
        this.lista_de_mensagens.add(mensagem);
    }

    
    public void getMensagens(Conversa conversa) {
        for(int i=0;i<lista_de_mensagens.size();i++){
            System.out.println("Mensagem: "+lista_de_mensagens.get(i).getMensagem());
        }
    }
    
    public boolean verificaUsuario(Usuario usuario){
        if(this.usuario == usuario){
            return true;
        }else{
            return false;
        }
    }
    
    public String getNameContato() {
        return this.contato.getNome();
    }
    
}
