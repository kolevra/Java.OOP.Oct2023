package o11_16_Reflection_Ex.barracksWars02.core.commands;

import o11_16_Reflection_Ex.barracksWars02.interfaces.Repository;
import o11_16_Reflection_Ex.barracksWars02.interfaces.UnitFactory;

public class ReportCommand extends Command {
    public ReportCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        String output = this.getRepository().getStatistics();
        return output;
    }
}