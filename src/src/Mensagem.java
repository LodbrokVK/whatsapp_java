package src;

/**
 *
 * @author ebner.m
 */
public class Mensagem {
    private String texto;
    
    public Mensagem(String texto){
        this.texto = texto;
    }
    
    public String getMensagem(){
        return this.texto;
    }
}
