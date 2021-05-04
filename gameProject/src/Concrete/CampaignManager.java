package Concrete;

import java.util.ArrayList;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {
	
	ArrayList<Campaign> campaigns=new ArrayList<Campaign>();
	@Override
	public void add(Campaign campaign) {
		
		campaigns.add(campaign);
		System.out.println("Kampanya sisteme eklenmi�tir.");
	}

	@Override
	public void update(Campaign campaign) {
		int index=campaigns.indexOf(campaign);
		campaigns.set(index, campaign);
		System.out.println("Kampanya bilgileri g�ncellendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		campaigns.remove(campaign);
		System.out.println("Kampanya silinmi�tir.");
		
	}

}
