import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Effect Class
 * 
 * @Natalie Huang
 * @November 25
 */
public class Icon extends Actor
{
    //one class and it gets called with a different image
    //when one stock from company goes up, character becomes happy & vice versa 
    
    private GreenfootImage[] images = new GreenfootImage[4]; // stores the images
    private int imageNumber;
    
    protected GreenfootImage icon;
    /**
     * Constructor for the Icon Class
     * <p> Includes looping through the photos and scaling each one to make sure they fit 
     * well on the screen
     */
    public Icon(String x) {
        for(int i = 0; i < images.length; i++){
            images[i] = new GreenfootImage(x + i + ".png" );
            images[i].scale(350, 250);
            setImage(images[imageNumber]);   
        }
    }
    
    /**
     * Will loop through the icon images and 
     * images on screen will change 
     */
    public void animation(){
        imageNumber = (imageNumber + 1) % images.length;
        setImage(images[imageNumber]);
    }
    
    /**
     * Act Method
     * 
     * @param Company1      Will find out which company is affected
     */
    public void act(String Company1)
    {
        animation();
        checkCompany(Company1);
    }
    
    /**
     * Will check which company is affected and will base stocks and emotions of the icons based on it
     * 
     * @param Company1      Finding out icons affected by stocks
     */
    public void checkCompany(String Company1){
      //get ALL Companies caught in the "Weather Storm" and 2 of the 4 companies
      ArrayList<Companies> companies = (ArrayList<Companies>)getObjectsInRange (3000, Companies.class);
      for (Companies c : companies){
            int stockPrice = c.getCurrentValue();
            
            
            if(c.toString().equals(Company1)){
                if(stockPrice > 75){
                icon = images[0];  //happy 
                setImage(icon);
            }else if (stockPrice < 30){
                icon = images[1]; //pissed off/angry 
                setImage(icon);
            }else if (stockPrice < 50){
                icon = images[3]; //sad 
                setImage(icon);
            }else {
                icon = images[4]; //normal 
                setImage(icon);
            }
              }

      }
         
        
    }
}
