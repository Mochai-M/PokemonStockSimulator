import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Effect for the Blue stock
 * 
 * @Liyu Xiao
 * @Nov 28 2023
 * 
 * Image link: https://forums.synfig.org/t/still-not-sorted-out-falling-rain/1927
 * 
 * 
 * sound link: https://mixkit.co/free-sound-effects/rain/
 */
public class BlueEffect extends Weather
{
    //initialize, the water sound
    GreenfootSound waterSound = new GreenfootSound("water.wav");
    
    public BlueEffect(){
        //sets the size and length for the effect
        super(450,100, "rain.gif");
        
        waterSound.setVolume(50);
    }
    
    
    //Inherits the act method from weather class
    public void act()
    {
        super.act("Water", "Fire");
        
        waterSound.play();
    }
    

}
