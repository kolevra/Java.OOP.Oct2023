package o11_16_Reflection_Ex.barracksWars01.models.units;

import o11_16_Reflection_Ex.barracksWars02.models.units.AbstractUnit;

public class Horseman extends AbstractUnit {

    private static final int HORSEMAN_HEALTH = 50;
    private static final int HORSEMAN_DAMAGE = 10;

    public Horseman() {
        super(HORSEMAN_HEALTH, HORSEMAN_DAMAGE);
    }
}
