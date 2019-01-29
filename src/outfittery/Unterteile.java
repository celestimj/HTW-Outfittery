

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
     * Konstruktor der Klasse Unterteile mit sechs Parametern
     * @param preis Preis, eines Unterteiles
     * @param größe Größe, des Oberteiles
     * @param preiskategorie gewünschte Höhe des Preises
     * @param geschlecht Geschlecht, welches dieses Oberteil tragen kann
     * @param lageranzahl vorhandener Lagervorrat dieses Oberteils
     * @param stil gewünschter Stil (sportlich, business,freizeit?)
     * @param beschreibung
     */
    public Unterteile(double par1,String par2, String par3,String par4, int par5, int par6, String par7)
    {     
            super(par1,par2,par3,par4,par5,par6,par7);
    
    }
}
