package ds2020;

public class film {
	 private String titre;
	    private String realisateur;
	    private String pays;
	    private int duree;
	    private int nbplace;

	    public film(String titre, String realisateur, String pays, int duree) {
	        this.titre = titre;
	        this.realisateur = realisateur;
	        this.pays = pays;
	        this.duree = duree;
	        this.nbplace = 0;
	    }

	    public int getNbplace() {
	        return nbplace;
	    }

	    public void setNbplace(int nbplace) {
	        this.nbplace = nbplace;
	    }
	    public String toString() {
	        return titre + " de " + realisateur + " (" + pays + ") - " + duree + "min.";
	    }
	    
	    public float totalVenteBillets(int nbPlacesEtudiants) {
	        if (nbPlacesEtudiants > nbplace) {
	            System.out.println("Le nb etudiants ne depasse pas les places reservee ");
	            return 0;
	        }

	        int nbPlacesPublic = nbplace - nbPlacesEtudiants;
	        float total = (nbPlacesEtudiants * 2) + (nbPlacesPublic * 3);

	        return total;
	    }

}
