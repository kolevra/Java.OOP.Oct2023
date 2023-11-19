package o11_16_Reflection_Ex.barracksWars02.core.commands;

import o11_16_Reflection_Ex.barracksWars02.interfaces.Repository;
import o11_16_Reflection_Ex.barracksWars02.interfaces.UnitFactory;

public class RetireCommand extends Command {
    public RetireCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        String unitType = this.getData()[1];

        String res = unitType + " retired!";

        try {
            this.getRepository().removeUnit(unitType);
        } catch (IllegalArgumentException ex) {
            return ex.getMessage();
        }

        return res;
    }
}