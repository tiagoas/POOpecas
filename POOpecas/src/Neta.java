
public class Neta extends Filha {
    
    public Neta(String primeiroNome, String materno, String paterno, String strApelido, String EsportePreferido) {
        super(primeiroNome, materno, paterno);
        this.strApelido = strApelido;
        this.setStrEsportePreferido(EsportePreferido);
    }

    public String getStrApelido() {
        return strApelido;
    }

    public void setStrApelido(String strApelido) {
        this.strApelido = strApelido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenomePaterno() {
        return sobrenomePaterno;
    }

    public void setSobrenomePaterno(String sobrenomePaterno) {
        this.sobrenomePaterno = sobrenomePaterno;
    }


    
}
