package ds2020;

public class main {
	 public static void main(String[] args) {
	        jcc jcc2021 = new jcc(2021);

	        film film1 = new documentaire("Le dernier refuge", "Ousman", "Mali", 86, "La guerre civile");
	        film1.setNbplace(30);
	        jcc2021.ajoutFilm(film1);

	        film film2 = new film("Insurrection", "Jilani Saadi", "Tunisie", 105);
	        film2.setNbplace(45);
	        jcc2021.ajoutFilm(film2);

	        jcc2021.listeFilmsjcc();

	        int nbEtudiantsFilm1 = 9;
	        int nbEtudiantsFilm2 = 17;
	        float totalVentes = film1.totalVenteBillets(nbEtudiantsFilm1) + film2.totalVenteBillets(nbEtudiantsFilm2);
	        
	        System.out.println("Total billets pour jcc 2021 : " + totalVentes + " DT");
	    }

}
