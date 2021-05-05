package javaReactDay4Hw3_GameSaleSystem;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.SaleManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		Campaign yilbasi= new Campaign(
				1,
				"Yilbasi Ozel",
				"Yilbasina ozel %30 indirim kampanyasi"
				);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(yilbasi);
		User user= new User(
				1,
				"Erdener",
				"Dereci",
				"1",
				1994
				);
		
		UserManager gamerManager= new UserManager(new MernisServiceAdapter());
		gamerManager.add(user);
		
		SaleManager saleManager = new SaleManager(yilbasi);
		saleManager.sale(user);

	}
	
}
