package Actors;

import Main.Run;

import java.util.ArrayList;

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
        liste_des_receveurs.add(this);
    }

    public static ArrayList<Receveur> liste_des_receveurs = new ArrayList<>();

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

    // les methodes de la classe

    public static void EnregistrerReceveur(){
        new Donneur(InputOutput.Io.setString("\nNom du Receveur : "),InputOutput.Io.setString("\nPrenom du Receveur : "),
                Run.saisirEtVerificationSexe(), Run.saisirEtVerificationGroupeSanguin());
        System.out.print("\n******* Le Receveur a été enregistré *******\n");
    }

    public static void AfficherReceveur(){
        if (!liste_des_receveurs.isEmpty()){
            System.err.print("\n******* LISTE DE TOUS LES RECEVEURS *******\n");
            for (int i = 0; i < liste_des_receveurs.size(); i++) {
                System.out.print(
                        i+1+"  Nom du Receveur :"+liste_des_receveurs.get(i).getNom()+"\t"+
                                "Prenom du Receveur :"+liste_des_receveurs.get(i).getPrenom()+"\t"+
                                "Groupe Sanguin :"+liste_des_receveurs.get(i).getGroupeSanguin()+"\n"+"\n"
                );
            }
        }else
            System.err.print("\n******* Erreur Aucun Receveur n'a été enregistré *******\n");
    }

    public static void modifierReceveur(){
        if (!liste_des_receveurs.isEmpty()){
            System.err.print("\n******* LISTE DE TOUS LES RECEVEURS *******\n");
            AfficherReceveur();
            liste_des_receveurs.set(InputOutput.Io.setINT("Numero du Receveur à modifier :")-1,
                    new Receveur(InputOutput.Io.setString("\nNom du Receveur : "),InputOutput.Io.setString("\nPrenom du Receveur : "),
                            Run.saisirEtVerificationSexe(), Run.saisirEtVerificationGroupeSanguin()));
            System.err.print("\n******* LISTE DE TOUS LES RECEVEURS MISE A JOUR *******\n");
            liste_des_receveurs.remove(liste_des_receveurs.size()-1);
            AfficherReceveur();
        }else
            System.err.print("\n******* Erreur Aucun Receveur n'a été enregistré *******\n");

    }

    public static void supprimerReceveur(){
        if (!liste_des_receveurs.isEmpty()){
            System.err.print("\n******* LISTE DE TOUS LES RECEVEURS *******\n");
            AfficherReceveur();
            liste_des_receveurs.remove(InputOutput.Io.setINT("Numero du Receveur à supprimer :")-1);
            System.err.print("\n******* LISTE DE TOUS LES RECEVEURS MISE A JOUR *******\n");
            AfficherReceveur();
        }else
            System.err.print("\n******* Erreur Aucun Receveur n'a été enregistré *******\n");
    }
}
