/**
 * Knoten.
 */

public class Knoten
{
    //Attribute
    private Mitglied inhalt;

    //Konstruktor
    public Knoten(Mitglied inhalt_)
    {
        inhalt = inhalt_;        
    }

    //Methoden
    public Mitglied getInhalt()
    {
        return inhalt;
    }

}
