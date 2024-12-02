import java.util.*;
class Player 
{
    int jersyno;
    String name;
    int run;
    int matches;

    // Constructor 
    Player(int jersyno, String name, int run, int matches) 
	{
        this.jersyno = jersyno;
        this.name = name;
        this.run = run;
        this.matches = matches;
    }

    // player information
    void displayPlayer() 
	{
        System.out.println("Jersey No" + jersyno + "Name" + name + "Runs" + run + "Matches" + matches);
    }
}

public class InfoPlayer 
{
    public static void main(String x[]) 
	{
        Player p1 = new Player();
        Scanner sc = new Scanner(System.in);

        
        for (int i = 0; i < 5; i++) {
            System.out.print("Jersey No");
            int jersyno = sc.nextInt();
			
            System.out.print("Name");
            String name = sc.next();
			
            System.out.print("Runs");
            int run = sc.nextInt();
			
            System.out.print("Matches");
            int matches = sc.nextInt();

            players.add(new player(jersyno,name,run,matches));
        }

        //player information
        System.out.println("\nPlayer Information:");
        for (int i=0;i<players.length;i++) 
		{
            System.out.printf("%d",players[i]);
        }

        // Deleting a record
        System.out.print(" enter the ");
        int index=sc.nextInt();
        if (index>=0 && index < players.size()) 
		{
            players.remove(index);
        } 
		else {
            System.out.println("Invalid index!");
        }

        // Sorting players 
        Array.Sort(Players);

        // Display player information 
        System.out.println("\nPlayer info delete");
        for (player p : players) 
		{
            player.displayPlayer();
        }
    }
}
