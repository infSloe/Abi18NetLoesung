
/**
 *
 */
public class Main
{
    public static void main()
    {
        Mitglied a = new Mitglied("Alexej","A",1);
        Mitglied b = new Mitglied("Bert","B",2);
        Mitglied d = new Mitglied("Dagmar","D",3);
        Mitglied h = new Mitglied("Holger","H",4);
        Mitglied j = new Mitglied("Jörg","J",5);
        Mitglied k = new Mitglied("Karla","K",6);
        Mitglied p = new Mitglied("Paula" , "P", 7);
        
        Graph g = new Graph(7);
        g.knotenEinfuegen(a);
        g.knotenEinfuegen(b);
        g.knotenEinfuegen(d);
        g.knotenEinfuegen(h);
        g.knotenEinfuegen(j);
        g.knotenEinfuegen(k);
        g.knotenEinfuegen(p);
        
        g.knotenlisteAusgeben();
        
        g.kanteEinfuegen(k, a);
        g.kanteEinfuegen(a, k);
        g.kanteEinfuegen(k,b);
        g.kanteEinfuegen(b,k);
        g.kanteEinfuegen(k,p);
        g.kanteEinfuegen(p, k);
        
        g.kanteEinfuegen(p, d);
        g.kanteEinfuegen(d, p);
        g.kanteEinfuegen(p, j);
        g.kanteEinfuegen(j, p);
        g.kanteEinfuegen(j,b);
        g.kanteEinfuegen(b,j);
        g.kanteEinfuegen(j, h);
        g.kanteEinfuegen(h,j);
        g.kanteEinfuegen(p, a);
        
        
        g.adjazenzMatrixAusgeben();
        
        // Aufgabe c)
        System.out.println("Die Methode m");
        System.out.println("Alexej: " + g.methode1(a));
        System.out.println("Bert: " + g.methode1(b));
        System.out.println("Dagmar: " + g.methode1(d));
        System.out.println("Holger: " + g.methode1(h));
        System.out.println("Jörg: " + g.methode1(j));
        System.out.println("Karla: " + g.methode1(k));
        System.out.println("Paula: " + g.methode1(p));
        System.out.println();
        
        // Aufgabe e)
        System.out.println("Freunde von Freunden");
        g.freundeVonFreunden(a);
        
    
    }
}
