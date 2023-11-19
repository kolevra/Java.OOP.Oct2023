package o11_16_Reflection_Ex.barracksWars02.core.commands;

import o11_16_Reflection_Ex.barracksWars02.interfaces.Executable;
import o11_16_Reflection_Ex.barracksWars02.interfaces.Repository;
import o11_16_Reflection_Ex.barracksWars02.interfaces.UnitFactory;

public abstract class Command implements Executable {
    private String[] data;
    private Repository repository;
    private UnitFactory unitFactory;

    protected Command(String[] data, Repository repository, UnitFactory unitFactory) {
        this.data = data;
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    protected String[] getData() {
        return this.data;
    }

    protected Repository getRepository() {
        return this.repository;
    }

    protected UnitFactory getUnitFactory() {
        return this.unitFactory;
    }
}
