import java.util.List;

public class Intervention {

    String date;
    String heure;
    String nomParc;
    String nomArrondissement;
    String description;



    //GETTERS

    public String getDate() { return date; }

    public String getHeure() { return heure; }

    public String getNomParc() { return nomParc; }

    public String getNomArrondissement() { return nomArrondissement; }

    public String getDescription() { return description; }


    //SETTERS

    public void setDate(String date){
        this.date = date;
    }

    public void setHeure(String heure){
        this.heure = heure;
    }

    public void setNomParc(String nomParc){
        this.nomParc = nomParc;
    }

    public void setNomArrondissement(String nomArrondissement){
        this.nomArrondissement = nomArrondissement;
    }

    public void setDescription(String description){
        this.description = description;
    }


    public Intervention(String date, String heure, String nomParc, String nomArrondissement, String description){
        this.date = date;
        this.heure = heure;
        this.nomParc = nomParc;
        this.nomArrondissement = nomArrondissement;
        this.description = description;
    }

    public Intervention(List<String> elements) {
        this.date = elements.get(0);
        this.heure = elements.get(1);
        this.nomParc = elements.get(2);
        this.nomArrondissement = elements.get(3);
        this.description = elements.get(4);
    }

    @Override
    public String toString(){
        return "Date :" + date + ", Heure :" + heure + ", Parc :" + nomParc + ", Arrondissement :" + nomArrondissement + ", Description: " + description + ".";
    }

}
