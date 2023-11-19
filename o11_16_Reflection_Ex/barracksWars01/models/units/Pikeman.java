package o11_16_Reflection_Ex.barracksWars01.models.units;

import o11_16_Reflection_Ex.barracksWars02.models.units.AbstractUnit;

public class Pikeman extends AbstractUnit {

	private static final int PIKEMAN_HEALTH = 30;
	private static final int PIKEMAN_DAMAGE = 15;

	public Pikeman() {
		super(PIKEMAN_HEALTH, PIKEMAN_DAMAGE);
	}
}
