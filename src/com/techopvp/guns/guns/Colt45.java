package com.techopvp.guns.guns;

import com.techopvp.guns.managers.GunManager;
import com.techopvp.guns.utilities.enums.GunType;

public class Colt45 extends GunManager {

	public Colt45() {
		super("Colt 45", 9, 21, 0, GunType.PISTOL);
	}
	
}
