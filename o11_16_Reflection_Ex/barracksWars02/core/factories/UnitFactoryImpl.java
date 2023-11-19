package o11_16_Reflection_Ex.barracksWars02.core.factories;

import o11_16_Reflection_Ex.barracksWars02.interfaces.Unit;
import o11_16_Reflection_Ex.barracksWars02.interfaces.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"o11_16_Reflection_Ex.barracksWars.models.units.";

	@Override
	public Unit createUnit(String unitType) {
		Unit newUnit = null;

		try {
			Class unitClass = Class.forName(UNITS_PACKAGE_NAME +  unitType);
			Constructor<Unit> unitConstr = unitClass.getConstructor();
			newUnit = unitConstr.newInstance();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		return newUnit;
	}
}
