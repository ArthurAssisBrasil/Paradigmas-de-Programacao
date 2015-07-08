package personagem;

public class Personagem {
    private String nomePersonagem;
    private String nomeJogador;
    private String raca;
    private String classe;
    private int level;
    private String profissao;
    private int levelProf;
    private String especialidade;
    private String dias;
    
    public Personagem(String nomePersonagem, String raca, String classe, int level, String profissao, int levelProf, String especialidade){
        this.nomePersonagem = nomePersonagem;
        this.raca = raca;
        this.classe = classe;
        this.level = level;
        this.profissao = profissao;
        this.levelProf = levelProf;
        this.especialidade = especialidade;
    }
    
    public Personagem(String nomeJogador){
        this.nomeJogador = nomeJogador;
    }
    
    public String getNomeJogador(){
        return this.nomeJogador;
    }
    
    public String getNomePersonagem(){
        return this.nomePersonagem;
    }
    
    public String getRaca(){
        return this.raca;
    }
    
    public String getClasse(){
        return this.classe;
    }
    
    public int getLevel(){
        return this.level;
    }
    
    public String getProfissao(){
        return this.profissao;
    }
    
    public int getProfLevel(){
        return this.levelProf;
    }
    
    public String getEspecialidade(){
        return this.especialidade;
    }
}
