import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * <p> The Black Friday Class is a special weather effect, when called, it will drop all the stock prices by 100 </p>
 * 
 * Liyu 
 * @Nov 27 2023
 * 
 * 
 * Sound Credits: https://www.zedge.net/ringtone/5c2f1209-403a-4326-96e3-179ee944898d
 */
public class BlackFriday extends Actor
{
    
    //initialize, the stockMarket sound
    GreenfootSound stockMarketSound = new GreenfootSound("stockmarket.mp3");
    
    public BlackFriday(){
        stockMarketSound.setVolume(20);
        getImage().scale(1,1);
    }
    
    
    /**
     * <p> The act method for black Friday, On this day, all stocks drop by 100 </p>
     */
    
    public void act()
    {
      //gets the Date from the world
      ArrayList<Date> currentDate = (ArrayList<Date>)getWorld().getObjects(Date.class);
      for(Date date: currentDate){
          //if the date is October 19 Add in the Black Friday Effect
          if(date.getDate().equals("919")){
             stockMarketSound.play();
             
             //Decrease the stock price for all companies
             ArrayList<Companies> companies = (ArrayList<Companies>)getWorld().getObjects(Companies.class);
             for (Companies c : companies){
                  c.decreaseValue(1000);
             }
             
             getWorld().removeObject(this);
          }
      }
    }
}
