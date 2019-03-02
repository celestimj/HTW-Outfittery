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
public class Verwaltung implements Serializable {

    private ArrayList<Outfit> outfitListe; //Liste für gefundene Outfits
  
    private ArrayList<Kunde> kundenListe; //Kundenliste
    private ArrayList<Artikel> artikelListe;  //liste mit allen Artikeln
    final static int FELDLAENGE = 14;

    /**
     * Constructor for objects of class Verwaltung
     */
    public Verwaltung() {
        
        outfitListe = new ArrayList<>();//Hier können die Kleidungstücke gespeichert werden von Outfitsuche

        kundenListe = new ArrayList<>(); // hier sind die KUnden abgespeichert
        artikelListe = new ArrayList<>(); // hier sind alle vorhandenen Artikel gespeichert
    }

    public void initData() {
        // die vorhandenen Kunden, Ober-, Unterteile, Schuhe und Accessoires wurden hier angelegt
        Kunde k1 = new Kunde("Tim", "Müller", "015609354267");
        Kunde k2 = new Kunde("Michelle", "Watson", "01712233593");
        Kunde k3 = new Kunde("Lena", "Caron", "01774622273");
        Kunde k4 = new Kunde("Eric", "Lentes", "01608874036");
        kundenListe.add(k1);
        kundenListe.add(k2);
        kundenListe.add(k3);
        kundenListe.add(k4);

        Oberteile o1 = new Oberteile(24.99, "S", "unisex", 255, "sportlich", "Blauer Kapuzenpullover mit Aufschrift"); // Kombi, S bzw M freizeit für männlich und weiblich möglich
        Oberteile o2 = new Oberteile(15.99, "M",  "männlich", 155, "freizeit", "Blauer Pullover mit V-Ausschnitt");  // Kombi business L weiblich möglich zum Testen
        Oberteile o3 = new Oberteile(20.99, "S", "unisex", 145, "freizeit", "Roter Kapuzenpullover");
        Oberteile o4 = new Oberteile(29.99, "L",  "weiblich", 305, "business", "Weiße Bluse mit 3/4 Ärmel und Knopfleiste");
        Oberteile o5 = new Oberteile(29.99, "XL",  "männlich", 305, "business", "Weißes Hemd mit Brusttasche und Knopfleiste");
        Oberteile o6 = new Oberteile(29.99, "L",  "männlich", 305, "business", "Weißes Hemd mit Brusttasche und Knopfleiste");
        Oberteile o7 = new Oberteile(29.99, "M",  "männlich", 305, "business", "Weißes Hemd mit Brusttasche und Knopfleiste");
        Oberteile o8 = new Oberteile(29.99, "S",  "männlich", 305, "business", "Weißes Hemd mit Brusttasche und Knopfleiste");
        Oberteile o9 = new Oberteile(45.00, "S", "männlich", 200, "freizeit", "Skijacke");
        Oberteile o10 = new Oberteile(45.00, "M", "männlich", 200, "freizeit", "Skijacke");
        Oberteile o11 = new Oberteile(45.00, "L", "männlich", 200, "freizeit", "Skijacke");
        Oberteile o12 = new Oberteile(45.00, "XL", "männlich", 200, "freizeit", "Skijacke");
        
        
        
        
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

        Unterteile u1 = new Unterteile(24.99, "L", "weiblich", 125, "business", "Beige Chinohose");
        Unterteile u2 = new Unterteile(35, "S", "unisex", 230, "freizeit", "blaue Skinnyjeans ");
        Unterteile u3 = new Unterteile(80, "M", "männlich", 220, "business", "schwarze Anzugshose");
        Unterteile u4 = new Unterteile(15.99, "S", "unisex", 420, "freizeit", "hellgraue Hose mit Gummibund");
        Unterteile u5 = new Unterteile(15.99, "M", "unisex", 420, "freizeit", "hellgraue Hose mit Gummibund");
        Unterteile u6 = new Unterteile(15.99, "L", "unisex", 420, "freizeit", "hellgraue Hose mit Gummibund");
        Unterteile u7 = new Unterteile(15.99, "XL", "unisex", 420, "freizeit", "hellgraue Hose mit Gummibund");

        artikelListe.add(u1);
        artikelListe.add(u2);
        artikelListe.add(u3);
        artikelListe.add(u4);
        artikelListe.add(u5);
        artikelListe.add(u6);
        artikelListe.add(u7);

        Schuhe s1 = new Schuhe(18.99, "S", "weiblich", 133, "freizeit", "beige Ballerinas aus Wildleder");
        Schuhe s2 = new Schuhe(29.99, "L", "weiblich", 125, "business", "schwarze Lackschuhe mit Schnürsenkel aus Echtleder");
        Schuhe s3 = new Schuhe(12.99, "S", "unisex", 240, "freizeit", "schwarze Flip-Flops");
        Schuhe s4 = new Schuhe(59.99, "S", "unisex", 255, "sportlich", "bordeaux farbende Nikeschuhe");
        Schuhe s5 = new Schuhe(59.99, "M", "unisex", 255, "sportlich", "bordeaux farbende Nikeschuhe");
        Schuhe s6 = new Schuhe(59.99, "L", "unisex", 255, "sportlich", "bordeaux farbende Nikeschuhe");

        artikelListe.add(s1);
        artikelListe.add(s2);
        artikelListe.add(s3);
        artikelListe.add(s4);
        artikelListe.add(s5);
        artikelListe.add(s6);
                

        Accessoires a1 = new Accessoires(25, "S", "männlich", 75, "business", "bordeaux farbende Krawatte ");
        Accessoires a2 = new Accessoires(17.99, "S", "weiblich", 57, "business", "goldene Kette mit kleinem Glitzerstein");
        Accessoires a3 = new Accessoires(32.99, "S", "unisex", 54, "freizeit", "grau Schal");
        Accessoires a4 = new Accessoires(20, "L", "männlich", 38, "freizeit", "Wollmütze");
        Accessoires a5 = new Accessoires(20, "L", "weiblich", 38, "business", "Schlangenleder Tasche");
        artikelListe.add(a1);
        artikelListe.add(a2);
        artikelListe.add(a3);
        artikelListe.add(a4);
        artikelListe.add(a5);
    }

    private void saveDataToXML() throws IOException {
        XMLEncoder o = new XMLEncoder(new FileOutputStream("outfittery.xml"));
        o.writeObject("outfittery");
        o.writeObject(this);
        o.close();
    }

    public Object loadDataFromXML() throws IOException {
        //Methode um Daten von XML zu laden
        XMLDecoder o = new XMLDecoder(new FileInputStream("outfittery.xml"));
        o.readObject();
        Object obj = o.readObject();
        o.close();
        return obj;
    }

    private void save() {
        try {
           //speichert die Daten ab
            saveDataToXML();
        } catch (java.io.IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private void load() {
        try {
           //ladet die vorhandenen Daten  
            Verwaltung v = (Verwaltung) loadDataFromXML();
            // hier starten wir ein neues Programm (eine neue Instanz der Klasse Verwaltung, der wir auch die Kontrolle übergeben), damit wir an die geladenen Daten kommen
            v.mainMenue();
        } catch (java.io.IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private void beenden() {
        //beendet die Menues
        System.exit(0);
    }

    public ArrayList getKundenListe() {
        return this.kundenListe;
    }

    public void setKundenListe(ArrayList liste) {
        this.kundenListe = liste;
    }
    
    public void setArtikelListe(ArrayList liste) {
        this.artikelListe = liste;
    }
    public ArrayList getArtikelListe() {
        return this.artikelListe;
    }

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
             System.out.println("[6] Outfitliste ");
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
                    printOutfitliste();  //bei Wahl Aufruf der Outfitliste
                    break;
                default:
                    printEingabeFehler(); //wenn keine der möglichen Eingaben getroffen, ausprinten dass die Eingabe nicht korrekt
            }
            
            
        } while (!menuewechsel);
    }
    
    //Neue Artikel können in das System eingespeichert werden
    private void erstelleNeuenArtikel()                  {
          
    
        
        String artikelart = Stdin.readlnString("Artikelart: oberteil, unterteil, schuhe oder accessoires eingeben:");
        
        //Kontrolle der Eingabe
        if(artikelart.equals("oberteil")||artikelart.equals("unterteil")||artikelart.equals("schuhe")||artikelart.equals("accessoires")){
        
        String price = Stdin.readlnString("Bitte geben Sie den Preis des Kleidungstücks ein:");
        String größe = Stdin.readlnString("Bitte geben Sie die Größe des Kleidungsstücks ein:");
        String geschlecht = Stdin.readlnString("Bitte geben Sie das Geschlecht für das Kleidungsstücks ein:");
        String lagerbestandd = Stdin.readlnString("Bitte geben Sie den Lagerbestand des Kleidungsstücks ein:");
        String stil = Stdin.readlnString("Bitte geben Sie den Stil des Kleidungsstücks ein:");
        String beschreibung = Stdin.readlnString("Bitte geben Sie die Beschreibung des Kleidungstücks ein:");
        String bestätigung = Stdin.readlnString("Wollen sie ihre Eingaben Verwerfen? (J/N):");
        if(bestätigung.equals("N")||bestätigung.equals("Nein")||bestätigung.equals("n")||bestätigung.equals("nein")){//hiermit können fehlerhafte eingaben abgebrochen werden
        
        
      //in dieser if bedingung könnten auch alle anderen eingaben reglementiert werden
       if(price.matches("[0-9.]+")&&lagerbestandd.matches("[0-9]+")){//damit das Programm nicht abstürtzt wenn der String nicht doubel oder int compatibel ist
      
           double preis = Double.parseDouble(price);// macht aus einem Sting price einen Double preis für Konstruktor
           int lagerbestand = Integer.parseInt(lagerbestandd);//String lagerbestandd digitiert zuuuu Integer Lagerbestandunpassende werte für int oder double umwandlung enthält
       
       //Speichert Kleidungsstück als entsprechendes ab (Oberteil;Unterteil;Schuhe;Assoires)
        if(artikelart.equals("oberteil")){
        
        Oberteile o5 = new Oberteile(preis,größe,geschlecht,lagerbestand,stil,beschreibung);  //für den Fall, dass Oberteil
        artikelListe.add(o5); //hinzufügen zur Artikelliste
        System.out.println("Oberteile wurden zur Artikelliste Hinzugefügt");
         WilleZurSpeicherung();
        
        }
        if(artikelart.equals("unterteil")){
            Unterteile u5 = new Unterteile(preis,größe,geschlecht,lagerbestand,stil,beschreibung); //für den Fall, dass Unterteil
        artikelListe.add(u5);    //hinzufügen zur Artikelliste
        System.out.println("Unterteile wurden zur Artikelliste Hinzugefügt");
        WilleZurSpeicherung();
        }
        if(artikelart.equals("schuhe")){
            Schuhe s7 = new Schuhe(preis,größe,geschlecht,lagerbestand,stil,beschreibung);  //für den Fall, dass Schuhe
        artikelListe.add(s7);  //hinzufügen zur Artikelliste
        System.out.println("Schuhe wurden zur Artikelliste Hinzugefügt");
        WilleZurSpeicherung();
        }
        if(artikelart.equals("accessoires")){
            Accessoires a5 = new Accessoires(preis,größe,geschlecht,lagerbestand,stil,beschreibung);  //für den Fall, dass Accessoires
        artikelListe.add(a5);  //hinzufügen zur Artikelliste
        System.out.println("Accessoires wurden zur Artikelliste Hinzugefügt");
        WilleZurSpeicherung();
        }
        }
       else{
            
            System.out.println("Die Eingaben des Preises oder des Lagerbestandes sind ungültig");
            System.out.println("Kommas müssen als . Geschreiben werden und es sind nur Zahlen gültig");
        }
        }      
        }
        else{
        System.out.println("Ungültige Eingabe der Artikelart");// wenn die Artikelart eingabe ungültig ist
        }
        } 
         
    
    private void WilleZurSpeicherung(){
        String speicher = Stdin.readlnString("Wollen sie ihre Eingaben Für immer und ewig in der Xml Speicher? (J/N):");
        if(speicher.equals("J")||speicher.equals("Ja")||speicher.equals("j")){//hiermit können fehlerhafte eingaben abgebrochen werden
        
        save();
        System.out.println("Ihre Änderungen am Warenbestand wurden gespeichert");
        }
        else{
        System.out.println("dann halt nit");  
        }
        }
    
    private void printOutfitliste(){
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

    private void verwaltungsMenue() {
        
       //Verwaltungsmenue um Daten zu laden und speichern in XML
        char eingabe;
        boolean menuewechsel = false;
        do {
            System.out.println("VERWALTUNGSMENUE");
            System.out.println("------------------------------------------------------------");
            System.out.println("[1] Lade Daten aus XML-Datei");
            System.out.println("[2] Speichere Daten in XML-Datei");
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
                default:
                    printEingabeFehler(); //wenn keine der möglichen Eingaben getroffen, ausprinten dass die Eingabe nicht korrekt
            }
        } while (!menuewechsel);
    }

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
                default:
                    printEingabeFehler(); //wenn keine der möglichen Eingaben getroffen, ausprinten dass die Eingabe nicht korrekt
            }
        } while (!menuewechsel);
    }
   

    private void outfitSuche() {
        char eingabe;
        boolean menuewechsel = false;
        do {
            System.out.println("OUTFITSUCHE");
            System.out.println("------------------------------------------------------------");
            System.out.println(" * ");
            System.out.println("[1]  Outfitsuche starten");
            System.out.println("[0] HAUPTMENUE");

            printAuswahlTreffen();
            eingabe = Stdin.readlnChar();

            switch (eingabe) {
                case '0':
                    menuewechsel = true;
                    break;
                case '1':
                     findeOutfits();  //speichere die Angaben und suche OUtfit
                  break;
                  
                default:
                    printEingabeFehler(); //wenn keine der möglichen Eingaben getroffen, ausprinten dass die Eingabe nicht korrekt
            }
        } while (!menuewechsel);

    }

    private void findeOutfits() {
        String preiskategorie = Stdin.readString("Bitte Preiskategorie eingeben, nachder gesucht werden soll:");
        String geschlecht = Stdin.readString("Bitte Geschlecht eingeben, nachdem gesucht werden soll:");
        String größe = Stdin.readString("Bitte Größe eingeben, nachder gesucht werden soll:");
        String stil = Stdin.readString("Bitte Stil eingeben, nachdem gesucht werden soll:");
       for(int durchlauf=0; durchlauf<2 ; durchlauf++){         
        // nach passendem Oberteil suchen
        boolean trefferoberteile = false;
        boolean weiter = true;
        int ArtikelnrOberteilFind = 0;
        // Ein Iterator-Objekt wird mittels der Methode iterator() erzeugt.
        // Dessen Methode hasNext()liefert true, solange der Iterator noch nicht das Ende erreicht hat.
        // Mit next() greift man auf dasjeweils nächste Element zu.
        Iterator<Artikel> iterOberteil = artikelListe.iterator();
        while (weiter) {
            Artikel i = iterOberteil.next();
            // Abfrage, ob alle Bedingungen fuer das Oberteil erfüllt sind
            if ((i instanceof Oberteile) && i.getPreiskategorie().equalsIgnoreCase(preiskategorie) && i.getGeschlecht().equalsIgnoreCase(geschlecht) && i.getGröße().equalsIgnoreCase(größe) && i.getStil().equalsIgnoreCase(stil)) {
                // Alle Bedingungen sind erfuellt, Suche nach Oberteil kann beendet werden
                trefferoberteile = true;
                // Oberteil speichern
                ArtikelnrOberteilFind = i.getArtikelnummer();

            }
               if (// Wird noch ein nächstes Oberteil gefunden UND es wurde noch kein passendes Oberteil gefunden? 
                       (iterOberteil.hasNext()) && (trefferoberteile == false))
                    {
                   // kein passendes Oberteil gefunden und noch weitere Oberteile vorhanden: nichts machen
                    }
               else{
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
            if ((i instanceof Unterteile) && i.getPreiskategorie().equalsIgnoreCase(preiskategorie) && i.getGeschlecht().equalsIgnoreCase(geschlecht) && i.getGröße().equalsIgnoreCase(größe) && i.getStil().equalsIgnoreCase(stil)) {
                // Alle Bedingungen sind erfuellt, Suche nach Unterteil kann beendet werden
                trefferunterteile = true;
                // Unterteil speichern
               ArtikelnrUnterteilFind = i.getArtikelnummer();
            }
              if(iterUnterteil.hasNext() && trefferunterteile == false)
              {
              // kein passendes Unterteil gefunden und noch weitere Unterteile vorhanden: nichts machen
              }
              else{
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
              if(iterSchuhe.hasNext() && trefferschuhe == false)
              {
              // keine passenden Schuhe gefunden und noch weitere Schuhe vorhanden: nichts machen
              }
              else{
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
            if(iterAccessoires.hasNext() && trefferaccessoires == false)
              {
              // keine passenden Schuhe gefunden und noch weitere Schuhe vorhanden: nichts machen
              }
              else{
              weiter = false;
              }
        }
    
       
                    
        if (!trefferoberteile || !trefferunterteile || !trefferschuhe || !trefferaccessoires) {

            System.out.println("Es gibt leider kein Outfit mit Deinen Wünschen. \n" + preiskategorie + "\n" + geschlecht + "\n" + größe + "\n" + stil);
                }
        else {
            
                    System.out.print(" :-P");
                    
                    Outfit x1 = new Outfit(ArtikelnrOberteilFind, ArtikelnrUnterteilFind,ArtikelnrSchuhFind, ArtikelnrAccessoiresFind); //legt ein neues Outfit mit den Artiklnummern der teile an
                    outfitListe.add(x1);
                  OutfitsWählen();
                }
            }
    }
    
  
  private void OutfitsWählen(){
     //Methode um Outfit zu wählen oder nicht
     char eingabe;
        boolean menuewechsel = false;
        do {
            System.out.println("Möchten Sie ein Outfit kaufen?");
            System.out.println("------------------------------------------------------------");
            System.out.println("[1]  Ja");
             System.out.println("[2] Nein");
            System.out.println("[0] HAUPTMENUE");

            printAuswahlTreffen();
            eingabe = Stdin.readlnChar();

            switch (eingabe) {
                case '0':
                    menuewechsel = true;
                    break;
                case '1':
                     OutfitKaufen();  //weiter um ein Outfit zu kaufen
                  break;
                 case '2':
                     beenden();  //Verabschiedung
                  break; 
                default:
                    printEingabeFehler(); //wenn keine der möglichen Eingaben getroffen, ausprinten dass die Eingabe nicht korrekt
            }
        } while (!menuewechsel);

  }
    
  private void OutfitKaufen()
  { //Methode um Outfit kaufen zu können
  
  
  
  }
  
  
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
            if (i instanceof Oberteile)
            { s = castInt2String(i.getArtikelnummer());
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
        
            if (i instanceof Unterteile)
            { s = castInt2String(i.getArtikelnummer());
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

            if (i instanceof Schuhe)
            {
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

            if (i instanceof Accessoires)
            {
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

    private String castInt2String(int meinInt) {
        return Integer.toString(meinInt);
        // die obige Zeile ist von der Funktion identisch zu
        // Integer i = new Integer(meinInt);
        // return i.toString();
    }

    private String castDouble2String(double meinDouble) {
        // hier nutzen wir die Format-Anweisung der Klasse String um die Nachkommastellen zu bestimmen etc.
        return String.format("%,8.2f", meinDouble);
    }
    

    private void printLF() {
        //Methode für Zeilensprung
        System.out.println();
    }

    private void printZentriert(String s) {
        System.out.print(baueZentriertenString(s, FELDLAENGE));
    }

    private void printLinksbuendig(String s) {
        System.out.print(baueLinksbuendigenString(s, FELDLAENGE));
    }

    private void printRechtsbuendig(String s) {
        System.out.print(baueRechtsbuendigenString(s, FELDLAENGE));
    }

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

    private void printEingabeFehler() {
        //Methode wenn die Eingabe des Benutzers nicht passt
        System.out.print("Ihre Eingabe wurde nicht erkannt.\n");
    }

    private void printAuswahlTreffen() {
        //Methode für die Menueauswahl
        System.out.print("Bitte treffen Sie eine Auswahl ...\n");
    }

    private void printProgrammInfo() {
        System.out.println("**************************************************************");
        System.out.println("* Outfittery-Portal v1.0 written by Christian Paulssen,Marius*");
        System.out.println("*                                   Vermeulen,Loreen Gerard, *");
        System.out.println("*                                   Nikolas Human & Celeste  *");
        System.out.println("*                                   Bettscheider             *");
        System.out.println("**************************************************************");
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Verwaltung v = new Verwaltung();

        v.initData();
        v.printProgrammInfo();
        v.mainMenue();
    }

}
