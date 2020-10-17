import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Principale {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Parametres manquants");
            System.out.println("usage : java Main.class <fichier entree> <fichier sortie> ");
            System.exit(1);
        }


        String fichierEntree = args[0];
        String fichierSortie = args[1];
        System.out.println("Nom du fichier d'entree: " + fichierEntree);
        System.out.println("Nom du fichier de sortie: " + fichierSortie);

        ArrayList<String> lignes = CSVReader.lectureFichier(args[0]);

        ArrayList<Intervention> liste = CSVReader.interventions(lignes);
        CSVWriter.creationFichier(liste, args[1]);


    }
}
