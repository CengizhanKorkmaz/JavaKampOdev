package gameProject;

import java.util.Date;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Gamer gamer=new Gamer();
		gamer.setId(1);
		gamer.setFirstName("Cengizhan");
		gamer.setLastName("Korkmaz");
		gamer.setNationalId("18347708244");
		gamer.setDateOfBirth(new Date(1998,07,24));
		gamer.setEmail("cengizhann55@gmail.com");
		
		GamerManager gamerManager=new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer);
		
		Game game=new Game();
		game.setId(1);
		game.setName("Nba2K 2021");
		game.setPrice(500);
		
		GameManager gameManager=new GameManager();
		gameManager.add(game);
		
		Campaign campaign=new Campaign();
		campaign.setId(1);
		campaign.setName("%20 Özel Kupon");
		campaign.setDiscount(20);
		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign);
		
		SaleManager saleManager=new SaleManager();
		saleManager.gameSell(gamer, game);
		saleManager.gameSellCampaign(gamer, game, campaign);
	}

}
