package Actors;

public class Receveur {
    private String nom ;
    private String prenom;
    private String sexe;
    private String groupeSanguin;

    // le constructeur de la classe Receveur

    public Receveur(String nom, String prenom, String sexe, String groupeSanguin) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.groupeSanguin = groupeSanguin;
    }

    // le constructeur vide de la classe Receveur

    public Receveur(){}

    // les Setters et les Getters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getGroupeSanguin() {
        return groupeSanguin;
    }

    public void setGroupeSanguin(String groupeSanguin) {
        this.groupeSanguin = groupeSanguin;
    }
}
