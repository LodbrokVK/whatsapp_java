package src;

import java.util.ArrayList;

/**
 *
 * @author ebner.m
 */
public class Usuario {
    private String nome;
    private ArrayList<Contato> lista_de_contatos;
    private ArrayList<Conversa> lista_de_conversas;
    
    public Usuario (String nome) {
        this.nome = nome;
        lista_de_contatos = new ArrayList<Contato>();
        lista_de_conversas = new ArrayList<Conversa>();
    }
    
    public void inserirContato(Contato contato) {
        System.out.println("Inserido um contato para o usuário: "+ this.nome);
        this.lista_de_contatos.add(contato);
    }
    
    public void iniciaConversa(Conversa conversa) {
        System.out.println("Iniciamos uma conversa para o usuário: "+ this.nome);
        this.lista_de_conversas.add(conversa);
    }
    
    public void enviaMensagem(Usuario usuario, Mensagem mensagem, Conversa conversa) {
        System.out.println("Enviado uma mensagem: "+ mensagem.getMensagem()+ " Do usuário: "+usuario.nome +" Para o contato: "+ conversa.getNameContato());
        for(int i=0;i<lista_de_conversas.size();i++){
            if(lista_de_conversas.get(i).equals(conversa)) {
                conversa.adicionaMensagem(mensagem);
                lista_de_conversas.set(i, conversa);
            }
        }
    }
    
    public void recebeMensagem(Usuario usuario, Conversa conversa, Mensagem mensagem) {
        for(int i=0;i<lista_de_conversas.size();i++) {
            if(lista_de_conversas.get(i).verificaUsuario(usuario)){
                conversa.adicionaMensagem(mensagem);
                lista_de_conversas.set(i, conversa);
                break;
            }
        }
    }
    
    public void imprimeTodasMensagens(Conversa conversa, Usuario usuario) {
        for(int i=0; i < lista_de_conversas.size(); i++){
            if(lista_de_conversas.get(i).verificaUsuario(usuario)){
                conversa.getMensagens(conversa);
                break;
            }
        }
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void getContatos(){
        System.out.println("Quantidade de contatos para o usuário: "+ this.nome+ "  "+ lista_de_contatos.size());
    }
    
    public void getConversas() {
        System.out.println("Listando as conversas do usuário: "+this.nome+ "  " + lista_de_conversas.size());
    }
    
   ;
}
