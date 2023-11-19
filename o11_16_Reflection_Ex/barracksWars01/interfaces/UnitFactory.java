package o11_16_Reflection_Ex.barracksWars01.interfaces;

import o11_16_Reflection_Ex.barracksWars02.interfaces.Unit;
import jdk.jshell.spi.ExecutionControl;

public interface UnitFactory {

    Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException;
}