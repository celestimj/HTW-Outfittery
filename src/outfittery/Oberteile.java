
package outfittery;

/**
 * Die KLasse Oberteile ist eine Spezialisierung eines Artikels.
 * @author loreen
 * @version v1 - Dezember 2018
 */

public class Oberteile extends Artikel
{   // Instanzvaribale
    
    /**
     * Standardkonstruktor (eigentlich nur notwendig für die XML-Speicherung)
     */
    public Oberteile()
    {
    }
    
/**
     
    /**
     * Konstruktor der Klasse Accessoires mit sechs Parametern
     * @param preis Preis, eines Oberteiles
     * @param größe Größe, des Oberteiles  
     * @param geschlecht Geschlecht, welches dieses Oberteil tragen kann
     * @param lagerbestand vorhandener Lagervorrat dieses Oberteils
     * @param stil gewünschter Stil (sportlich, business,freizeit?)
     * @param beschreibung 
     */
    public Oberteile (double preis,String größe,String geschlecht, int lagerbestand, String stil, String beschreibung)
    {     
            super(preis,größe,geschlecht,lagerbestand,stil,beschreibung);
        /*
        double preis = preis;
        String größe = größe;
        String geschlecht = geschlecht;
        int lagerbestand = lagerbestand;
        String stil = stil;
        String beschreibung = beschreibung;
         */
    }
    

}
    


