
package outfittery;
/**
 * Die KLasse Accessoires ist eine Spezialisierung eines Artikels.
 * @author loreen
 * @version v1 - Dezember 2018
 */

public class Accessoires extends Artikel
{
    /**
     * Standardkonstruktor (eigentlich nur notwendig für die XML-Speicherung)
     */
    public Accessoires()
    {
    }
    

    /**
     * Konstruktor der Klasse Accessoires mit sechs Parametern
     * @param preis Preis, eines Oberteiles
     * @param größe Größe, des Oberteiles
     * @param geschlecht Geschlecht, welches dieses Oberteil tragen kann
     * @param lagerbestand vorhandener Lagervorrat dieses Oberteils
     * @param stil gewünschter Stil (sportlich, business,freizeit?)
     * @param beschreibung 
     */
    public Accessoires(double preis,String größe,String geschlecht, int lagerbestand, String stil, String beschreibung)
    {     
            super(preis,größe,geschlecht,lagerbestand,stil,beschreibung);
    
    }
}

