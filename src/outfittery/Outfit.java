/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outfittery;

/**
 *
 * @author niki9
 */
public class Outfit extends Artikel
{
    
    private int artikelnummerOberteil;
    private int artikelnummerUnterteil; 
    private int artikelnummerSchuh;
    private int artikelnummerAccessoires;
    private int outfitid;   
    private static int id_counter = 1000;
    
    
    public Outfit(int ArtikelnrOberteilFind, int ArtikelnrUnterteilFind, int ArtikelnrSchuhFind, int ArtikelnrAccessoiresFind)//speicherung der artikelnummer
    {
        this.artikelnummerOberteil = ArtikelnrOberteilFind;//Speicherung der Artikelnr Oberteil
        this.artikelnummerUnterteil= ArtikelnrUnterteilFind;
        this.artikelnummerSchuh = ArtikelnrSchuhFind;
        this.artikelnummerAccessoires = ArtikelnrAccessoiresFind;
         this.outfitid = Outfit.id_counter;//hier muss noch angepasst werden das jedes kleidungsstück die gleicheoutfit ID bekommt
        id_counter = id_counter + 1;
        
    }
    
    
  
    public void setOutfitid(int outfitid)
    {
        this.outfitid = outfitid;
    }
    public int getOutfitid()
    {
        return this.outfitid;
 
    }
    
}
