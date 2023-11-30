import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Displays the difference between the two stocks through a game of tug of war.
 * 
 * @ Companies uno: Company of the pokemon on the left
 * @ Companies dos: Company of the pokemon on the right
 * 
 * @author Mekaeel 
 * @version November 29th
 */
public class Tugrope extends Actor
{
    private GreenfootImage rope;
    
    private Companies company1, company2;
    
    public Tugrope(Companies uno, Companies dos) {
        company1 = uno;
        company2 = dos;
        
        rope = new GreenfootImage("Tugknot.png");
        
        setImage(rope);
    }
    /**
     * Act - do whatever the Tugrope wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveTheKnot();
    }
    
    public void moveTheKnot() {
        if(moveToPoint() < getX() && getX() > 500) {
            setLocation(getX() - 1,getY());
        } else if(moveToPoint() > getX() && getX() < 1050) {
            setLocation(getX() + 1, getY());
        }
    }
    
    public int moveToPoint() {
        return (int)((company2.getValue() * 3.5) - (company1.getValue() * 3.5)) + 750;
    }
}