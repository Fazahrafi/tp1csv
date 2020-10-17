import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CSVWriter {

    static String contenu (ArrayList<Intervention> listeInterventions){


        // Ici, on va lister les Arrondissement et les nombres d'intervention
        // donc nombre de fois qu'un arrondissement apparait.

        int nbrInterventions = 0;

        String s = "";

        for (int i = 1; i<listeInterventions.size(); i++){

        }

        for (int i = 1; i<listeInterventions.size(); i++){



            nbrInterventions = Collections.frequency(listeInterventions, listeInterventions.get(i));
            s+= listeInterventions.get(i).getNomArrondissement() + ","+nbrInterventions+"\n";
        }

        return s;
    }

    static void creationFichier(ArrayList<Intervention> listeInterventions, String fichierSortie) throws IOException {
        String s = "Arrondissement,Nombre d'interventions\n";
        s+=contenu(listeInterventions);
        DiskFile.saveStringIntoFile(fichierSortie,s);

    }

}
