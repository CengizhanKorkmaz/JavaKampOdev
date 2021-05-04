package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SaleService {
	
	void gameSell(Gamer gamer , Game game);
	void gameSellCampaign(Gamer gamer,Game game,Campaign campaign);
}
