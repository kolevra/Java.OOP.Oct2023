package o11_16_Reflection_Ex.barracksWars02;

import o11_16_Reflection_Ex.barracksWars02.interfaces.Repository;
import o11_16_Reflection_Ex.barracksWars02.interfaces.Runnable;
import o11_16_Reflection_Ex.barracksWars02.interfaces.UnitFactory;
import o11_16_Reflection_Ex.barracksWars02.core.Engine;
import o11_16_Reflection_Ex.barracksWars02.core.factories.UnitFactoryImpl;
import o11_16_Reflection_Ex.barracksWars02.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
