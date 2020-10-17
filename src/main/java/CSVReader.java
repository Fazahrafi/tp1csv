
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CSVReader {

    static ArrayList<String> lectureFichier (String fichierEntree) throws FileNotFoundException {
        ArrayList<String> lignes =new ArrayList<>();
        try {

            Scanner sc = new Scanner(new File(fichierEntree));

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                lignes.add(line);
            }
            sc.close();
        }catch(FileNotFoundException e){
            System.out.println("Le fichier d'entree n'existe pas");
            System.exit(0);
        }

        return lignes;
    }

    //ajout
    private static Intervention intervention(String[] elements){
        String date = elements[0];
        String heure = elements[1];
        String nomParc = elements[2];
        String nomArrondissement = elements[3];
        String description = elements[4];

        //type de retour
        return new Intervention(date, heure, nomParc, nomArrondissement, description);
    }

    static ArrayList<Intervention> interventions (ArrayList<String> lignes){
        ArrayList<Intervention> i = new ArrayList<>();
        for (String l:lignes){
            List<String> elements = Arrays.asList(l.split(","));
            i.add(new Intervention(elements));
        }

        return i;

    }
}