package personagem;

import java.util.ArrayList;

public class Evento {
    private int tamanho;
    String diasHorarios = new String();
    String personagensString = new String();
    boolean[][] dias = new boolean[7][3];
    private Personagem[] personagens;
    
    public Evento(Personagem[] personagens){
        this.personagens = personagens;
        this.tamanho = personagens.length;
        resetaDias(this.dias);
    }
    
    private void resetaDias(boolean[][] dias){
        for(int i=0; i< 7; i++)
            for(int j=0; j<3;j++)
                dias[i][j] = false;
    }
    
    public boolean[][] getDias(){
        return this.dias;
    }
    
    public int getTamanho(){
        return this.tamanho;
    } 
    
    public Personagem[] getPersonagens(){
        return  this.personagens;
    }
    
    public String getDiasHorarios(){
        return this.diasHorarios;
    }
    
    public String getPersonagensString(){
        return this.personagensString;
    }
}
