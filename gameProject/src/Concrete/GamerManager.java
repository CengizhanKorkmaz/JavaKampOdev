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
			System.out.println("Oyuncu sisteme kay�t edilmi�tir");
		}
		else {
			System.out .println("Oyuncu kimlik do�rulama ba�ar�s�z.");
		}
		
		
	}

	@Override
	public void update(Gamer gamer) {
		
		int index=gamers.indexOf(gamer);
		gamers.set(index, gamer);
		System.out.println("Oyuncu bilgileri g�ncellendi.");
	}

	@Override
	public void delete(Gamer gamer) {
		
		gamers.remove(gamer);
		System.out.println("Oyuncu sistemden silindi.");
		
	}

}
