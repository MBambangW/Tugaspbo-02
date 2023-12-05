import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage extends World
{
    public Stage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1);
        this.setBackground(new GreenfootImage("sky.png"));
        prepare();
    }
    private void prepare()
    {
       Player player = new Player();
        addObject(player, 116, 503);
        Platform platform = new Platform();
        addObject(platform, 290, 439);
        Platform platform1 = new Platform();
        addObject(platform1, 596, 353);
        Platform platform2 = new Platform();
        addObject(platform2, 896, 243);
    }
}
