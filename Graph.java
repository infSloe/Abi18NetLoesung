
/**
 * Graph.
 */

public class Graph
{
    //Attribute
    private Knoten[] knotenliste;
    private int maxAnzahl;
    private int anzahl;

    private boolean[][] adjazenzmatrix;

    //Konstruktor
    public Graph(int maxAnzahl_)
    {
        maxAnzahl = maxAnzahl_;
        anzahl = 0;
        knotenliste = new Knoten[maxAnzahl];
        adjazenzmatrix = new boolean[maxAnzahl][maxAnzahl];
    }

    //Methoden
    /**
     * Erzeugt einen neuen Knoten mit dem übergebenen Inhalt 
     * und fügt ihn in die Knotenliste ein
     */
    public void  knotenEinfuegen(Mitglied mitglied)
    {

        if (anzahl < maxAnzahl)
        {   
            knotenliste[anzahl] = new Knoten(mitglied);
            anzahl++;
        }        
    }

    /**
     * Sucht nach einem Knoten mit dem Inhalt mitglied in der Knotenliste
     * und gibt dessen Index zurück
     */
    public int knotennummerGeben(Mitglied mitglied)
    {
        for (int i = 0; i < anzahl; i++)
        {
            if (mitglied == knotenliste[i].getInhalt())
            {
                return i;
            }
        }
        return -1;
    }

    /**
     * Gibt die Knotenliste auf der Konsole aus
     */
    public void knotenlisteAusgeben()
    {

        System.out.println("---- Knotenliste ----");
        for (int i = 0; i < anzahl; i++)
        {
            Mitglied m = knotenliste[i].getInhalt();
            System.out.print("Knoten " + i + ": ");
            m.ausgeben();
        }
        System.out.println();
    }

    /**
     * Gibt die Adjazenzmatrix auf der Konsole aus.
     */
    public void adjazenzMatrixAusgeben()
    { 
        String a = "  ";

        for (int i = 0; i < anzahl; i++)
        { 
            a = a + i + " ";
        }
        a = a +"\n";
        for (int i = 0; i < anzahl;i++)
        {
            a = a + i + " ";
            for (int j = 0; j < anzahl; j++) 
            {

                if (adjazenzmatrix[i][j])
                {
                    a = a + "x ";
                }
                else
                {
                    a = a + "o ";
                }

            }
            a = a + "\n";
        }
        System.out.println(a);
    }

    /**
     * Fügt eine Kante zwischen den Knoten mit den Inhalten bez1 und bez2 ein.
     */

    public void kanteEinfuegen(Mitglied bez1, Mitglied bez2)
    {
        int i = knotennummerGeben(bez1);
        int j = knotennummerGeben(bez2);
        if (j != -1 && i != -1) // Es gibt beide Knoten!
        {
            adjazenzmatrix[i][j] = true;
        }
        else
        {
            System.out.println("Fehler! Einen Knoten gibt es nicht!");
        }
    }

    /**
     * methode1
     */   
    public int methode1(Mitglied m)
    {

        int rueck = 0;
        int i = knotennummerGeben(m);
        for (int j = 0; j < anzahl; j++)
        {
            if ((adjazenzmatrix[i][j] == true)&&(adjazenzmatrix[j][i]==true))
            {
                rueck++;
            }
        }
        return rueck;       

    }

    public void freundeVonFreunden(Mitglied m)
    {
        int nr = knotennummerGeben(m);
        for (int i = 0; i < anzahl; i++)
        {
            if ((adjazenzmatrix[i][nr])&&(adjazenzmatrix[nr][i]))
            {
                // i ist Freund von nr
                for (int j = 0; j < anzahl; j++)
                {
                    if  ((adjazenzmatrix[i][j])&&(adjazenzmatrix[j][i]))
                    {
                        //j ist Freund von i
                        if (!((adjazenzmatrix[j][nr])&&(adjazenzmatrix[nr][j])))
                        {
                            // j ist kein Freund von nr
                            if (j != nr)
                            {
                                // j ist nicht nr
                                Mitglied mi = knotenliste[j].getInhalt();  
                                mi.ausgeben();
                            }
                        }
                    }
                }
            }
        }
    }

        
    

}
