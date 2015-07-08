package personagem;

import java.util.ArrayList;

public class ListaPersonagens {
    ArrayList<Personagem> personagens = new ArrayList();
    
    
    void inserePersonagem(Personagem personagem){
        personagens.add(personagem);
    }
    
    void removePersonagem(Personagem personagem){
        personagens.remove(personagem);
    }
}
