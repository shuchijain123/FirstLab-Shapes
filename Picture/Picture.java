
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Triangle tree;
    private Square stem;
    private Square door;
    private Triangle ray;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();
        
        wall = new Square();
        wall.moveVertical(100);
        wall.changeSize(200);
        wall.makeVisible();
        wall.changeColor("blue");
        
        
        
        

        window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(40);
        window.moveVertical(100);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();
        
        
        ray = new Triangle();
        ray.changeSize(10, 30);
        ray.moveHorizontal(180);
        ray.moveVertical(-20);
        ray.makeVisible();
         ray.changeColor("yellow");

        sun = new Circle();
        sun.changeColor("red");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
        
        tree = new Triangle();
        tree.changeColor("green");
        tree.makeVisible();
        tree.moveVertical(90);
        tree.moveHorizontal(200);
        tree.changeSize(100, 80);
        
        tree = new Triangle();
        tree.changeColor("green");
        tree.makeVisible();
        tree.moveVertical(90);
        tree.moveHorizontal(200);
        tree.changeSize(100, 80);
        
        stem = new Square();
        stem.changeColor("brown");
        stem.moveHorizontal(180);
        stem.moveVertical(150);
        stem.makeVisible();
        
        
        tree = new Triangle();
        tree.changeColor("green");
        tree.makeVisible();
        tree.moveVertical(250);
        tree.moveHorizontal(50);
        tree.changeSize(30, 20);
        
        tree = new Triangle();
        tree.changeColor("green");
        tree.makeVisible();
        tree.moveVertical(250);
        tree.moveHorizontal(100);
        tree.changeSize(30, 20);
        
        tree = new Triangle();
        tree.changeColor("green");
        tree.makeVisible();
        tree.moveVertical(250);
        tree.moveHorizontal(150);
        tree.changeSize(30, 20);
        
        
        
        
        
        
        door = new Square();
        door.changeColor("orange");
        door.moveHorizontal(50);
        door.moveVertical(150);
        door.makeVisible();
        
        
        
       
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("red");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("green");
            window.changeColor("black");
            roof.changeColor("yellow");
            sun.changeColor("red");
        }
    }

}
