package Concrete;

import java.util.ArrayList;

import Abstract.GameService;
import Entities.Game;


public class GameManager implements GameService {

	ArrayList<Game> games=new ArrayList<Game>();
	
	public GameManager()
	{
		
	}
	
	@Override
	public void add(Game game) {
		
		games.add(game);
		System.out.println("Oyun sisteme eklenmiþtir.");
		
	}

	@Override
	public void update(Game game) {
		
		int index = games.indexOf(game);
        
        games.set(index, game);
         
        System.out.println("Oyun güncellendi.");
	
	}

	@Override
	public void delete(Game game) {
		games.remove(game);
		
	}

	

}
