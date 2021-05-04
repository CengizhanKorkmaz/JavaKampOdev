package Concrete;

import java.util.ArrayList;

import Abstract.CheckRealUser;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {

	CheckRealUser checkRealUser;
	public GamerManager(CheckRealUser checkRealUser)
	{
		this.checkRealUser=checkRealUser;
	}
	ArrayList<Gamer> gamers=new ArrayList<Gamer>();

	
	@Override
	public void add(Gamer gamer) {
		if (checkRealUser.CheckIfRealPerson(gamer)) {
			gamers.add(gamer);
			System.out.println("Oyuncu sisteme kayýt edilmiþtir");
		}
		else {
			System.out .println("Oyuncu kimlik doðrulama baþarýsýz.");
		}
		
		
	}

	@Override
	public void update(Gamer gamer) {
		
		int index=gamers.indexOf(gamer);
		gamers.set(index, gamer);
		System.out.println("Oyuncu bilgileri güncellendi.");
	}

	@Override
	public void delete(Gamer gamer) {
		
		gamers.remove(gamer);
		System.out.println("Oyuncu sistemden silindi.");
		
	}

}
