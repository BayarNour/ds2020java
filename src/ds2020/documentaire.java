package ds2020;

public class documentaire extends film{
	 private String sujet;
	    private static final float tarif = 2.0f;
	    public documentaire(String titre, String realisateur, String pays, int duree, String sujet) {
	        super(titre, realisateur, pays, duree);
	        this.sujet = sujet;
	    }
	    public String toString() {
	        return super.toString() + " Sujet: " + sujet;
	    }
	    public float totalVenteBillets(int nbPlacesEtudiants) {
	        if (nbPlacesEtudiants > getNbplace()) {
	            System.out.println("Le nombre de places pour étudiants ne peut pas dépasser les places réservées.");
	            return 0;
	        }

	        int nbPlacesPublic = getNbplace() - nbPlacesEtudiants;
	        float tot = (nbPlacesEtudiants * tarif) + (nbPlacesPublic * 3);

	        return tot;
	    }

	

}
