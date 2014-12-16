package com.techopvp.guns.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.techopvp.guns.guns.AK47;
import com.techopvp.guns.guns.Colt45;
import com.techopvp.guns.managers.GunManager;
import com.techopvp.guns.utilities.enums.Gun;
import com.techopvp.guns.utilities.enums.GunType;

public class Guns {

	ArrayList<GunManager> guns = new ArrayList<GunManager>();

	public Guns() {
		guns.add(new Colt45());
		guns.add(new AK47());
	}

	public List<String> getGunNames() {
		List<String> gunList = new ArrayList<String>();
		for (GunManager guns : guns) {
			gunList.add(guns.getGunName());
		}
		return gunList;
	}

	public String getGunsWType(GunType type) {
		List<String> gunList = new ArrayList<String>();
		for (GunManager guns : guns) {
			if (type == guns.getGunType()) {
				gunList.add(guns.getGunName());
			}
		}
		if (gunList.isEmpty()) {
			return "There are no guns with the type " + type + ".";
		} else {
			return gunList.toString();
		}
	}

	public GunManager getGun(Gun gun) {
		return gun.getGun();
	}

	public void shoot(Gun gun) {
		Random random = new Random();

		System.out.println("You have fired a " + gun.getGun().getGunName()
				+ " it went " + random.nextInt(gun.getGun().getGunRange()) + " feet" + ".");
	}

}
