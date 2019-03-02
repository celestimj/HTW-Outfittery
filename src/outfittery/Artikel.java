package outfittery;
/*
 * Die Klasse Artikel ist die Basisklasse aller unserer Artikelobjekte.
 * Sie ist abstrakt, da aus den Subklassen Objekte erzeugt werden sollen, nicht aber auf Basis dieser Klasse.
 * 
 * @author Loreen Gerard
 * @version v1 - Dezember 2018
 */
 

public abstract class Artikel 
{ //Instanzvariablen
    private int artikelnummer;
    private double preis;
    private int lagerbestand;
    private String größe;
    private String preiskategorie;
    private String geschlecht;
    private String stil;
    private String beschreibung;
    
    
    
 // Statische Variablen
  
 private static int artnr_counter = 1000;
 
  public Artikel()
  {
  }
  /** 
   *@param preis ist der Preis
   * @param größe ist die Größe
   * @param geschlecht ist das Geschlecht
   * @param lagerbestand ist der Lagerbestand
   * @param stil ist der Stil des Kleidungsstücks
   * @param beschreibung ist die Beschreibung
   */
  public Artikel(double preis, String größe, String geschlecht,int lagerbestand, String stil, String beschreibung)
    { 
       this.preis=preis;
       this.größe=größe;
       this.geschlecht=geschlecht;
       this.lagerbestand=lagerbestand;
       this.stil=stil;  
       this.beschreibung =beschreibung;
       this.artikelnummer = Artikel.artnr_counter;
        artnr_counter = artnr_counter + 1;
    }
  
  public void setArtikelnummer(int artikelnummer)
    {
        this.artikelnummer = artikelnummer;
    }
    
    public int getArtikelnummer()
    {
        return this.artikelnummer;
 
    }
public void setPreis(double preis)
    {
        this.preis = preis;
    }
    
    public double getPreis()
    {
        return this.preis;
 
    }
    
public void setGeschlecht(String geschlecht)
    {
        this.geschlecht = geschlecht;
    }
    
public String getGeschlecht()
    {
        return this.geschlecht;
    }
public void setStil(String stil)
    {
        this.stil = stil;
    }
    
public String getStil()
           
    {
        return this.stil;
    }
public void setPreiskategorie(String preiskategorie)
    {  
       this.preiskategorie = preiskategorie;
     
    }
    
public String getPreiskategorie()
    {
        if(preis< 29.99)
        {
        return this.preiskategorie = "niedrig";
        }
        if(preis>=29.99 && preis<80.00)
        {
         return this.preiskategorie= "mittel";
        }
        else
        {
        return this.preiskategorie = "hoch";
        }
    }
       
   

public void setLagerbestand(int lagerbestand) 
    {
        this.lagerbestand = lagerbestand;
    }
    
public int getLagerbestand()
    {
        return this.lagerbestand;
 
    }
public void setGröße(String größe)
    {
        this.größe = größe;
    }
    
public String getGröße()
    {
        return this.größe;
 
    }
public String getBeschreibung()
{ return this.beschreibung;
}

public void setBeschreibung( String beschreibung)
{

    this.beschreibung = beschreibung;
}

}
    


