package Actors;

import java.util.ArrayList;

public class Donneur {
    private String nom ;
    private String prenom;
    private String sexe;
    private String groupeSanguin;

    // la liste qui va contenir tous les donneurs

    public static ArrayList<Donneur> liste_des_donneurs = new ArrayList<>();

    // le constructeur de la classe Donneur

    public Donneur(String nom, String prenom, String sexe, String groupeSanguin) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.groupeSanguin = groupeSanguin;
        liste_des_donneurs.add(this);
    }

    // le constructeur vide de la classe Donneur
    public Donneur(){}

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

    // les methodes de la classe

    public static void EnregistrerDonneur(){
        new Donneur(InputOutput.Io.setString("\nNom du donneur : "),InputOutput.Io.setString("\nPrenom du donneur : "),
                InputOutput.Io.setString("\nSexe du donneur : "),InputOutput.Io.setString("\nGroupe sanguin du donneur : "));
        System.out.print("\n******* Le Donneur a été enregistré *******\n");
    }

    public static void AfficherDonneur(){
        if (!liste_des_donneurs.isEmpty()){
            System.err.print("\n******* LISTE DE TOUS LES DONNEURS *******\n");
            for (int i = 0; i < liste_des_donneurs.size(); i++) {
                System.out.print(
                        i+1+">>>>>Nom du Donneur :"+liste_des_donneurs.get(i).getNom()+"\t"+
                                "Prenom du Donneur :"+liste_des_donneurs.get(i).getPrenom()+"\t"+
                                "Groupe Sanguin :"+liste_des_donneurs.get(i).getGroupeSanguin()+"\n"
                );
            }
        }else
            System.err.print("\n******* Erreur Aucun Donneur n'a été enregistré *******\n");
    }

    public static void modifierDonneur(){
        if (!liste_des_donneurs.isEmpty()){
            System.err.print("\n******* LISTE DE TOUS LES DONNEURS *******\n");
            AfficherDonneur();
            liste_des_donneurs.set(InputOutput.Io.setINT("Numero du donneur à modifier :")-1,
                    new Donneur(InputOutput.Io.setString("\nNom du donneur : "),InputOutput.Io.setString("\nPrenom du donneur : "),
                            InputOutput.Io.setString("\nSexe du donneur : "),InputOutput.Io.setString("\nGroupe sanguin du donneur : ")));
            System.err.print("\n******* LISTE DE TOUS LES DONNEURS MISE A JOUR *******\n");
            liste_des_donneurs.remove(liste_des_donneurs.size()-1);
            AfficherDonneur();
        }else
            System.err.print("\n******* Erreur Aucun Donneur n'a été enregistré *******\n");

    }

    public static void supprimerDonneur(){
        if (!liste_des_donneurs.isEmpty()){
            System.err.print("\n******* LISTE DE TOUS LES DONNEURS *******\n");
            AfficherDonneur();
            liste_des_donneurs.remove(InputOutput.Io.setINT("Numero du donneur à supprimer :")-1);
            System.err.print("\n******* LISTE DE TOUS LES DONNEURS MISE A JOUR *******\n");
            AfficherDonneur();
        }else
            System.err.print("\n******* Erreur Aucun Donneur n'a été enregistré *******\n");
    }
}
