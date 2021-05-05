package Entities;

import Abstract.Entity;

public class Campaign implements Entity{
	private int id;
	private String campaignName;
	private String detail;
	public Campaign(int id, String campaignName, String detail) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.detail = detail;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
}
