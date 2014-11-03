package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import play.Play;
import play.db.jpa.Model;

@Entity
public class Type1Service extends Model {

	public Type1Service(Type1Service ms) {
		name = ms.name;
		mktoURL = ms.mktoURL;
		munchkinId = ms.munchkinId;
		timezone = ms.timezone;
		numEntries = ms.numEntries;
		oauthToken = ms.oauthToken;
		status = ms.status;
		redirectURL = ms.redirectURL;
		redirId = ms.redirId;
	}

	public Type1Service() {
	}

	public Type1Service(String mId, String name, String url, String reurl) {
		this.munchkinId = mId;
		this.name = name;
		this.mktoURL = url;
		this.redirectURL = reurl;
		this.redirId = getRedirectUid(redirectURL);
		status = "active";
	}

	private String getRedirectUid(String url) {
		String[] vals = url.split("/");
		int sz = vals.length;
		String idStr = vals[vals.length - 1];
		return idStr;
	}

	public String name;
	public String mktoURL; // provided by marketer
	public String munchkinId; // from token
	public String timezone;
	public int numEntries;
	@Column(length = 2000)
	public String oauthToken;
	public String status;
	public String redirId;
	public String redirectURL;

}