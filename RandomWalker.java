import java.util.*;

/**
 * This class creates an object that randomly moves either up, down, left, or right by one step.
 * This class keeps a record of how many steps each object takes.
 * @author Marty Manseau
 * @author Bahman Ashtari
 *
 */
public class RandomWalker
{
	//field
	private int x;
	private int y;
	private int steps; //how many movements have been made
   private Random rand; //random generator object

	/**
	 * constructs a new RandomWalker at (0, 0)coordinate
	 */
	public RandomWalker()
	{
		this.x = 0;
		this.y = 0;
    this.steps = 0;
    this.rand = new Random();
	}

	//accessor

	/**
	 *returns the x coordinate of this object
	 */
	public int getX()
	{
		return this.x;
	}

	/**
	 *returns the y coordinate of this object
	 */
	public int getY()
	{
		return this.y;
	}

	/**
	 *
	 *return the number of steps
	 */
	public int getSteps()
	{
		return steps;
	}

	/**
	 * randomly moves the object one step either up, down, left, or right
	 */
	public void move()
	{
		int movement = rand.nextInt(4); //this gives us rand num between 0-3

		if(movement == 0)
			this.x += 1; //moving right
		if(movement == 1)
			this.x -= 1; //moving left

		if(movement == 2)
			this.y += 1; //moving up
		if(movement == 3)
			this.y -= 1; //moving down

		steps++;

	}

	public static void main(String[] args)
	{
		RandomWalker walker1 = new RandomWalker();

		System.out.printf("(%d, %d)\n", walker1.getX(), walker1.getY());

      for(int i = 0; i < 20; i++)
      {
       	walker1.move();
	   		System.out.printf("(%d, %d)\n", walker1.getX(), walker1.getY());
      }

		int steps = walker1.getSteps();
		System.out.println("walker 1 took " + steps + " steps.");
	}
}
