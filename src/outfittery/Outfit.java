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
public class Outfit
{
    
    private int artikelnummer;
    private int outfitid;   
    private static int id_counter = 1000;
    
    public Outfit(int nr)//speicherung der artikelnummer
    {
        this.artikelnummer= nr;//hier muss der ganze Artikel gespeichert werden
         this.outfitid = Outfit.id_counter;//hier muss noch angepasst werden das jedes kleidungsstück die gleicheoutfit ID bekommt
        id_counter = id_counter + 1;
        
    }
    
    public void setArtikelnummer(int artikelnummer)
    {
        this.artikelnummer = artikelnummer;
    }
    public int getArtikelnummer()
    {
        return this.artikelnummer;
 
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
