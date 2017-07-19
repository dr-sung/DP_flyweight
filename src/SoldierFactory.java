
// participant: FlyweightFactory

public class SoldierFactory {

     // Pool for one soldier only
     // if there are more soldier types this can be an
     // array or list or better a HashMap
     
    private static SoldierFlyweight soldier;

    public static SoldierFlyweight getSoldier() {

        // this is a singleton 
        // if there is no soldier 
        if (soldier == null) {
            soldier = new SoldierConcrete();
        }

        return soldier;
    }
}
