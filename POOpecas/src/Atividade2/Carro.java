
package Atividade2;

import java.util.ArrayList;

public class Carro {
    public String strModelo;
    public String strMarca;
    public ArrayList<Componente>componentesCarro;
    public ArrayList<Peca>pecasCarro;

    public ArrayList<Componente> getComponentesCarro() {
        return componentesCarro;
    }

    public void setComponentesCarro(ArrayList<Componente> componentesCarro) {
        this.componentesCarro = componentesCarro;
    }
    
    
    
}
