

package outfittery;

/**
 * Die KLasse Unterteile ist eine Spezialisierung eines Artikels.
 * @author loreen
 * @version v1 - Dezember 2018
 */

public class Unterteile extends Artikel
{
    /**
     * Standardkonstruktor (eigentlich nur notwendig für die XML-Speicherung)
     */
    public Unterteile()
    {
    }
    

   
    /**
     * Konstruktor der Klasse Accesoires mit sechs Parametern
     * @param preis Preis, eines Oberteiles
     * @param größe Größe, des Oberteiles
     * @param preiskategorie gewünschte Höhe des Preises
     * @param geschlecht Geschlecht, welches dieses Oberteil tragen kann
     * @param lagerbestand vorhandener Lagervorrat dieses Oberteils
     * @param stil gewünschter Stil (sportlich, business,freizeit?)
     * @param beschreibung 
     */
    public Unterteile (double preis,String größe, String preiskategorie,String geschlecht, int lagerbestand, String stil, String beschreibung)
    {     
            super(preis,größe,geschlecht,lagerbestand,stil,beschreibung);
    
    }
}
