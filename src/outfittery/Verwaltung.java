package outfittery;

import java.beans.*;                        // fuer die XML-Speicherung
import java.io.*;                           // fuer das Speichern und Laden in / von Dateien
import java.util.*;                         // fuer ArrayLists
import de.htw.saarland.stl.Stdin;           // fuer Eingaben von der Konsole

/**
 * Die Klasse Verwaltung stellt den Hauptteil der Applikation OutfitteryPortal
 * dar. Hier wird die Programmlogik implementiert, sowie die Benutzer-Menues.
 *
 * @author Loreen
 * @version v1 - Dezember 2018
 */

/**
 * Variablen der Klasse Verwaltung
 */
public class Verwaltung implements Serializable {

    private ArrayList<Outfit> outfitListe; //Liste für gefundene Outfits
    private ArrayList<Artikel> artikelListeListe2; //Kundenliste
    private ArrayList<Kunde> kundenListe; //Kundenliste
    private ArrayList<Artikel> artikelListe;  //liste mit allen Artikeln
    final static int FELDLAENGE = 14;

    /**
     * Konstruktor für die Objekte der Klasse Verwaltung
     */
    public Verwaltung() {

        outfitListe = new ArrayList<>();//Hier können die Kleidungstücke gespeichert werden von Outfitsuche
        kundenListe = new ArrayList<>(); // hier sind die KUnden abgespeichert
        artikelListe = new ArrayList<>(); // hier sind alle vorhandenen Artikel gespeichert
    }

     /**
      * die vorhandenen Kunden, Ober-, Unterteile, Schuhe und Accessoires wurden hier initialisiert
      */
    public void initData() {
       
        Kunde k1 = new Kunde("Tim", "Müller", "015609354267");
        Kunde k2 = new Kunde("Michelle", "Watson", "01712233593");
        Kunde k3 = new Kunde("Lena", "Caron", "01774622273");
        Kunde k4 = new Kunde("Eric", "Lentes", "01608874036");
        kundenListe.add(k1);
        kundenListe.add(k2);
        kundenListe.add(k3);
        kundenListe.add(k4);

        Oberteil o1 = new Oberteil(24.99, "S", "unisex", 255, "sportlich", "Blauer Kapuzenpullover mit Aufschrift"); 
        Oberteil o2 = new Oberteil(15.99, "M", "männlich", 155, "freizeit", "Blauer Pullover mit V-Ausschnitt");  
        Oberteil o3 = new Oberteil(20.99, "S", "unisex", 145, "freizeit", "Roter Kapuzenpullover");
        Oberteil o4 = new Oberteil(29.99, "L", "weiblich", 305, "business", "Weiße Bluse mit 3/4 Ärmel und Knopfleiste");
        Oberteil o5 = new Oberteil(29.99, "XL", "männlich", 305, "business", "Weißes Hemd mit Brusttasche und Knopfleiste");
        Oberteil o6 = new Oberteil(29.99, "L", "männlich", 305, "business", "Weißes Hemd mit Brusttasche und Knopfleiste");
        Oberteil o7 = new Oberteil(29.99, "M", "männlich", 305, "business", "Weißes Hemd mit Brusttasche und Knopfleiste");
        Oberteil o8 = new Oberteil(29.99, "S", "männlich", 305, "business", "Weißes Hemd mit Brusttasche und Knopfleiste");
        Oberteil o9 = new Oberteil(29.99, "S", "weiblich", 305, "business", "Weißes Bluse mit Brusttasche und Knopfleiste");
        Oberteil o10 = new Oberteil(29.99, "M", "weiblich", 305, "business", "Weißes Bluse mit Brusttasche und Knopfleiste");
        Oberteil o11= new Oberteil(29.99, "L", "weiblich", 305, "business", "Weißes Bluse mit Brusttasche und Knopfleiste");
        Oberteil o12= new Oberteil(29.99, "XL", "weiblich", 305, "business", "Weißes Bluse mit Brusttasche und Knopfleiste");
        Oberteil o13= new Oberteil(29.99, "S", "unisex", 305, "business", "Polohemd weiss");
        Oberteil o14= new Oberteil(29.99, "M", "unisex", 305, "business", "Polohemd weiss");
        Oberteil o15= new Oberteil(29.99, "L", "unisex", 305, "business", "Polohemd weiss");
        Oberteil o16= new Oberteil(29.99, "XL", "unisex", 305, "business", "Polohemd weiss");
        Oberteil o17= new Oberteil(29.99, "S", "männlich", 305, "business", "Blaues Hemd mit Brusttasche und Knopfleiste");
        Oberteil o18= new Oberteil(29.99, "M", "männlich", 305, "business", "Blaues Hemd mit Brusttasche und Knopfleiste");
        Oberteil o19= new Oberteil(29.99, "L", "männlich", 305, "business", "Blaues Hemd mit Brusttasche und Knopfleiste");
        Oberteil o20= new Oberteil(29.99, "XL", "männlich", 305, "business", "Blaues Hemd mit Brusttasche und Knopfleiste");
        Oberteil o21= new Oberteil(29.99, "S", "weiblich", 305, "business", "Blaues Bluse mit Brusttasche und Knopfleiste");
        Oberteil o22= new Oberteil(29.99, "M", "weiblich", 305, "business", "Blaues Bluse mit Brusttasche und Knopfleiste");
        Oberteil o23= new Oberteil(29.99, "L", "weiblich", 305, "business", "Blaues Bluse mit Brusttasche und Knopfleiste");
        Oberteil o24= new Oberteil(29.99, "XL", "weiblich", 305, "business", "Blaues Bluse mit Brusttasche und Knopfleiste");
        Oberteil o25= new Oberteil(29.99, "S", "unisex", 305, "business", "Polohemd blau");
        Oberteil o26= new Oberteil(29.99, "M", "unisex", 305, "business", "Polohemd blau");
        Oberteil o27 = new Oberteil(29.99, "L", "unisex", 305, "business", "Polohemd blau");
        Oberteil o28 = new Oberteil(29.99, "XL", "unisex", 305, "business", "Polohemd blau");
        Oberteil o29 = new Oberteil(29.99, "S", "männlich", 305, "freizeit", "Schwarzer Hoodie");
        Oberteil o30= new Oberteil(29.99, "M", "männlich", 305, "freizeit", "Schwarzer Hoodie");
        Oberteil o31= new Oberteil(29.99, "L", "männlich", 305, "freizeit", "Schwarzer Hoodie");
        Oberteil o32= new Oberteil(29.99, "XL", "männlich", 305, "freizeit", "Schwarzer Hoodie");
        Oberteil o33 = new Oberteil(29.99, "S", "weiblich", 305, "freizeit", "Rosa Bluse");
        Oberteil o34= new Oberteil(29.99, "M", "weiblich", 305, "freizeit", "Rosa Bluse");
        Oberteil o35 = new Oberteil(29.99, "L", "weiblich", 305, "freizeit", "Rosa Bluse");
        Oberteil o36 = new Oberteil(29.99, "XL", "weiblich", 305, "freizeit", "Rosa Bluse");
        Oberteil o37= new Oberteil(29.99, "S", "unisex", 305, "freizeit", "rotes Tshirt");
        Oberteil o38= new Oberteil(29.99, "M", "unisex", 305, "freizeit", "rotes Tshirt");
        Oberteil o39 = new Oberteil(29.99, "L", "unisex", 305, "freizeit", "rotes Tshirt");
        Oberteil o40 = new Oberteil(29.99, "XL", "unisex", 305, "freizeit", "rotes Tshirt");
        Oberteil o41 = new Oberteil(29.99, "S", "männlich", 305, "freizeit", "grünes Sweatshirt");
        Oberteil o42= new Oberteil(29.99, "M", "männlich", 305, "freizeit", "grünes Sweatshirt");
        Oberteil o43= new Oberteil(29.99, "L", "männlich", 305, "freizeit", "grünes Sweatshirt");
        Oberteil o44= new Oberteil(29.99, "XL", "männlich", 305, "freizeit", "grünes Sweatshirt");
        Oberteil o45 = new Oberteil(29.99, "S", "weiblich", 305, "freizeit", "Rosa Tunika");
        Oberteil o46= new Oberteil(29.99, "M", "weiblich", 305, "freizeit", "Rosa Tunika");
        Oberteil o47 = new Oberteil(29.99, "L", "weiblich", 305, "freizeit", "Rosa Tunika");
        Oberteil o48 = new Oberteil(29.99, "XL", "weiblich", 305, "freizeit", "Rosa Tunika");
        Oberteil o49= new Oberteil(29.99, "S", "unisex", 305, "freizeit", "Hellblauer Pulli");
        Oberteil o50= new Oberteil(29.99, "M", "unisex", 305, "freizeit", "Hellblauer Pulli");
        Oberteil o51 = new Oberteil(29.99, "L", "unisex", 305, "freizeit", "Hellblauer Pulli");
        Oberteil o52 = new Oberteil(29.99, "XL", "unisex", 305, "freizeit", "Hellblauer Pulli");
        Oberteil o53 = new Oberteil(29.99, "S", "männlich", 305, "sportlich", "Schwarzer NIKE Hoodie");
        Oberteil o54= new Oberteil(29.99, "M", "männlich", 305, "sportlich", "Schwarzer NIKE Hoodie");
        Oberteil o55= new Oberteil(29.99, "L", "männlich", 305, "sportlich", "Schwarzer NIKE Hoodie");
        Oberteil o56= new Oberteil(29.99, "XL", "männlich", 305, "sportlich", "Schwarzer NIKE Hoodie");
        Oberteil o57 = new Oberteil(29.99, "S", "weiblich", 305, "sportlich", "Rosa ADIDAS Shirt");
        Oberteil o58= new Oberteil(29.99, "M", "weiblich", 305, "sportlich", "Rosa ADIDAS Shirt");
        Oberteil o59 = new Oberteil(29.99, "L", "weiblich", 305, "sportlich", "Rosa ADIDAS Shirt");
        Oberteil o60 = new Oberteil(29.99, "XL", "weiblich", 305, "sportlich", "Rosa ADIDAS Shirt");
        Oberteil o61= new Oberteil(29.99, "S", "unisex", 305, "sportlich", "rotes PUMA Tshirt");
        Oberteil o62= new Oberteil(29.99, "M", "unisex", 305, "sportlich", "rotes PUMA Tshirt");
        Oberteil o63 = new Oberteil(29.99, "L", "unisex", 305, "sportlich", "rotes PUMA Tshirt");
        Oberteil o64 = new Oberteil(29.99, "XL", "unisex", 305, "sportlich", "rotes PUMA Tshirt");
        Oberteil o65 = new Oberteil(29.99, "S", "männlich", 305, "sportlich", "grünes PUMA Sweatshirt");
        Oberteil o66= new Oberteil(29.99, "M", "männlich", 305, "sportlich", "grünes PUMA Sweatshirt");
        Oberteil o67= new Oberteil(29.99, "L", "männlich", 305, "sportlich", "grünes PUMA Sweatshirt");
        Oberteil o68= new Oberteil(29.99, "XL", "männlich", 305, "sportlich", "grünes PUMA Sweatshirt");
        Oberteil o69 = new Oberteil(29.99, "S", "weiblich", 305, "sportlich", "lila NIKE Shirt");
        Oberteil o70= new Oberteil(29.99, "M", "weiblich", 305, "sportlich", "lila NIKE Shirt");
        Oberteil o71 = new Oberteil(29.99, "L", "weiblich", 305, "sportlich", "lila NIKE Shirt");
        Oberteil o72 = new Oberteil(29.99, "XL", "weiblich", 305, "sportlich", "LIla NIKE Shirt");
        Oberteil o73= new Oberteil(29.99, "S", "unisex", 305, "sportlich", "Hellblauer PUMA Pulli");
        Oberteil o74= new Oberteil(29.99, "M", "unisex", 305, "sportlich", "Hellblauer PUMA Pulli");
        Oberteil o75 = new Oberteil(29.99, "L", "unisex", 305, "sportlich", "Hellblauer PUMA Pulli");
        Oberteil o76 = new Oberteil(29.99, "XL", "unisex", 305, "sportlich", "Hellblauer PUMA Pulli");
        
        
        artikelListe.add(o1);
        artikelListe.add(o2);
        artikelListe.add(o3);
        artikelListe.add(o4);
        artikelListe.add(o5);
        artikelListe.add(o6);
        artikelListe.add(o7);
        artikelListe.add(o8);
        artikelListe.add(o9);
        artikelListe.add(o10);
        artikelListe.add(o11);
        artikelListe.add(o12);
        artikelListe.add(o13);
        artikelListe.add(o14);
        artikelListe.add(o15);
        artikelListe.add(o16);
        artikelListe.add(o17);
        artikelListe.add(o18);
        artikelListe.add(o19);
        artikelListe.add(o20);
        artikelListe.add(o21);
        artikelListe.add(o22);
        artikelListe.add(o23);
        artikelListe.add(o24);
        artikelListe.add(o25);
        artikelListe.add(o26);
        artikelListe.add(o27);
        artikelListe.add(o28);
        artikelListe.add(o29);
        artikelListe.add(o30);
        artikelListe.add(o31);
        artikelListe.add(o32);
        artikelListe.add(o33);
        artikelListe.add(o34);
        artikelListe.add(o35);
        artikelListe.add(o36);
        artikelListe.add(o37);
        artikelListe.add(o38);
        artikelListe.add(o39);
        artikelListe.add(o40);
        artikelListe.add(o41);
        artikelListe.add(o42);
        artikelListe.add(o43);
        artikelListe.add(o44);
        artikelListe.add(o45);
        artikelListe.add(o46);
        artikelListe.add(o47);
        artikelListe.add(o48);
        artikelListe.add(o49);
        artikelListe.add(o50);
        artikelListe.add(o51);
        artikelListe.add(o52);
        artikelListe.add(o53);
        artikelListe.add(o54);
        artikelListe.add(o55);
        artikelListe.add(o56);
        artikelListe.add(o57);
        artikelListe.add(o58);
        artikelListe.add(o59);
        artikelListe.add(o60);
        artikelListe.add(o61);
        artikelListe.add(o62);
        artikelListe.add(o63);
        artikelListe.add(o64);
        artikelListe.add(o65);
        artikelListe.add(o66);
        artikelListe.add(o67);
        artikelListe.add(o68);
        artikelListe.add(o69);
        artikelListe.add(o70);
        artikelListe.add(o71);
        artikelListe.add(o72);
        artikelListe.add(o73);
        artikelListe.add(o74);
        artikelListe.add(o75);
        artikelListe.add(o76);

        Unterteil u1 = new Unterteil(80, "S", "männlich", 220, "business", "schwarze Anzugshose");
        Unterteil u2 = new Unterteil(80, "M", "männlich", 220, "business", "schwarze Anzugshose");
        Unterteil u3 = new Unterteil(80, "L", "männlich", 220, "business", "schwarze Anzugshose");
        Unterteil u4 = new Unterteil(80, "XL", "männlich", 220, "business", "schwarze Anzugshose");
        Unterteil u5 = new Unterteil(80, "S", "weiblich", 220, "business", "schwarze Chinohose");
        Unterteil u6 = new Unterteil(80, "M", "weiblich", 220, "business", "schwarze Chinohose");
        Unterteil u7 = new Unterteil(80, "L", "weiblich", 220, "business", "schwarze Chinohose");
        Unterteil u8 = new Unterteil(80, "XL", "weiblich", 220, "business", "schwarze Chinohose");
        Unterteil u9 = new Unterteil(80, "S", "unisex", 220, "business", "Braun karierte Pullon-Hose");
        Unterteil u10 = new Unterteil(80, "M", "unisex", 220, "business", "Braun karierte Pullon-Hose");
        Unterteil u11 = new Unterteil(80, "L", "unisex", 220, "business", "Braun karierte Pullon-Hose");
        Unterteil u12= new Unterteil(80, "XL", "unisex", 220, "business", "Braun karierte Pullon-Hose");
        Unterteil u13 = new Unterteil(80, "S", "männlich", 220, "business", "graue enggeschnittene Anzugshose");
        Unterteil u14 = new Unterteil(80, "M", "männlich", 220, "business", "graue enggeschnittene Anzugshose");
        Unterteil u15 = new Unterteil(80, "L", "männlich", 220, "business", "graue enggeschnittene Anzugshose");
        Unterteil u16 = new Unterteil(80, "XL", "männlich", 220, "business", "graue enggeschnittene Anzugshose");
        Unterteil u17 = new Unterteil(80, "S", "weiblich", 220, "business", "Schlichte Leinen-Zigarettenhose");
        Unterteil u18 = new Unterteil(80, "M", "weiblich", 220, "business", "Schlichte Leinen-Zigarettenhose");
        Unterteil u19 = new Unterteil(80, "L", "weiblich", 220, "business", "Schlichte Leinen-Zigarettenhose");
        Unterteil u20 = new Unterteil(80, "XL", "weiblich", 220, "business", "Schlichte Leinen-Zigarettenhose");
        Unterteil u21 = new Unterteil(80, "S", "unisex", 220, "business", "Chino-Karottenhose in Marineblau");
        Unterteil u22 = new Unterteil(80, "M", "unisex", 220, "business", "Chino-Karottenhose in Marineblau");
        Unterteil u23 = new Unterteil(80, "L", "unisex", 220, "business", "Chino-Karottenhose in Marineblau");
        Unterteil u24= new Unterteil(80, "XL", "unisex", 220, "business", "Chino-Karottenhose in Marineblau");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Unterteil u1 = new Unterteil(24.99, "L", "weiblich", 125, "business", "Beige Chinohose");
        
        
        
        Unterteil u2 = new Unterteil(35, "S", "weiblich", 230, "freizeit", "blaue Skinnyjeans ");
        
        Unterteil u4 = new Unterteil(15.99, "S", "unisex", 420, "freizeit", "hellgraue Hose mit Gummibund");

        artikelListe.add(u1);
        artikelListe.add(u2);
        artikelListe.add(u3);
        artikelListe.add(u4);

        Schuhe s1 = new Schuhe(18.99, "S", "weiblich", 133, "freizeit", "beige Ballerinas aus Wildleder");
        Schuhe s2 = new Schuhe(29.99, "L", "weiblich", 125, "business", "schwarze Lackschuhe mit Schnürsenkel aus Echtleder");
        Schuhe s3 = new Schuhe(12.99, "S", "unisex", 240, "freizeit", "schwarze Flip-Flops");
        Schuhe s4 = new Schuhe(59.99, "S", "unisex", 255, "sportlich", "bordeaux farbende Nikeschuhe");

        artikelListe.add(s1);
        artikelListe.add(s2);
        artikelListe.add(s3);
        artikelListe.add(s4);

        Accessoires a1 = new Accessoires(25, "S", "männlich", 75, "business", "bordeaux farbende Krawatte ");
        Accessoires a2 = new Accessoires(17.99, "S", "weiblich", 57, "business", "goldene Kette mit kleinem Glitzerstein");
        Accessoires a3 = new Accessoires(25, "S", "unisex", 54, "freizeit", "grau Schal");
        Accessoires a4 = new Accessoires(20, "L", "männlich", 38, "freizeit", "Wollmütze");
        Accessoires a5 = new Accessoires(20, "L", "weiblich", 38, "business", "Schlangenleder Tasche");
        artikelListe.add(a1);
        artikelListe.add(a2);
        artikelListe.add(a3);
        artikelListe.add(a4);
        artikelListe.add(a5);
    }

    /**
     * Methode speichert die Daten in der XML Speicherung.
     * @throws IOException 
     */
    private void saveDataToXML() throws IOException {
        XMLEncoder xmlEncoder = new XMLEncoder(new FileOutputStream("outfittery.xml"));
        XMLEncoder xmlEncoderArtikels = new XMLEncoder(new FileOutputStream("artikels.xml"));

        xmlEncoder.writeObject(this);

        xmlEncoderArtikels.writeObject(this.artikelListe);
        xmlEncoderArtikels.flush();
        xmlEncoderArtikels.close();
        xmlEncoder.close();
    }

    /**
     * Methode lädt die Daten der XML Speicherung.
     * 
     * @return
     * @throws IOException 
     */
    public Verwaltung loadDataFromXML() throws IOException {
        //Methode um Daten von XML zu laden
        XMLDecoder verwaltungAusDemXmlDecoder = new XMLDecoder(new FileInputStream("outfittery.xml"));
        Verwaltung obj = (Verwaltung) verwaltungAusDemXmlDecoder.readObject();
        verwaltungAusDemXmlDecoder.close();
// XMLDecoder artikelsAusDemXmlDecoder = new XMLDecoder(new FileInputStream("artikels.xml"));
 //       artikelListeListe2 = (ArrayList<Artikel>) artikelsAusDemXmlDecoder.readObject();
  //      artikelsAusDemXmlDecoder.close();
       

        return obj;
    }

    /**
     * Methode speichert die Daten in der XML Speicherung. 
     */
    private void save() {
        try {
            //speichert die Daten ab
            saveDataToXML();
        } catch (java.io.IOException ioe) {
            ioe.printStackTrace();
        }
    }

    /**
     * Methode verwendet die andere Methode,bei der die Daten der XML Speicherung geladen wird.
     * Sie dient somit nur als Verkürzung,um die Daten zu laden.
     */
    private void load() {
        try {
            //ladet die vorhandenen Daten  
            Verwaltung verwaltung = (Verwaltung) loadDataFromXML();
            // hier starten wir ein neues Programm (eine neue Instanz der Klasse Verwaltung, der wir auch die Kontrolle übergeben), damit wir an die geladenen Daten kommen
            verwaltung.mainMenue();
        } catch (java.io.IOException ioe) {
            ioe.printStackTrace();
        }
    }

    /**
     * Methode beendet die Menues.
     */
    private void beenden() {
        //beendet die Menues
        System.exit(0);
    }

    /**
     * Methode gibt die Kundenliste zurück.
     * @return 
     */
    public ArrayList getKundenListe() {
        return this.kundenListe;
    }

    /**
     * Methode setzt die Kundenliste fest.
     * @param liste 
     */
    public void setKundenListe(ArrayList liste) {
        this.kundenListe = liste;
    }

    /**
     * Methode setzt die Artikelliste fest. 
     * @param liste 
     */
    public void setArtikelListe(ArrayList liste) {
        this.artikelListe = liste;
    }

    /**
     * Methode gibt die Artikelliste zurück.
     * @return 
     */
    public ArrayList getArtikelListe() {
        return this.artikelListe;
    }

    /**
     * Mit dem MainMenue startet das Outfittery Portal und man kann auf die weiteren Untermenues zugreifen.
     */
    private void mainMenue() {
        char eingabe;
        //Startmenue, in dem man den weiteren Pfad wählen kann
        do {
            System.out.println("WELCOME BY OUTFITTERY");
            System.out.println("------------------------------------------------------------");
            System.out.println("[1] Warenbestand");
            System.out.println("[2] Kundenmenue");
            System.out.println("[3] Verwaltung");
            System.out.println("[4] Outfitsuche");
            System.out.println("[x] Programm beenden");

            printAuswahlTreffen();
            eingabe = Stdin.readlnChar();

            switch (eingabe) {
                case 'x':                     //Pfad zur Beendung des Outfittery Portals
                    WilleZurSpeicherung();
                    System.out.println("Vielen Dank für die Nutzung des Outfittery-Portal. Das Programm wird beendet.");
                    beenden();
                case '1':
                    warenBestand();  // bei Wahl Aufruf des Menues Warenbestandes
                    break;
                case '2':
                    kundenMenue();  // bei Wahl Aufruf des Kundenmenues
                    break;
                case '3':
                    verwaltungsMenue();   // bei Wahl Aufruf des Verwaltungsmenues
                    break;
                case '4':
                    outfitSuche();  // bei Wahl Aufruf des Menues um die Outfitsuche zu starten
                    break;
                default:
                    printEingabeFehler(); //wenn keine der möglichen Eingaben getroffen, ausprinten dass die Eingabe nicht korrekt
            }
        } while (true);
    }

    /**
     * Das Untermenue Warenbestand befasst sich mit den Bestandsdaten der Artikel.
     */
    private void warenBestand() {
        //Menue des Warenbestandes
        char eingabe;
        boolean menuewechsel = false;
        do {
            System.out.println("WARENBESTAND");
            System.out.println("------------------------------------------------------------");
            System.out.println("[1] Zeige alle Oberteile an ");
            System.out.println("[2] Zeige alle Unterteile an ");
            System.out.println("[3] Zeige alle Schuhe an ");
            System.out.println("[4] Zeige alle Accessoires an ");
            System.out.println("[5] Einbuchung von neuem Kleidungstück ");
            System.out.println("[6] Entfernen von einem Kleidungsstück ");
            System.out.println("[7] Zeige die Outfitliste an ");
            System.out.println("[0] HAUPTMENUE");

            printAuswahlTreffen();
            eingabe = Stdin.readlnChar();

            switch (eingabe) {
                case '0':
                    menuewechsel = true;
                    break;
                case '1':
                    showOberteileListe();  // bei Wahl Aufruf der Oberteilliste
                    break;
                case '2':
                    showUnterteileListe(); // bei Wahl Aufruf der Unterteilliste
                    break;
                case '3':
                    showSchuheListe(); // bei Wahl Aufruf der Schuhliste
                    break;
                case '4':
                    showAccessoiresListe(); // bei Wahl Aufruf der Accessoiresliste
                    break;
                case '5':
                    erstelleNeuenArtikel(); // bei Wahl Erstellen eines neuen Artikels
                    break;
                case '6':
                    ArtikelEntfernen();  //bei Wahl Aufruf der Outfitliste
                    break; 
                case '7':
                    printOutfitliste();  //bei Wahl Aufruf der Outfitliste
                    break;
                default:
                    printEingabeFehler(); //1wenn keine der möglichen Eingaben getroffen, ausprinten dass die Eingabe nicht korrekt
            }

        } while (!menuewechsel);
    }

    /**
     *Die Methode erstellt und speichert neue Artikel ab.
     */
    private void erstelleNeuenArtikel() {

        String artikelart = Stdin.readlnString("Artikelart: oberteil, unterteil, schuhe oder accessoires eingeben:");

        //Kontrolle der Eingabe
        if (artikelart.equals("oberteil") || artikelart.equals("unterteil") || artikelart.equals("schuhe") || artikelart.equals("accessoires")) {

            String price = Stdin.readlnString("Bitte geben Sie den Preis des Kleidungstücks ein:");
            String größe = Stdin.readlnString("Bitte geben Sie die Größe des Kleidungsstücks ein:");
            String geschlecht = Stdin.readlnString("Bitte geben Sie das Geschlecht für das Kleidungsstücks ein:");
            String lagerbestandd = Stdin.readlnString("Bitte geben Sie den Lagerbestand des Kleidungsstücks ein:");
            String stil = Stdin.readlnString("Bitte geben Sie den Stil des Kleidungsstücks ein:");
            String beschreibung = Stdin.readlnString("Bitte geben Sie die Beschreibung des Kleidungstücks ein:");
            String bestätigung = Stdin.readlnString("Wollen sie ihre Eingaben Verwerfen? (J/N):");
            if (bestätigung.equals("N") || bestätigung.equals("Nein") || bestätigung.equals("n") || bestätigung.equals("nein")) {//hiermit können fehlerhafte eingaben abgebrochen werden

                //in dieser if bedingung könnten auch alle anderen eingaben reglementiert werden
                if (price.matches("[0-9.]+") && lagerbestandd.matches("[0-9]+")) {//damit das Programm nicht abstürtzt wenn der String nicht doubel oder int compatibel ist

                    double preis = Double.parseDouble(price);// macht aus einem Sting price einen Double preis für Konstruktor
                    int lagerbestand = Integer.parseInt(lagerbestandd);//String lagerbestandd digitiert zuuuu Integer Lagerbestandunpassende werte für int oder double umwandlung enthält

                    //Speichert Kleidungsstück als entsprechendes ab (Oberteil;Unterteil;Schuhe;Assoires)
                    if (artikelart.equals("oberteil")) {

                        Oberteil o5 = new Oberteil(preis, größe, geschlecht, lagerbestand, stil, beschreibung);  //für den Fall, dass Oberteil
                        artikelListe.add(o5); //hinzufügen zur Artikelliste
                        System.out.println("Oberteile wurden zur Artikelliste Hinzugefügt");
                        WilleZurSpeicherung();

                    }
                    if (artikelart.equals("unterteil")) {
                        Unterteil u5 = new Unterteil(preis, größe, geschlecht, lagerbestand, stil, beschreibung); //für den Fall, dass Unterteil
                        artikelListe.add(u5);    //hinzufügen zur Artikelliste
                        System.out.println("Unterteile wurden zur Artikelliste Hinzugefügt");
                        WilleZurSpeicherung();
                    }
                    if (artikelart.equals("schuhe")) {
                        Schuhe s7 = new Schuhe(preis, größe, geschlecht, lagerbestand, stil, beschreibung);  //für den Fall, dass Schuhe
                        artikelListe.add(s7);  //hinzufügen zur Artikelliste
                        System.out.println("Schuhe wurden zur Artikelliste Hinzugefügt");
                        WilleZurSpeicherung();
                    }
                    if (artikelart.equals("accessoires")) {
                        Accessoires a5 = new Accessoires(preis, größe, geschlecht, lagerbestand, stil, beschreibung);  //für den Fall, dass Accessoires
                        artikelListe.add(a5);  //hinzufügen zur Artikelliste
                        System.out.println("Accessoires wurden zur Artikelliste Hinzugefügt");
                        WilleZurSpeicherung();
                    }
                } else {

                    System.out.println("Die Eingaben des Preises oder des Lagerbestandes sind ungültig");
                    System.out.println("Kommas müssen als . Geschreiben werden und es sind nur Zahlen gültig");
                }
            }
        } else {
            System.out.println("Ungültige Eingabe der Artikelart");// wenn die Artikelart eingabe ungültig ist
        }
    }

    /**
     * Methode,die den Teil der Speicherung übernimmt zb. bei der Erstellung eines neuen Artikels.
     */
    private void WilleZurSpeicherung() {
        String speicher = Stdin.readlnString("Wollen sie ihre Eingaben Für immer und ewig in der Xml Speicher? (J/N):");
        if (speicher.equals("J") || speicher.equals("Ja") || speicher.equals("j")) {//hiermit können fehlerhafte eingaben abgebrochen werden

            save();
            System.out.println("Ihre Änderungen am Warenbestand wurden gespeichert");
        } else {
            System.out.println("dann halt nit");
        }
    }

    /**
     * Methode, die die Outfitliste darstellt.
     */
    private void printOutfitliste() {
        //Methode um Outfitliste anzuzeigen
        Iterator<Outfit> iter = outfitListe.iterator();
        while (iter.hasNext()) {
            Outfit i = iter.next();

            String s = castInt2String(i.getArtikelnummer());
            printZentriert(s);

            String b = castInt2String(i.getOutfitid());
            printZentriert(s);

        }

    }

    /**
     *  Das Untermenue Verwaltung befasst sich mit der XML-Speicherung und der Kasse.
     */
    private void verwaltungsMenue() {

        //Verwaltungsmenue um Daten zu laden und speichern in XML
        char eingabe;
        boolean menuewechsel = false;
        do {
            System.out.println("VERWALTUNGSMENUE");
            System.out.println("------------------------------------------------------------");
            System.out.println("[1] Lade Daten aus XML-Datei");
            System.out.println("[2] Speichere Daten in XML-Datei");
            System.out.println("[3] Zeige die Kasse an");
            System.out.println("[0] HAUPTMENUE");

            printAuswahlTreffen();
            eingabe = Stdin.readlnChar();

            switch (eingabe) {
                case '0':
                    menuewechsel = true;  //Pfad zurück zum Hauptmenue
                    break;
                case '1':
                    load();   //Pfad um die XML Daten zu laden
                    break;
                case '2':
                    save();  //Pfad um Daten in die XML Datei zu speichern
                    break;
                case '3':
                    showKasse();  //Pfad um Daten in die XML Datei zu speichern
                    break;
                default:
                    printEingabeFehler(); //wenn keine der möglichen Eingaben getroffen, ausprinten dass die Eingabe nicht korrekt
            }
        } while (!menuewechsel);
    }

    
    /**
     * Methode, die den Kassenbestand anzeigt
     */
    public void showKasse()
    {
    
    }
    
    
    /**
     * Das Untermenue Kundenmenue befasst sich mit der Verwaltung der Kundenprofile.
     */
    private void kundenMenue() {
        //Kundenmenue zur Verwaltung der neuen und angelegten Kunden
        char eingabe;
        boolean menuewechsel = false;
        do {
            System.out.println("KUNDENMENUE");
            System.out.println("------------------------------------------------------------");
            System.out.println("[1] Zeige alle Kunden an");
            System.out.println("[2] Suche Kunden nach Nachname");
            System.out.println("[3] Erstelle neuen Kunden");
            System.out.println("[4] Entfernen eines Kunden");
            System.out.println("[0] HAUPTMENUE");

            printAuswahlTreffen();
            eingabe = Stdin.readlnChar();

            switch (eingabe) {
                case '0':
                    menuewechsel = true;  //Pfad zurück zum Hauptmenue
                    break;
                case '1':
                    showKundenListe();  //ruft die Kundenliste auf
                    break;
                case '2':
                    sucheKundeNachNachname();  //sucht, ob ein Kunde mit bestimmten Nachnamen vorhanden
                    break;
                case '3':
                    erstelleNeuenKunden();  //Möglichkeit neuen Kunden zu erstellen
                    break;
                case '4':
                    KundenEntfernen();  //Möglichkeit neuen Kunden zu erstellen
                    break;
                default:
                    printEingabeFehler(); //wenn keine der möglichen Eingaben getroffen, ausprinten dass die Eingabe nicht korrekt
            }
        } while (!menuewechsel);
    }

    /**
     * Das Untermenue Outfitsuche kann die Methode findeOutfit und somit die Outfitsuche starten.
     */
    private void outfitSuche() {
        char eingabe;
        boolean menuewechsel = false;
        do {
            System.out.println("OUTFITSUCHE");
            System.out.println("------------------------------------------------------------");

            System.out.println("[1]  Outfitsuche starten");
            System.out.println("[0] HAUPTMENUE");
            printAuswahlTreffen();
            eingabe = Stdin.readlnChar();

            switch (eingabe) {
                case '0':
                    menuewechsel = true;
                    break;
                case '1':
                    findeOutfits();  //speichere die Angaben und suche Outfit
                    break;
                
                default:
                    printEingabeFehler(); //wenn keine der möglichen Eingaben getroffen, ausprinten dass die Eingabe nicht korrekt
            }
        } while (!menuewechsel);

    }

    /**
     * Methode zum Finden von passenden Outfits für den Kunden.
     */
    private void findeOutfits() {
        String preiskategorie = Stdin.readString("Bitte Preiskategorie eingeben, nachder gesucht werden soll:");
        String geschlecht = Stdin.readString("Bitte Geschlecht eingeben, nachdem gesucht werden soll:");
        String größe = Stdin.readString("Bitte Größe eingeben, nachder gesucht werden soll:");
        String stil = Stdin.readString("Bitte Stil eingeben, nachdem gesucht werden soll:");

        ArrayList<Oberteil> gefundeneOberteile = new ArrayList<Oberteil>();
        ArrayList<Unterteil> gefundeneUnterteile = new ArrayList<Unterteil>();
        ArrayList<Schuhe> gefundeneSchuhe = new ArrayList<Schuhe>();
        ArrayList<Accessoires> gefundeneAccessoires = new ArrayList<Accessoires>();

        for (Artikel artikel : artikelListe) {
            if ((artikel instanceof Oberteil) && artikel.getPreiskategorie().equalsIgnoreCase(preiskategorie) && artikel.getGeschlecht().equalsIgnoreCase(geschlecht) && artikel.getGröße().equalsIgnoreCase(größe) && artikel.getStil().equalsIgnoreCase(stil)) {
                gefundeneOberteile.add((Oberteil) artikel);
            }
        }

        for (Artikel artikel : artikelListe) {
            if ((artikel instanceof Unterteil) && artikel.getPreiskategorie().equalsIgnoreCase(preiskategorie) && artikel.getGeschlecht().equalsIgnoreCase(geschlecht) && artikel.getGröße().equalsIgnoreCase(größe) && artikel.getStil().equalsIgnoreCase(stil)) {
                gefundeneUnterteile.add((Unterteil) artikel);
            }
        }

        for (Artikel artikel : artikelListe) {
            if ((artikel instanceof Schuhe) && artikel.getPreiskategorie().equalsIgnoreCase(preiskategorie) && artikel.getGeschlecht().equalsIgnoreCase(geschlecht) && artikel.getGröße().equalsIgnoreCase(größe) && artikel.getStil().equalsIgnoreCase(stil)) {
                gefundeneSchuhe.add((Schuhe) artikel);
            }
        }

        for (Artikel artikel : artikelListe) {
            if ((artikel instanceof Accessoires) && artikel.getPreiskategorie().equalsIgnoreCase(preiskategorie) && artikel.getGeschlecht().equalsIgnoreCase(geschlecht) && artikel.getGröße().equalsIgnoreCase(größe) && artikel.getStil().equalsIgnoreCase(stil)) {
                gefundeneAccessoires.add((Accessoires) artikel);
            }
        }

        ArrayList<Outfit> outfits = new ArrayList<Outfit>();

        if (gefundeneOberteile.size() > 0 && gefundeneUnterteile.size() > 0 && gefundeneSchuhe.size() > 0 && gefundeneAccessoires.size() > 0) {
            //Es gibt von allen mindestens eines
            Outfit outfit = new Outfit(gefundeneOberteile.get(0), gefundeneUnterteile.get(0), gefundeneSchuhe.get(0), gefundeneAccessoires.get(0));
            outfits.add(outfit);

            if (gefundeneOberteile.size() > 1 && gefundeneUnterteile.size() > 1 && gefundeneSchuhe.size() > 1 && gefundeneAccessoires.size() > 1) {
                //Es gibt von allen mindestens eines
                Outfit outfit2 = new Outfit(gefundeneOberteile.get(1), gefundeneUnterteile.get(1), gefundeneSchuhe.get(1), gefundeneAccessoires.get(1));
                outfits.add(outfit2);
            }
//            if (gefundeneOberteile.size() > 1) {
//                Outfit outfit1 = new Outfit(gefundeneOberteile.get(1), gefundeneUnterteile.get(0), gefundeneSchuhe.get(0), gefundeneAccessoires.get(0));
//                outfits.add(outfit1);
//            }
//
//            if (gefundeneUnterteile.size() > 1) {
//                Outfit outfit1 = new Outfit(gefundeneOberteile.get(1), gefundeneUnterteile.get(0), gefundeneSchuhe.get(0), gefundeneAccessoires.get(0));
//                outfits.add(outfit1);

        } else {
            //mindestens eines hat keine Elemente
            //kein Outfit möglich
            System.out.println("Es gibt kein Outfit mit ihren Angaben");
        }
        for (Outfit outfit : outfits) {

            String s = castInt2String(outfit.oberteil.getArtikelnummer());
            printZentriert(s);

            printLinksbuendig(outfit.oberteil.getGröße());

            printLinksbuendig(outfit.oberteil.getGeschlecht());

            printLinksbuendig(outfit.oberteil.getStil());

            printLinksbuendig(outfit.oberteil.getPreiskategorie());

            s = castDouble2String(outfit.oberteil.getPreis());
            printLinksbuendig(s);

            s = castInt2String(outfit.oberteil.getLagerbestand());
            printLinksbuendig(s);

            printLinksbuendig(outfit.oberteil.getBeschreibung());
            printLF();

            s = castInt2String(outfit.unterteil.getArtikelnummer());
            printZentriert(s);

            printLinksbuendig(outfit.unterteil.getGröße());

            printLinksbuendig(outfit.unterteil.getGeschlecht());

            printLinksbuendig(outfit.unterteil.getStil());

            printLinksbuendig(outfit.unterteil.getPreiskategorie());

            s = castDouble2String(outfit.unterteil.getPreis());
            printLinksbuendig(s);

            s = castInt2String(outfit.unterteil.getLagerbestand());
            printLinksbuendig(s);

            printLinksbuendig(outfit.unterteil.getBeschreibung());
            printLF();
            s = castInt2String(outfit.schuhe.getArtikelnummer());
            printZentriert(s);

            printLinksbuendig(outfit.schuhe.getGröße());

            printLinksbuendig(outfit.schuhe.getGeschlecht());

            printLinksbuendig(outfit.schuhe.getStil());

            printLinksbuendig(outfit.schuhe.getPreiskategorie());

            s = castDouble2String(outfit.schuhe.getPreis());
            printLinksbuendig(s);

            s = castInt2String(outfit.schuhe.getLagerbestand());
            printLinksbuendig(s);

            printLinksbuendig(outfit.schuhe.getBeschreibung());
            printLF();
            s = castInt2String(outfit.accessoires.getArtikelnummer());
            printZentriert(s);

            printLinksbuendig(outfit.accessoires.getGröße());

            printLinksbuendig(outfit.accessoires.getGeschlecht());

            printLinksbuendig(outfit.accessoires.getStil());

            printLinksbuendig(outfit.accessoires.getPreiskategorie());

            s = castDouble2String(outfit.accessoires.getPreis());
            printLinksbuendig(s);

            s = castInt2String(outfit.accessoires.getLagerbestand());
            printLinksbuendig(s);

            printLinksbuendig(outfit.accessoires.getBeschreibung());
            printLF();

        }
     OutfitWählen();
    }

    
    
    /**
     * weiterer Menuepfad nach der Outfitsuche, um zu entscheiden, ob ein Outfit gefällt und in den Warenkorb gelegt werden soll.
     */
   public void OutfitWählen()
   {  char eingabe;
        boolean menuewechsel = false;
        do {
            System.out.println("Möchten Sie eines dieser Outfits bestellen?");
            System.out.println("------------------------------------------------------------");

            System.out.println("[1]  Ja, in Warenkorb Outfit 1 hinzufügen");
            System.out.println("[2]  Ja, in Warenkorb Outfit 2 hinzufügen");
            System.out.println("[3]  Ja, in Warenkorb beide hinzufügen");
            System.out.println("[4]  Nein ");
            System.out.println("[0] HAUPTMENUE");
            printAuswahlTreffen();
            eingabe = Stdin.readlnChar();

            switch (eingabe) {
                case '0':
                    menuewechsel = true;
                    break;
                case '1':
                    Outfit1InWarenkorb();  //speichere das 1. Outfit in den Warenkorb
                    break;
                case '2':
                    Outfit2InWarenkorb(); //speichere das 2. Outfit in den Warenkorb
                    break;
                case '3':
                  Outfit1InWarenkorb(); Outfit2InWarenkorb();  //speichere beide Outfits in den Warenkorb ab
                    break;
                         
                case '4':
                    beenden();   //beende das Outfittery Portal
                    break;
                       
                default:
                    printEingabeFehler(); //wenn keine der möglichen Eingaben getroffen, ausprinten dass die Eingabe nicht korrekt
            }
        } while (!menuewechsel);

   
      }
   
   /**
    * Methode fügt Outfit 1 in Warenkorb hinzu
    */
   public void Outfit1InWarenkorb()
   {
   
   }
   
   
   /**
    * Methode fügt Outfit 2 in Warenkorb hinzu
    */
   public void Outfit2InWarenkorb()
   {
   
   
   }
   
   /**
     * Methode entfernt einen bestimmten Artikel
     */
   public void ArtikelEntfernen()
   {
   
   
   }
   
    /**
     * Methode entfernt bestimmten Kunden
     */
   public void KundenEntfernen()
   {
   
       
   }
   
    /**
     *  2. Methode um Outfit zu finden (unrelevant)
     */
    private void findeOutfits2() {
        String preiskategorie = Stdin.readString("Bitte Preiskategorie eingeben, nachder gesucht werden soll:");
        String geschlecht = Stdin.readString("Bitte Geschlecht eingeben, nachdem gesucht werden soll:");
        String größe = Stdin.readString("Bitte Größe eingeben, nachder gesucht werden soll:");
        String stil = Stdin.readString("Bitte Stil eingeben, nachdem gesucht werden soll:");
        for (int durchlauf = 0; durchlauf < 2; durchlauf++) {
            // nach passendem Oberteil suchen
            boolean trefferoberteile = false;
            boolean weiter = true;
            int ArtikelnrOberteilFind = 0;
            // Ein Iterator-Objekt wird mittels der Methode iterator() erzeugt.
            // Dessen Methode hasNext()liefert true, solange der Iterator noch nicht das Ende erreicht hat.
            // Mit next() greift man auf dasjeweils nächste Element zu.

            Iterator<Artikel> iterOberteil = artikelListe.iterator();
            while (weiter) {
                Artikel artikel = iterOberteil.next();
                // Abfrage, ob alle Bedingungen fuer das Oberteil erfüllt sind
                if ((artikel instanceof Oberteil) && artikel.getPreiskategorie().equalsIgnoreCase(preiskategorie) && artikel.getGeschlecht().equalsIgnoreCase(geschlecht) && artikel.getGröße().equalsIgnoreCase(größe) && artikel.getStil().equalsIgnoreCase(stil)) {
                    // Alle Bedingungen sind erfuellt, Suche nach Oberteil kann beendet werden
                    trefferoberteile = true;
                    // Oberteil speichern
                    ArtikelnrOberteilFind = artikel.getArtikelnummer();

                }
                if (// Wird noch ein nächstes Oberteil gefunden UND es wurde noch kein passendes Oberteil gefunden? 
                        (iterOberteil.hasNext()) && (trefferoberteile == false)) {
                    // kein passendes Oberteil gefunden und noch weitere Oberteile vorhanden: nichts machen
                } else {
                    // Suche beenden
                    weiter = false;
                }
            }

            // nach passendem Unterteil suchen
            boolean trefferunterteile = false;
            weiter = true;
            int ArtikelnrUnterteilFind = 0;

            Iterator<Artikel> iterUnterteil = artikelListe.iterator();
            while (weiter) {
                Artikel i = iterUnterteil.next();
                // Abfrage, ob alle Bedingungen fuer das Oberteil erfüllt sind
                if ((i instanceof Unterteil) && i.getPreiskategorie().equalsIgnoreCase(preiskategorie) && i.getGeschlecht().equalsIgnoreCase(geschlecht) && i.getGröße().equalsIgnoreCase(größe) && i.getStil().equalsIgnoreCase(stil)) {
                    // Alle Bedingungen sind erfuellt, Suche nach Unterteil kann beendet werden
                    trefferunterteile = true;
                    // Unterteil speichern
                    ArtikelnrUnterteilFind = i.getArtikelnummer();
                }
                if (iterUnterteil.hasNext() && trefferunterteile == false) {
                    // kein passendes Unterteil gefunden und noch weitere Unterteile vorhanden: nichts machen
                } else {
                    weiter = false;
                }
            }
            // nach passenden Schuhen suchen
            boolean trefferschuhe = false;
            weiter = true;
            int ArtikelnrSchuhFind = 0;

            Iterator<Artikel> iterSchuhe = artikelListe.iterator();
            while (weiter) {
                Artikel i = iterSchuhe.next();
                // Abfrage, ob alle Bedingungen fuer das Oberteil erfüllt sind
                if ((i instanceof Schuhe) && i.getPreiskategorie().equalsIgnoreCase(preiskategorie) && i.getGeschlecht().equalsIgnoreCase(geschlecht) && i.getGröße().equalsIgnoreCase(größe) && i.getStil().equalsIgnoreCase(stil)) {
                    // Alle Bedingungen sind erfuellt, Suche nach Unterteil kann beendet werden
                    trefferschuhe = true;
                    // Schuhe speichern
                    ArtikelnrSchuhFind = i.getArtikelnummer();
                }
                if (iterSchuhe.hasNext() && trefferschuhe == false) {
                    // keine passenden Schuhe gefunden und noch weitere Schuhe vorhanden: nichts machen
                } else {
                    weiter = false;
                }
            }

            boolean trefferaccessoires = false;
            weiter = true;
            int ArtikelnrAccessoiresFind = 0;

            Iterator<Artikel> iterAccessoires = artikelListe.iterator();
            while (weiter) {
                Artikel i = iterAccessoires.next();
                // Abfrage, ob alle Bedingungen fuer das Oberteil erfüllt sind
                if ((i instanceof Accessoires) && i.getPreiskategorie().equalsIgnoreCase(preiskategorie) && i.getGeschlecht().equalsIgnoreCase(geschlecht) && i.getGröße().equalsIgnoreCase(größe) && i.getStil().equalsIgnoreCase(stil)) {
                    // Alle Bedingungen sind erfuellt, Suche nach Unterteil kann beendet werden
                    trefferaccessoires = true;
                    // Schuhe speichern
                    ArtikelnrAccessoiresFind = i.getArtikelnummer();
                }
                if (iterAccessoires.hasNext() && trefferaccessoires == false) {
                    // keine passenden Schuhe gefunden und noch weitere Schuhe vorhanden: nichts machen
                } else {
                    weiter = false;
                }
            }

            if (!trefferoberteile || !trefferunterteile || !trefferschuhe || !trefferaccessoires) {

                System.out.println("Es gibt leider kein Outfit mit Deinen Wünschen. \n" + preiskategorie + "\n" + geschlecht + "\n" + größe + "\n" + stil);
            } else {

                System.out.print(" :-P");

                Outfit x1 = new Outfit(ArtikelnrOberteilFind, ArtikelnrUnterteilFind, ArtikelnrSchuhFind, ArtikelnrAccessoiresFind); //legt ein neues Outfit mit den Artiklnummern der teile an
                outfitListe.add(x1);

            }
        }
    }

    /**
     * Methode erstellt neuen Kunden.
     */
    private void erstelleNeuenKunden() {
        //Methode um neuen KUnden zu erstellen
        String nachname = Stdin.readlnString("Bitte geben Sie den Nachnamen des Kunden ein:");
        String vorname = Stdin.readlnString("Bitte geben Sie den Vornamen des Kunden ein:");
        //Eingabe des Nachnamen, Vornamens und Telefonnummer
        String telefonnummer;
        do {
            telefonnummer = Stdin.readlnString("Bitte geben Sie eine Telefonnummer des Kunden ein (nur Zahlenwerte ohne Leerzeichen sind erlaubt!):");
        } while (!telefonnummer.matches("[0-9]+"));

        Kunde k1 = new Kunde(vorname, nachname, telefonnummer);
        kundenListe.add(k1); //Speicherung des Kunden in der Kundenliste
    }

    /**
     * Methode zeigt die Kundenliste auf.
     */
    private void showKundenListe() {
        String s;
        // ruft die Kundenliste auf
        printZentriert("Kundennummer");
        printZentriert("Vorname");
        printZentriert("Name");
        printZentriert("Telefon");
        printLF();
        printLinieLF(4); // Trennlinie für 6 Felder anzeigen

        Iterator<Kunde> iter = kundenListe.iterator();
        while (iter.hasNext()) {
            Kunde i = iter.next();

            s = castInt2String(i.getKundennummer());  //ruft die gewünschten Attribute zu jedem Kunden auf
            printZentriert(s);

            printLinksbuendig(i.getVorname());

            printLinksbuendig(i.getName());

            printLinksbuendig(i.getTelefonnummer());

            printLF();
        }
        printLF();
    }

    /**
     * Methode zeigt alle Oberteile in einer Liste.
     */
    private void showOberteileListe() {
        String s;
        //ruft die Oberteilliste auf
        printZentriert("Artikelnummer");
        printZentriert("Stil");
        printZentriert("Größe");
        printZentriert("Geschlecht");
        printZentriert("Preiskategorie");
        printZentriert("Preis");
        printZentriert("Lagerbestand");
        printZentriert("Beschreibung");
        printLF();
        printLinieLF(10); // Trennlinie waagerecht für 7 felder

        Iterator<Artikel> iter = artikelListe.iterator();
        while (iter.hasNext()) {
            Artikel i = iter.next();
            //ruft anschließend alle Attribute des jeweiligen Oberteils auf
            if (i instanceof Oberteil) {
                s = castInt2String(i.getArtikelnummer());
                printZentriert(s);

                printLinksbuendig(i.getGröße());

                printLinksbuendig(i.getGeschlecht());

                printLinksbuendig(i.getStil());

                printLinksbuendig(i.getPreiskategorie());

                s = castDouble2String(i.getPreis());
                printLinksbuendig(s);

                s = castInt2String(i.getLagerbestand());
                printLinksbuendig(s);

                printLinksbuendig(i.getBeschreibung());
                printLF();
            }
        }
        printLF();
    }

    /**
     * Methode zeigt alle Unterteile in einer Liste.
     */
    private void showUnterteileListe() {
        String s;
        //ruft die Unterteilliste auf
        printZentriert("Artikelnummer");
        printZentriert("Stil");
        printZentriert("Größe");
        printZentriert("Geschlecht");
        printZentriert("Preiskatgorie");
        printZentriert("Preis");
        printZentriert("Lagerbestand");
        printLF();
        printLinieLF(10); // Trennlinie für 6 Felder anzeigen
        //ruft anschließend alle Attribute des jeweiligen Unterteils auf
        Iterator<Artikel> iter = artikelListe.iterator();
        while (iter.hasNext()) {
            Artikel i = iter.next();

            if (i instanceof Unterteil) {
                s = castInt2String(i.getArtikelnummer());
                printZentriert(s);

                printLinksbuendig(i.getGröße());

                printLinksbuendig(i.getGeschlecht());

                printLinksbuendig(i.getStil());

                printLinksbuendig(i.getPreiskategorie());

                s = castDouble2String(i.getPreis());
                printLinksbuendig(s);

                s = castInt2String(i.getLagerbestand());
                printLinksbuendig(s);

                printLinksbuendig(i.getBeschreibung());

                printLF();
            }
        }
        printLF();
    }

    /**
     * Methode zeigt alle Schuhe in einer Liste auf.
     */
    private void showSchuheListe() {
        String s;
        //ruft die Schuhliste auf
        printZentriert("Artikelnummer");
        printZentriert("Stil");
        printZentriert("Größe");
        printZentriert("Geschlecht");
        printZentriert("Preiskategorie");
        printZentriert("Preis");
        printZentriert("Lagerbestand");
        printLF();
        printLinieLF(10); // Trennlinie für 6 Felder anzeigen
        // ruft anschließend alle Attribute der jeweiligen Schuhe auf
        Iterator<Artikel> iter = artikelListe.iterator();
        while (iter.hasNext()) {
            Artikel i = iter.next();

            if (i instanceof Schuhe) {
                s = castInt2String(i.getArtikelnummer());
                printZentriert(s);

                printLinksbuendig(i.getGröße());

                printLinksbuendig(i.getGeschlecht());

                printLinksbuendig(i.getStil());

                printLinksbuendig(i.getPreiskategorie());

                s = castDouble2String(i.getPreis());
                printLinksbuendig(s);

                s = castInt2String(i.getLagerbestand());
                printLinksbuendig(s);

                printLinksbuendig(i.getBeschreibung());

                printLF();
            }
        }
        printLF();
    }

    /**
     * Methode zeigt alle Accessoires in einer Liste.
     */
    private void showAccessoiresListe() {
        String s;
        //ruft die Accessoiresliste auf
        printZentriert("Artikelnummer");
        printZentriert("Stil");
        printZentriert("Größe");
        printZentriert("Geschlecht");
        printZentriert("Preiskategorie");
        printZentriert("Preis");
        printZentriert("Lagerbestand");
        printLF();
        printLinieLF(10); // Trennlinie für 6 Felder anzeigen
        //ruft anschließend alle Attribute des jeweiligen Accessoires auf
        Iterator<Artikel> iter = artikelListe.iterator();
        while (iter.hasNext()) {
            Artikel i = iter.next();

            if (i instanceof Accessoires) {
                s = castInt2String(i.getArtikelnummer());
                printZentriert(s);

                printLinksbuendig(i.getGröße());

                printLinksbuendig(i.getGeschlecht());

                printLinksbuendig(i.getStil());

                printLinksbuendig(i.getPreiskategorie());

                s = castDouble2String(i.getPreis());
                printLinksbuendig(s);

                s = castInt2String(i.getLagerbestand());
                printLinksbuendig(s);

                printLinksbuendig(i.getBeschreibung());

                printLF();
            }
        }
        printLF();
    }

    /**
     * Methode prüft, ob ein Kunde mit bestimmten Nachnamen vorhanden ist.
     */
    private void sucheKundeNachNachname() {
        String nachname = Stdin.readString("Bitte Nachnamen eingeben, nachdem gesucht werden soll:");

        // wir machen einen Testlauf, ob es überhaupt einen Kunden mit diesem Nachnamen gibt
        boolean treffer = false;
        Iterator<Kunde> iter = kundenListe.iterator();
        while (iter.hasNext()) {
            Kunde i = iter.next();
            if (i.getName().equalsIgnoreCase(nachname)) {
                treffer = true;
            }
        }

        if (!treffer) {
            //für den Fall dass kein Kunde mit dem Nachnamen gibt
            System.out.println("Es gibt keinen Kunden mit dem Nachnamen " + nachname);
        } else {
            //für den Fall dass es einen passenden Kunden gibt
            printZentriert("Kundennummer");
            printZentriert("Vorname");
            printZentriert("Name");
            printZentriert("Telefon");
            printLF();
            printLinieLF(4); // Trennlinie für 6 Felder anzeigen

            Iterator<Kunde> iter2 = kundenListe.iterator();
            while (iter2.hasNext()) {
                Kunde i = iter2.next();

                // nur die Kunden ausgeben, die dem Suchkriterium entsprechen
                if (i.getName().equalsIgnoreCase(nachname)) {
                    String s = castInt2String(i.getKundennummer());
                    printZentriert(s);

                    printLinksbuendig(i.getVorname());

                    printLinksbuendig(i.getName());

                    printLinksbuendig(i.getTelefonnummer());

                    printLF();
                }
            }
            printLF();
        }
    }

    /**
     * Methode ändert Datentyp von int in string.
     * @param meinInt
     * @return 
     */
    private String castInt2String(int meinInt) {
        return Integer.toString(meinInt);
        // die obige Zeile ist von der Funktion identisch zu
        // Integer i = new Integer(meinInt);
        // return i.toString();
    }

    /**
     * Methode ändert Datentyp von double in string.
     * @param meinDouble
     * @return 
     */
    private String castDouble2String(double meinDouble) {
        // hier nutzen wir die Format-Anweisung der Klasse String um die Nachkommastellen zu bestimmen etc.
        return String.format("%,8.2f", meinDouble);
    }

    /**
     * Methode macht einen Zeilenumbruch.
     */
    private void printLF() {
        //Methode für Zeilenumbruch
        System.out.println();
    }

    /**
     * Methode printet zentral das Gewünschte aus.
     * @param s 
     */
    private void printZentriert(String s) {
        System.out.print(baueZentriertenString(s, FELDLAENGE));
    }

    /**
     * Methode printet linksbündig das Gewünschte aus.
     * @param s 
     */
    private void printLinksbuendig(String s) {
        System.out.print(baueLinksbuendigenString(s, FELDLAENGE));
    }

    /**
     * Methode printet rechtsbündig das Gewünschte aus.
     * @param s 
     */
    private void printRechtsbuendig(String s) {
        System.out.print(baueRechtsbuendigenString(s, FELDLAENGE));
    }

    /**
     * Methode printet eine Linie aus je nach Anzahl der Felder.
     * @param anzahlFelder 
     */
    private void printLinieLF(int anzahlFelder) {
        /* Besonderheit: hier Nutzung des StringBuilders statt direkt mit String zu arbeiten.
         * Ist sparsamer im Umgang mit Speicher.
         */
        StringBuilder s = new StringBuilder();
        int laenge = anzahlFelder * (FELDLAENGE + 3);
        for (int i = 1; i <= laenge; i++) {
            s = s.append("-");
        }
        System.out.println(s);
    }

    /**
     * WAS MACHT DIESE METHODE????
     * @param s
     * @param laenge
     * @return 
     */
    private String baueZentriertenString(String s, int laenge) {
        // wir entfernen Leerzeichen am Anfang und Ende des Strings
        s.trim();
        // falls der String zu lang ist, kuerzen wir ihn
        if (s.length() > laenge) {
            s.substring(0, laenge);
        } else {
            int differenzLinks = (laenge - s.length()) / 2;
            for (int i = 1; i <= differenzLinks; i++) {
                s = " " + s + " ";
            }
            if (s.length() < laenge) {
                s = s + " ";
            }
        }

        return s + " | ";
    }

    /**
     * WAS MACHT DIESE METHODE????
     * @param s
     * @param laenge
     * @return 
     */
    private String baueRechtsbuendigenString(String s, int laenge) {
        // wir entfernen Leerzeichen am Anfang und Ende des Strings
        s.trim();                  //s.trim = gelöscht
        // falls der String zu lang ist, kuerzen wir ihn
        if (s.length() > laenge) {
            s.substring(0, laenge);
        } else {
            int differenzLinks = (laenge - s.length());
            for (int i = 1; i <= differenzLinks; i++) {
                s = " " + s;
            }
        }

        return s + " | ";
    }

    /**
     * WAS MACHT DIESE METHODE????
     * @param s
     * @param laenge
     * @return 
     */
    private String baueLinksbuendigenString(String s, int laenge) {
        // wir entfernen Leerzeichen am Anfang und Ende des Strings
        s = s.trim();
        // falls der String zu lang ist, kuerzen wir ihn
        if (s.length() > laenge) {
            s.substring(0, laenge);
        } else {
            int differenz = (laenge - s.length());
            for (int i = 1; i <= differenz; i++) {
                s = s + " ";
            }
        }

        return s + " | ";
    }

    /**
     * Methode printet aus, dass ein Eingabefehler vorliegt.
     */
    private void printEingabeFehler() {
        //Methode wenn die Eingabe des Benutzers nicht passt
        System.out.print("Ihre Eingabe wurde nicht erkannt.\n");
    }

    /**
     * Methode printet aus, dass man nun eine Auswahl treffen kann.
     */
    private void printAuswahlTreffen() {
        //Methode für die Menueauswahl
        System.out.print("Bitte treffen Sie eine Auswahl ...\n");
    }

    /**
     * Printet unsere Pogramminfo aus bei Start des Outfittery Portals.
     */
    private void printProgrammInfo() {
        System.out.println("**************************************************************");
        System.out.println("* Outfittery-Portal v1.0 written by Christian Paulssen,Marius*");
        System.out.println("*                                   Vermeulen,Loreen Gerard, *");
        System.out.println("*                                   Nikolas Human & Celeste  *");
        System.out.println("*                                   Bettscheider             *");
        System.out.println("**************************************************************");
    }

    /**
     * Methode gibt Reihenfolge an bei Start des Outfittery Portals.
     * @param args
     */
    public static void main(String[] args) {
        Verwaltung v = new Verwaltung();

        v.initData();
        v.printProgrammInfo();
        v.mainMenue();
    }

}
