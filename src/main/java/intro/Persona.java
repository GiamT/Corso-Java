package intro;

public class Persona {
    private String nome;
    private int eta;
    private String professione;

    public Persona(String nome, int eta, String professione) {
        this.nome = nome;
        this.eta = eta;
        this.professione = professione;
    }

    public Persona() {

    }

    // Get nome
    public String getNome() {
        return nome;
    }

    // Get età
    public int getEta() {
        return eta;
    }

    // Get professione
    public String getProfessione() {
        return professione;
    }

    public void setNome(String nuovoNome) {
        nome = nuovoNome;
    }

    public void setEtà(int nuovaEta) {
        eta = nuovaEta;
    }

    public void setProfessione(String nuovaProfessione) {
        professione = nuovaProfessione;
    }

    public void presentati() {
        System.out.println("Ciao, sono " + nome + ", ho " + eta + " anni, Professione: " + professione + ".");
    }

    @Override
    public String toString() {
        return "Persona{" + "nome='" + nome + '\'' + ", età=" + eta + ", professione='" + professione + '\'' + '}';
    }

    public static void main(String[] args) {
        Persona persona = new Persona("Mario Rossi", 30, "Ingegnere");
        persona.presentati();
    }
}
