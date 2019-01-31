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
    private int größe;
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
   *@param par1 ist der Preis
   * @param par2 ist die Preiskategorie
   * @param par3 ist das Geschlecht
   * @param par4 ist der Stil
   * @param par5 ist die Lagerbestand
   * @param par6 ist die Größe des Kleidungsstücks
   * @param par7 ist die Beschreibung
   */
  public Artikel(double par1,String par2, String par3,String par4, int par5, int par6, String par7)
    { 
       this.preis=par1;
       this.preiskategorie=par2;
       this.geschlecht=par3;
       this.stil=par4;
       this.lagerbestand=par5;
       this.größe=par6;
       this.beschreibung =par7;
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
        return this.preiskategorie;
 
    }
public void setLagerbestand(int lagerbestand) 
    {
        this.lagerbestand = lagerbestand;
    }
    
public int getLagerbestand()
    {
        return this.lagerbestand;
 
    }
public void setGröße(int größe)
    {
        this.größe = größe;
    }
    
public int getGröße()
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
    


