package ds2020;

public class jcc {
	private film[] competition;
    private int annee;
    private static final int NBFMAX = 30;
    private int nbF;
    public jcc(int annee) {
        this.annee = annee;
        this.competition = new film[NBFMAX];
        this.nbF = 0;
    }
    public void ajoutFilm(film f) {
        if (nbF < NBFMAX) {
            competition[nbF] = f;
            nbF++;
        } else {
            System.out.println("comp complet");
        }
    }
    public void listeFilmsjcc() {
        System.out.println("films en comp pour les jcc " + annee + ":");
        for (int i = 0; i < nbF; i++) {
            System.out.println(competition[i]);
        }
        
    }
    public float totalVenteBilletsjcc(int nbPlacesEtudiants) {
        float total = 0;
        for (int i = 0; i < nbF; i++) {
            total += competition[i].totalVenteBillets(nbPlacesEtudiants);
        }
        return total;
    }

}
