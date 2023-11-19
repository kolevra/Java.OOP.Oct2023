package o11_16_Reflection_Ex.barracksWars02.core.commands;

import o11_16_Reflection_Ex.barracksWars02.interfaces.Repository;
import o11_16_Reflection_Ex.barracksWars02.interfaces.UnitFactory;

public class FightCommand extends Command {
    public FightCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        return "fight";
    }
}
