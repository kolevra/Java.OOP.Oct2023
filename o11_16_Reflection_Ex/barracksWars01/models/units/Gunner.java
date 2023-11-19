package o11_16_Reflection_Ex.barracksWars01.models.units;

import o11_16_Reflection_Ex.barracksWars02.models.units.AbstractUnit;

public class Gunner extends AbstractUnit {

    private static final int GUNNER_HEALTH = 50;
    private static final int GUNNER_DAMAGE = 10;

    public Gunner() {
        super(GUNNER_HEALTH, GUNNER_DAMAGE);
    }

}
