
/**
 * Klasse Mitglied
 */
public class Mitglied
{
   private int mitgliedsnummer;
   private String vorname;
   private String nachname;
    
   
    public Mitglied(String vorname_, String nachname_, int nummer)
    {
       vorname = vorname_;
       nachname = nachname_;
       mitgliedsnummer = nummer;
    }

    public void ausgeben()
    {
        System.out.println(vorname + " " + nachname);
    }
}
