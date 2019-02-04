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

    private ArrayList<Outfit> outfitListe;
    private ArrayList<Kunde> testListe;//für Test2 

    private ArrayList<Kunde> kundenListe;
    private ArrayList<Oberteile> oberteileListe;
    private ArrayList<Unterteile> unterteileListe;
    private ArrayList<Schuhe> schuheListe;
    private ArrayList<Accessoires> accessoiresListe;
    private ArrayList<Artikel> artikelListe;
    final static int FELDLAENGE = 14;

    /**
     * Constructor for objects of class Verwaltung
     */
    public Verwaltung() {
        testListe = new ArrayList<>();//für Test2
        outfitListe = new ArrayList<>();//Hier können die Kleidungstücke Gespeichert werden von Outfitsuche

        kundenListe = new ArrayList<>();
        oberteileListe = new ArrayList<>();
        unterteileListe = new ArrayList<>();
        schuheListe = new ArrayList<>();
        accessoiresListe = new ArrayList<>();
        artikelListe = new ArrayList<>();
    }

    public void initData() {

        Kunde k1 = new Kunde("Tim", "Müller", "015609354267");
        Kunde k2 = new Kunde("Michelle", "Watson", "01712233593");
        Kunde k3 = new Kunde("Lena", "Caron", "01774622273");
        Kunde k4 = new Kunde("Eric", "Lentes", "01608874036");
        kundenListe.add(k1);
        kundenListe.add(k2);
        kundenListe.add(k3);
        kundenListe.add(k4);

        Oberteile o1 = new Oberteile(24.99, "S", "mittel", "unisex", 255, "sportlich", "Blauer Kapuzenpullover mit Aufschrift"); // Kombi, S bzw M freizeit für männlich und weiblich möglich
        Oberteile o2 = new Oberteile(15.99, "M", "billig", "männlich", 155, "freizeit", "Blauer Pullover mit V-Ausschnitt");  // Kombi business L weiblich möglich zum Testen
        Oberteile o3 = new Oberteile(20.99, "S", "billig", "unisex", 145, "freizeit", "Roter Kapuzenpullover");
        Oberteile o4 = new Oberteile(29.99, "L", "mittel", "weiblich", 305, "business", "Weiße Bluse mit 3/4 Ärmel und Knopfleiste");

        oberteileListe.add(o1);
        oberteileListe.add(o2);
        oberteileListe.add(o3);
        oberteileListe.add(o4);

        Unterteile u1 = new Unterteile(24.99, "L", "mittel", "weiblich", 125, "business", "Beige Chinohose");
        Unterteile u2 = new Unterteile(35, "S", "mittel", "weiblich", 230, "freizeit", "blaue Skinnyjeans ");
        Unterteile u3 = new Unterteile(80, "M", "teuer", "männlich", 220, "business", "schwarze Anzugshose");
        Unterteile u4 = new Unterteile(15.99, "M", "niedrig", "unisex", 420, "freizeit", "hellgraue Hose mit Gummibund");

        unterteileListe.add(u1);
        unterteileListe.add(u2);
        unterteileListe.add(u3);
        unterteileListe.add(u4);

        Schuhe s1 = new Schuhe(18.99, "S", "niedrig", "weiblich", 133, "freizeit", "beige Ballerinas aus Wildleder");
        Schuhe s2 = new Schuhe(79.99, "L", "teuer", "weiblich", 125, "business", "schwarze Lackschuhe mit Schnürsenkel aus Echtleder");
        Schuhe s3 = new Schuhe(12.99, "M", "niedrig", "unisex", 240, "freizeit", "schwarze Flip-Flops");
        Schuhe s4 = new Schuhe(59.99, "S", "teuer", "unisex", 255, "sportlich", "bordeaux farbende Nikeschuhe");

        schuheListe.add(s1);
        schuheListe.add(s2);
        schuheListe.add(s3);
        schuheListe.add(s4);

        Accessoires a1 = new Accessoires(25, "S", "mittel", "männlich", 75, "business", "bordeaux farbende Krawatte ");
        Accessoires a2 = new Accessoires(17.99, "S", "niedrig", "weiblich", 57, "business", "goldene Kette mit kleinem Glitzerstein");
        Accessoires a3 = new Accessoires(15, "M", "niedrig", "weiblich", 54, "freizeit", "grau Schal");
        Accessoires a4 = new Accessoires(20, "L", "niedrig", "männlich", 38, "freizeit", "Wollmütze");

        accessoiresListe.add(a1);
        accessoiresListe.add(a2);
        accessoiresListe.add(a3);
        accessoiresListe.add(a4);
    }

    private void saveDataToXML() throws IOException {
        XMLEncoder o = new XMLEncoder(new FileOutputStream("outfittery.xml"));
        o.writeObject("outfittery");
        o.writeObject(this);
        o.close();
    }

    public Object loadDataFromXML() throws IOException {
        XMLDecoder o = new XMLDecoder(new FileInputStream("outfittery.xml"));
        o.readObject();
        Object obj = o.readObject();
        o.close();
        return obj;
    }

    private void save() {
        try {
            saveDataToXML();
        } catch (java.io.IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private void load() {
        try {
            Verwaltung v = (Verwaltung) loadDataFromXML();
            // hier starten wir ein neues Programm (eine neue Instanz der Klasse Verwaltung, der wir auch die Kontrolle übergeben), damit wir an die geladenen Daten kommen
            v.mainMenue();
        } catch (java.io.IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private void beenden() {
        System.exit(0);
    }

    public ArrayList getKundenListe() {
        return this.kundenListe;
    }

    public void setKundenListe(ArrayList liste) {
        this.kundenListe = liste;
    }

    private void mainMenue() {
        char eingabe;

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
                case 'x':
                    System.out.println("Vielen Dank für die Nutzung des Outfittery-Portal. Das Programm wird beendet.");
                    beenden();
                case '1':
                    warenBestand();
                    break;
                case '2':
                    kundenMenue();
                    break;
                case '3':
                    verwaltungsMenue();
                    break;
                case '4':
                    outfitSuche1();
                    break;
                default:
                    printEingabeFehler();
            }
        } while (true);
    }

    private void warenBestand() {
        char eingabe;
        boolean menuewechsel = false;
        do {
            System.out.println("WARENBESTAND");
            System.out.println("------------------------------------------------------------");
            System.out.println("[1] Zeige alle Oberteile an ");
            System.out.println("[2] Zeige alle Unterteile an ");
            System.out.println("[3] Zeige alle Schuhe an ");
            System.out.println("[4] Zeige alle Accessoires an ");
            System.out.println("[0] HAUPTMENUE");

            printAuswahlTreffen();
            eingabe = Stdin.readlnChar();

            switch (eingabe) {
                case '0':
                    menuewechsel = true;
                    break;
                case '1':
                    showOberteileListe();
                    break;
                case '2':
                    showUnterteileListe();
                    break;
                case '3':
                    showSchuheListe();
                    break;
                case '4':
                    showAccessoiresListe();
                    break;
                default:
                    printEingabeFehler();
            }
        } while (!menuewechsel);
    }

    private void verwaltungsMenue() {
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
                    menuewechsel = true;
                    break;
                case '1':
                    load();
                    break;
                case '2':
                    save();
                    break;
                default:
                    printEingabeFehler();
            }
        } while (!menuewechsel);
    }

    private void kundenMenue() {
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
                    menuewechsel = true;
                    break;
                case '1':
                    showKundenListe();
                    break;
                case '2':
                    sucheKundeNachNachname();
                    break;
                case '3':
                    erstelleNeuenKunden();
                    break;
                default:
                    printEingabeFehler();
            }
        } while (!menuewechsel);
    }

    private void outfitSuche1() {
        char eingabe;
        boolean menuewechsel = false;
        do {
            System.out.println("OUTFITSUCHE");
            System.out.println("------------------------------------------------------------");
            System.out.println("Für welchen Anlass suchen sie Bekleidung? ");
            System.out.println("[1] Freizeit ");
            System.out.println("[2] Sport");
            System.out.println("[3] Business Test2");
            System.out.println("[0] HAUPTMENUE");

            printAuswahlTreffen();
            eingabe = Stdin.readlnChar();

            switch (eingabe) {
                case '0':
                    menuewechsel = true;
                    break;
                case '1':
                    outfitSuche2();  //speichere die Angaben und switch zur nächsten Frage
                    break;
                case '2':
                    outfitSuche2();  //ebenso "
                    break;
                case '3':
                    Test2();
                    break;
                default:
                    printEingabeFehler();
            }
        } while (!menuewechsel);

    }

    private void outfitSuche2() {
        char eingabe;
        boolean menuewechsel = false;
        do {
            System.out.println("OUTFITSUCHE");
            System.out.println("------------------------------------------------------------");
            System.out.println("Suchen Sie für... ");
            System.out.println("[1] Frauen ");
            System.out.println("[2] Männer");
            System.out.println("[3] Unisex");
            System.out.println("[0] HAUPTMENUE");

            printAuswahlTreffen();
            eingabe = Stdin.readlnChar();

            switch (eingabe) {
                case '0':
                    menuewechsel = true;
                    break;
                case '1':
                    outfitSuche3();  //speichere die Angaben und switch zur nächsten Frage
                    break;
                case '2':
                    outfitSuche3();  //ebenso "
                    break;
                case '3':
                    outfitSuche3();
                    break;
                default:
                    printEingabeFehler();
            }
        } while (!menuewechsel);
    }

    private void outfitSuche3() {
        char eingabe;
        boolean menuewechsel = false;
        do {
            System.out.println("OUTFITSUCHE");
            System.out.println("------------------------------------------------------------");
            System.out.println("Welche Größe benötigen Sie? ");
            System.out.println("[1] S ");
            System.out.println("[2] M");
            System.out.println("[3] L");
            System.out.println("[0] HAUPTMENUE");

            printAuswahlTreffen();
            eingabe = Stdin.readlnChar();

            switch (eingabe) {
                case '0':
                    menuewechsel = true;
                    break;
                case '1':
                    outfitSuche4();  //speichere die Angaben und switch zur nächsten Frage
                    break;
                case '2':
                    outfitSuche4();  //ebenso "
                    break;
                case '3':
                    outfitSuche4();
                    break;
                default:
                    printEingabeFehler();
            }
        } while (!menuewechsel);

    }

    private void outfitSuche4() {
        char eingabe;
        boolean menuewechsel = false;
        do {
            System.out.println("OUTFITSUCHE");
            System.out.println("------------------------------------------------------------");
            System.out.println("In welcher Preiskategorie soll ihr Outfit liegen? ");
            System.out.println("[1] billig findeOutfits OUTFITliste nach 2 parametern");
            System.out.println("[2] mittel Test Namensliste nach zwei parametern");
            System.out.println("[3] teuer");
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
                case '2':
                    Test();                //ebenso "
                    break;
                case '3':
                    findeOutfits();
                    break;
                default:
                    printEingabeFehler();
            }
        } while (!menuewechsel);

    }

    private void findeOutfits() {
        String preiskategorie = Stdin.readString("Bitte preiskategorie eingeben, nachdem gesucht werden soll:");
        String geschlecht = Stdin.readString("Bitte geschlecht eingeben, nachdem gesucht werden soll:");
        // die oberteilliste scheint nicht zu funktioniern...
        boolean treffer = false;
        Iterator<Oberteile> iter = oberteileListe.iterator();
        while (iter.hasNext()) {
            Oberteile i = iter.next();
            if (i.getPreiskategorie().equalsIgnoreCase(preiskategorie) && i.getGeschlecht().equalsIgnoreCase(geschlecht)) {
                treffer = true;
            }
        }

        if (!treffer) {

            System.out.println("Es gibt keinen Kunden mit dem Nachnamen " + preiskategorie + geschlecht);
        } else {

            Iterator<Oberteile> iter2 = oberteileListe.iterator();
            while (iter2.hasNext()) {
                Oberteile i = iter2.next();

                if (i.getPreiskategorie().equalsIgnoreCase(preiskategorie) && i.getGeschlecht().equalsIgnoreCase(geschlecht)) {
                    System.out.print("Juhu es klapptnit");
                    Outfit x1 = new Outfit(i.getArtikelnummer());//speichert den Kunden(Kleidungsstück) in die Outfistliste
                    outfitListe.add(x1);

                    String s = castInt2String(i.getArtikelnummer());
                    printZentriert(s);

                    String b = castInt2String(x1.getOutfitid());
                    printZentriert(s);

                }
            }
        }
    }

    public void Test() {
        String preiskategorie = Stdin.readString("Bitte nachname eingeben, nachdem gesucht werden soll:");
        String geschlecht = Stdin.readString("Bitte vorname eingeben, nachdem gesucht werden soll:");
        // zum testen der findeoutfitfunktion 
        boolean treffer = false;
        Iterator<Kunde> iter = kundenListe.iterator();
        while (iter.hasNext()) {
            Kunde i = iter.next();
            if (i.getName().equalsIgnoreCase(preiskategorie) && i.getVorname().equalsIgnoreCase(geschlecht)) {
                treffer = true;
            }
        }

        if (!treffer) {

            System.out.println("Es gibt keinen Kunden mit dem Nachnamen " + preiskategorie + geschlecht);
        } else {

            System.out.println("PUUUUUUUUUUUUPSI");//Hier könnte die speicherung in eine ander arrylist erfolgen...
        }
    }

    public void Test2() {
        String preiskategorie = Stdin.readString("Bitte nachname eingeben, nachdem gesucht werden soll:");
        String geschlecht = Stdin.readString("Bitte vorname eingeben, nachdem gesucht werden soll:");
        // zum testen der findeoutfitfunktion 
        boolean treffer = false;
        Iterator<Kunde> iter = kundenListe.iterator();

        while (iter.hasNext()) {
            Kunde i = iter.next();

            if (i.getName().equalsIgnoreCase(preiskategorie) && i.getVorname().equalsIgnoreCase(geschlecht)) {
                treffer = true;
            }
        }

        if (!treffer) {

            System.out.println("Es gibt keinen Kunden mit dem Nachnamen " + preiskategorie + geschlecht);
        } else {
            Iterator<Kunde> iter2 = kundenListe.iterator();
            while (iter2.hasNext()) {
                Kunde i = iter2.next();

                if (i.getName().equalsIgnoreCase(preiskategorie) && i.getVorname().equalsIgnoreCase(geschlecht)) {
                    System.out.print("Juhu es klapptnit");
                    Outfit x1 = new Outfit(i.getKundennummer());//speichert den Kunden(Kleidungsstück) in die Outfistliste
                    outfitListe.add(x1);

                    String s = castInt2String(i.getKundennummer());
                    printZentriert(s);

                    String b = castInt2String(x1.getOutfitid());
                    printZentriert(s);

                }
            }
        }

    }
//    private void erstelleNeuenKunden()
//    {
//        Kunde k1 = new Kunde("Hans","Becker","0171 9876543");
//        Kunde k2 = new Kunde("Olaf","Lohrer","0171 1234567");
//        kundenListe.add(k1);
//        kundenListe.add(k2);
//    }

    private void erstelleNeuenKunden() {
        String nachname = Stdin.readlnString("Bitte geben Sie den Nachnamen des Kunden ein:");
        String vorname = Stdin.readlnString("Bitte geben Sie den Vornamen des Kunden ein:");

        String telefonnummer;
        do {
            telefonnummer = Stdin.readlnString("Bitte geben Sie eine Telefonnummer des Kunden ein (nur Zahlenwerte ohne Leerzeichen sind erlaubt!):");
        } while (!telefonnummer.matches("[0-9]+"));

        Kunde k1 = new Kunde(vorname, nachname, telefonnummer);
        kundenListe.add(k1);
    }

    private void showKundenListe() {
        String s;

        printZentriert("Kundennummer");
        printZentriert("Vorname");
        printZentriert("Name");
        printZentriert("Telefon");
        printLF();
        printLinieLF(4); // Trennlinie für 6 Felder anzeigen

        Iterator<Kunde> iter = kundenListe.iterator();
        while (iter.hasNext()) {
            Kunde i = iter.next();

            s = castInt2String(i.getKundennummer());
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

        printZentriert("Artikelnummer");
        printZentriert("Stil");
        printZentriert("Preiskategorie");
        printZentriert("Geschlecht");
        printZentriert("Größe");
        printZentriert("Preis");
        printZentriert("Lagerbestand");
        printZentriert("Beschreibung");
        printLF();
        printLinieLF(10); // Trennlinie waagerecht für 7 felder

        Iterator<Oberteile> iter = oberteileListe.iterator();
        while (iter.hasNext()) {
            Oberteile i = iter.next();

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
        printLF();
    }

    private void showUnterteileListe() {
        String s;

        printZentriert("Artikelnummer");
        printZentriert("Stil");
        printZentriert("Preiskategorie");
        printZentriert("Geschlecht");
        printZentriert("Größe");
        printZentriert("Preis");
        printZentriert("Lagerbestand");
        printLF();
        printLinieLF(10); // Trennlinie für 6 Felder anzeigen

        Iterator<Unterteile> iter = unterteileListe.iterator();
        while (iter.hasNext()) {
            Unterteile i = iter.next();

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
        printLF();
    }

    private void showSchuheListe() {
        String s;

        printZentriert("Artikelnummer");
        printZentriert("Stil");
        printZentriert("Preiskategrie");
        printZentriert("Geschlecht");
        printZentriert("Größe");
        printZentriert("Preis");
        printZentriert("Lagerbestand");
        printLF();
        printLinieLF(10); // Trennlinie für 6 Felder anzeigen

        Iterator<Schuhe> iter = schuheListe.iterator();
        while (iter.hasNext()) {
            Schuhe i = iter.next();

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
        printLF();
    }

    private void showAccessoiresListe() {
        String s;

        printZentriert("Artikelnummer");
        printZentriert("Stil");
        printZentriert("Preiskategorie");
        printZentriert("Geschlecht");
        printZentriert("Größe");
        printZentriert("Preis");
        printZentriert("Lagerbestand");
        printLF();
        printLinieLF(10); // Trennlinie für 6 Felder anzeigen

        Iterator<Accessoires> iter = accessoiresListe.iterator();
        while (iter.hasNext()) {
            Accessoires i = iter.next();

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
            System.out.println("Es gibt keinen Kunden mit dem Nachnamen " + nachname);
        } else {
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
        System.out.print("Ihre Eingabe wurde nicht erkannt.\n");
    }

    private void printAuswahlTreffen() {
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
