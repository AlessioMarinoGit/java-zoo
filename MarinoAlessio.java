
/**
 * Write a description of class MarinoAlessio here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MarinoAlessio extends Animal
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MarinoAlessio
     */
    public MarinoAlessio()
    {
        super("Alessio Marino", "mostly brown", 2);
    }
    
    public String speak() {
        return "OKAY!";
    }
    
    public String getType() {
        return "Gorilla";
    }
    
    public String getName() {
        return "Donkey Kong";
    }
    
    public String getDisposition() {
        return "OKAY!";
    }
}
