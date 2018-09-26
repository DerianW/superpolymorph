package superpack ;

public class SuperHero
{
    protected String name ;
    private String[] specialPowers ;

    public SuperHero (String name, String[] specialPowers)
    {
        this.name = name ;
        this.specialPowers = specialPowers ;
    }

    public String printSuperPowers()
    {
        String st00f = "" ;
        for (String s : specialPowers)
        {
            st00f += s + ", ";
        }
        return st00f + "\b\b.";
    }
}