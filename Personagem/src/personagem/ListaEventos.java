package personagem;

import java.util.ArrayList;

public class ListaEventos {
    ArrayList<Evento> eventos = new ArrayList();
    
    
    void insereEvento(Evento grupo){
        eventos.add(grupo);
    }
    
    void removeEvento(Evento grupo){
        eventos.remove(grupo);
    }
}
