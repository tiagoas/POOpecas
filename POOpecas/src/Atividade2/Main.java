
package Atividade2;

import java.util.ArrayList;


public class Main {


    public static void main(String[] args) {
        Peca p1 = new Peca();
        p1.setTipo("Porca");
        p1.setMaterial("ferro");
        p1.setPeso("1kg");
        
        
        Componente c1 = new Componente();
        c1.nome = "Cambio";
        c1.pecas.add(p1);
        
        
        
        ArrayList<Componente> Vet = new ArrayList<>();
        Vet.add(c1);
        
        
        Motor m1 = new Motor();
        m1.nome = "v12";
        m1.setComponentes(Vet);
        
   
        
        Carro car1 = new Carro();
        car1.strMarca = "ford";
        car1.strModelo = "50";
        car1.setComponentesCarro(Vet);
        car1.pecasCarro.add(p1);
        
        
        

        
    }
    
}
