package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.User;

public class SaleManager implements SaleService {
	
	private Campaign campaign;
	
	public SaleManager(Campaign campaign) {
		this.campaign = campaign;
	}
	@Override
	public void sale(User user) {
		if (campaign !=null) {
			
			System.out.println(user.getFirstName()+" kullanicisina "+campaign.getCampaignName() + " kampanyasi ile oyun satildi.");
		}else {
			System.out.println(user.getFirstName()+" kullanicisina oyun satildi.");
		}
		
		
	}

}
