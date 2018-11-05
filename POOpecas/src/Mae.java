
public class Mae {
    
    private int idade;
    protected String nome;
    private String sobrenomeMaterno;
    public String sobrenomePaterno;

    public Mae(String primeiroNome, String materno, String paterno) {
        this.nome = primeiroNome;
        this.sobrenomeMaterno = materno;
        this.sobrenomePaterno = paterno;
    }
    public String toString(){
        return nome+""+sobrenomeMaterno+""+sobrenomePaterno;
                
    }   
}
