package superpack ;

public class Main
{
    public static void main(String[] args)
    {
        SuperHero Spiderman = new Spiderman("Spiderman", new String[]{"webs",
                "strength", "speed"}) ;
        SuperHero Venom = new Venom("Venom", new String[]{"webs",
                "strength", "symbiotes"}) ;

        SuperHero[] sups = {Spiderman, Venom} ;

        for (SuperHero s : sups)
        {
            System.out.println(s.getClass().getSimpleName() + " superpowers are "
            + s.printSuperPowers() ) ;
        }
    }
}