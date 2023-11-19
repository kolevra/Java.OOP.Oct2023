package o11_16_Reflection_Ex.barracksWars01.interfaces;

import o11_16_Reflection_Ex.barracksWars02.interfaces.Executable;

public interface CommandInterpreter {

	Executable interpretCommand(String[] data, String commandName);
}
