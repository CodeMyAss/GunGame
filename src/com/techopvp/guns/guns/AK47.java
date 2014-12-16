package com.techopvp.guns.guns;

import com.techopvp.guns.managers.GunManager;
import com.techopvp.guns.utilities.enums.GunType;

public class AK47 extends GunManager {

	public AK47() {
		super("AK47", 15, 30, 1, GunType.ASSAULT);
	}
	
}
