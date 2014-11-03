package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class MobileCampaign extends Model {
	public MobileCampaign(MobileCampaign ms) {
		campaignId = ms.campaignId;
		munchkinId = ms.munchkinId;
		name = ms.name;
		status = ms.status;
	}

	public MobileCampaign() {
	}

	public String campaignId; // provided by marketer
	public String munchkinId; // from token
	public String name;
	public String status;
}