package com.techopvp.guns.utilities.enums;

import com.techopvp.guns.guns.AK47;
import com.techopvp.guns.guns.Colt45;
import com.techopvp.guns.guns.UZI;
import com.techopvp.guns.managers.GunManager;

public enum Gun {
	
	COLT45(new Colt45()),
	AK47(new AK47()),
	UZI(new UZI());
	
	GunManager gun;
	
	private Gun(GunManager gun) {
		this.gun = gun;		
	}
	
	/**
	 * Get a gun's options, and gun information.
	 * 
	 * @return gun - Gun options
	 */
	
	public GunManager getGun() {
		return gun;
	}

}
