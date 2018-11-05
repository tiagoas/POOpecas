
public class Filha extends Mae{
    public String strApelido;
    private String strEsportePreferido;
    
    public Filha(String primeiroNome, String materno, String paterno) {
        super(primeiroNome, materno, paterno);
        //System.out.println("sobrenome materno: " + this.);
        System.out.println("Sobrenome Paterno: " + this.sobrenomePaterno);
    }

    public String getStrApelido() {
        return strApelido;
    }

    public void setStrApelido(String strApelido) {
        this.strApelido = strApelido;
    }

    public String getStrEsportePreferido() {
        return strEsportePreferido;
    }

    public void setStrEsportePreferido(String strEsportePreferido) {
        this.strEsportePreferido = strEsportePreferido;
    }
    
    
    
}
