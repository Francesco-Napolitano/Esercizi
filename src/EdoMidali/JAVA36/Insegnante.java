package EdoMidali.JAVA36;

import EdoMidali.Persona;

public class Insegnante extends Persona {
    public Insegnante(String n, String c) {
        super(n, c);
    }
    public void saluta(){
        System.out.println("Ciao");
    }
}
