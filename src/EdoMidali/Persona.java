package EdoMidali;

public class Persona {
    private String nome;
    private String cognome;

    public Persona(String n, String c) {
        this.nome = n;
        this.cognome = c;
    }

    public Persona (Persona persona){
        this.copiaPersona(persona);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void copiaPersona(Persona persona) {
        this.setNome(persona.getNome());
        this.setCognome(persona.getCognome());
    }

    public void saluta() {
    }
}
