package commmm;
import java.util.ArrayList;
import java.util.List;

public class ForEach {
	public static void main(String[] args)
	{
		List<String> gamesList = new ArrayList<String>();
		gamesList.add("Football");
		gamesList.add("Cricket");
		gamesList.add("Chess");
		gamesList.add("Hockey");
		gamesList.add("Badminton");
		gamesList.add("HolleyBall");
		for(int i=0;i<gamesList.size();i++)
		{
			System.out.println(gamesList);
		}
		System.out.println("--Iterating--");
		gamesList.forEach(games -> System.out.println(games));
		//TestForEach tfe = gamesList -> System.out.println(game);
	}

}
