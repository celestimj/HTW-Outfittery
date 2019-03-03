
package outfittery;

/**
 * Die Klasse Outfit hilft bei der Erstellung eines Outfits durch die Artikel.
 * 
 * @author loreen
 */
public class Outfit extends Artikel {

    private int artikelnummerOberteil;
    private int artikelnummerUnterteil;
    private int artikelnummerSchuh;
    private int artikelnummerAccessoires;
    private int outfitid;
    private static int id_counter = 1000;

    public Oberteil oberteil;
    public Unterteil unterteil;
    public Schuhe schuhe;
    public Accessoires accessoires;

    
    /**
     * 
     * @param oberteil
     * @param unterteil
     * @param schuhe
     * @param accessoires 
     */
    public Outfit(Oberteil oberteil, Unterteil unterteil, Schuhe schuhe, Accessoires accessoires) {
        this.oberteil = oberteil;
        this.unterteil = unterteil;
        this.schuhe = schuhe;
        this.accessoires = accessoires;
    }

    
    /**
     * 
     * @param ArtikelnrOberteilFind
     * @param ArtikelnrUnterteilFind
     * @param ArtikelnrSchuhFind
     * @param ArtikelnrAccessoiresFind 
     */
    public Outfit(int ArtikelnrOberteilFind, int ArtikelnrUnterteilFind, int ArtikelnrSchuhFind, int ArtikelnrAccessoiresFind)//speicherung der artikelnummer
    {
        this.artikelnummerOberteil = ArtikelnrOberteilFind;//Speicherung der Artikelnr Oberteil
        this.artikelnummerUnterteil = ArtikelnrUnterteilFind;
        this.artikelnummerSchuh = ArtikelnrSchuhFind;
        this.artikelnummerAccessoires = ArtikelnrAccessoiresFind;
        this.outfitid = Outfit.id_counter;//hier muss noch angepasst werden das jedes kleidungsstück die gleicheoutfit ID bekommt
        id_counter = id_counter + 1;

    }

    /**
     * 
     * @param outfitid 
     */
    public void setOutfitid(int outfitid) {
        this.outfitid = outfitid;
    }

    /**
     * 
     * @return 
     */
    public int getOutfitid() {
        return this.outfitid;

    }

}
