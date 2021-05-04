package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void gameSell(Gamer gamer, Game game) {
		
		System.out.println(gamer.getFirstName()+ " "+game.getName()+" "+game.getPrice()+" oyununu satýn aldý." );
		
	}

	@Override
	public void gameSellCampaign(Gamer gamer, Game game, Campaign campaign) {
		game.setPrice(game.getPrice()-(game.getPrice()*campaign.getDiscount())/100);
		System.out.println(gamer.getFirstName()+ " "+game.getName()+ " "+ campaign.getName()+" kullanarak " +game.getPrice()+" oyununu satýn aldý." );
		
	}

}
