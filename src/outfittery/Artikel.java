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
 
 /**
  * Standartkonstruktor (für XML Speicherung)
  */
  public Artikel()
  {
  }
  
  /** Konstruktor für einen Artikel
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
  
  /**
   * Methode setzt Artikelnummer des Artikel.
   * @param artikelnummer 
   */
  public void setArtikelnummer(int artikelnummer)
    {
        this.artikelnummer = artikelnummer;
    }
    
  /**
   * Methode gibt die Artikelnummer des Artikel zurück.
   * @return 
   */
    public int getArtikelnummer()
    {
        return this.artikelnummer;
 
    }
    
    /**
     * Methode setzt den Preis des Artikels.
     * @param preis 
     */
     public void setPreis(double preis)
    {
        this.preis = preis;
    }
    
   /**
    * Methode gibt den Preis des Artikel zurück.
    * @return 
    */
    public double getPreis()
    {
        return this.preis;
 
    }
    
    /**
     * Methode setzt das Geschlecht des Artikels.
     * @param geschlecht 
     */
    public void setGeschlecht(String geschlecht)
    {
        this.geschlecht = geschlecht;
    }
    
    /**
     * Methode gibt das Geschlecht des Artikel zurück.
     * @return 
     */
    public String getGeschlecht()
    {
        return this.geschlecht;
    }
    
    /**
     * Methode setzt den Stil des Artikel.
     * @param stil 
     */
    public void setStil(String stil)
    {
        this.stil = stil;
    }
    
    /**
     * Methode gibt den Stil des Artikel zurück.
     * @return 
     */
    public String getStil()       
    {
        return this.stil;
    }
    
    /**
     *  Methode setzt die Preiskategorie des Artikel.
     * @param preiskategorie 
     */
    public void setPreiskategorie(String preiskategorie)
    {  
       this.preiskategorie = preiskategorie;
     
    }
    
    /**
     * Methode gibt die Preiskategorie des Artikel zurück am Preis orientiert.
     * @return 
     */
    public String getPreiskategorie()
    {
        if(preis<= 29.99)
        {
        return this.preiskategorie = "niedrig";
        }
        if(preis>29.99 && preis<80.00)
        {
         return this.preiskategorie= "mittel";
        }
        else
        {
        return this.preiskategorie = "hoch";
        }
    }
       
   
    /**
     * Methode setzt den Lagerbestand des Artikel.
     * @param lagerbestand 
     */
    public void setLagerbestand(int lagerbestand) 
    {
        this.lagerbestand = lagerbestand;
    }
    
    /**
     * Methode gibt den Lagerbestand des Artikel zurück.
     * @return 
     */
    public int getLagerbestand()
    {
        return this.lagerbestand;
 
    }
    
    /**
     * Methode setzt die Größe des Artikel.
     * @param größe 
     */
    public void setGröße(String größe)
    {
        this.größe = größe;
    }
    
    /**
     * Methode gibt die Größe des Artikel zurück.
     * @return 
     */
    public String getGröße()
    {
        return this.größe;
 
    }
    
    /**
     * Methode gibt die Beschreibund des Artikel zurück.
     * @return 
     */
    public String getBeschreibung()
    {
        return this.beschreibung;
    }

    /**
     * Methode setzt die Beschreibung des Artikel.
     * @param beschreibung 
     */
    public void setBeschreibung( String beschreibung)
    {

    this.beschreibung = beschreibung;
    }

}
    


