package Main;

import Actors.Donneur;
import Actors.Receveur;
import InputOutput.Io;

public class Run {

    private static final String[] liste_des_groupes_sanguins = new String[]{"A-", "A+", "AB", "O+", "O-", "B+", "B-"};
    private static final String[] liste_sexe = new String[]{"M", "F"};

    public static String saisirEtVerificationGroupeSanguin() {
        String groupe_sanguin_utilisateur = Io.setString("\nGroupe sanguin : ");
        String gp_sanguin = null;
        for (int i = 0; i < liste_des_groupes_sanguins.length; i++) {
            if (liste_des_groupes_sanguins[i].contentEquals(groupe_sanguin_utilisateur)) {
                gp_sanguin = liste_des_groupes_sanguins[i];
                return gp_sanguin;
            }
        }
        System.err.print("\n****** CE GROUPE SANGUIN N'EXISTE PAS ******\n");
        saisirEtVerificationGroupeSanguin();

        return gp_sanguin;
    }

    public static String saisirEtVerificationSexe() {
        String sexe_utilisateur = Io.setString("\nSexe : ");
        String sexe = null;
        for (int i = 0; i < liste_sexe.length; i++) {
            if (liste_sexe[i].contentEquals(sexe_utilisateur)) {
                sexe = liste_sexe[i];
                return sexe;
            }
        }
        System.err.print("\n****** CE GENRE N'EXISTE PAS ******\n");
        saisirEtVerificationSexe();

        return sexe;
    }


        // fonction de demarrage
        static void Menu () {
            System.out.print("1.Enregistrer un donneur");
            System.out.print("\n2.Enregister un receveur");
            System.out.print("\n3.Afficher la liste des donneurs");
            System.out.print("\n4.Afficher la liste des receveurs");
            System.out.print("\n5.Modifier un donneur");
            System.out.print("\n6.Modifier un receveur");
            System.out.print("\n7.Supprimer un donneur");
            System.out.print("\n8.Supprimer un receveur");
            System.out.print("\n9.Fermer et Quitter le programme");
        }

        private static void Operation () {
            Menu();
            int choix_utilisateur = Io.setINT("\n\nChoisir un action : ");
            switch (choix_utilisateur) {
                case 1 -> Donneur.EnregistrerDonneur();
                case 2 -> Receveur.EnregistrerReceveur();
                case 3 -> Donneur.AfficherDonneur();
                case 4 -> Receveur.AfficherReceveur();
                case 5 -> Donneur.modifierDonneur();
                case 6 -> Receveur.modifierReceveur();
                case 7 -> Donneur.supprimerDonneur();
                case 8 -> Receveur.supprimerReceveur();
                case 9 -> {
                    System.out.print("\n\n***** MERCI D'UTILISER NOTRE PROGRAMME AUREVOIR ******\n\n");
                    System.exit(0);
                }
            }
        }
        public static void main (String[]args){
            while (true) {
                Operation();
            }
        }
    }

