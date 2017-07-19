
// Example: Flyweight design pattern
// This example is based on the code presented at:
// http://www.oodesign.com/flyweight-pattern.html

public class Main {

    public static void main(String[] args) {
        // start war 

        // draw war terrain 

        // create thousands of soldiers:
        SoldierClient warSoldiers[] = {
            new SoldierClient(),
            new SoldierClient(),
            new SoldierClient(),
            new SoldierClient(),
            new SoldierClient()
			//
			//  .... thousands of new SolderClient()
			//
        };

        // move each soldier to his location 
        // take user input to move each soldier 
        warSoldiers[0].moveSoldier(17, 2112);

        // take user input to move each soldier 
        warSoldiers[1].moveSoldier(137, 112);

        // note that there is only one SoldierConcrete (ConcreteFlyweight)
        // for all soldiers (thousands of them) 
        // Soldier Client size is small due to the small state it maintains
        // SoliderConcrete size might be large or might be small 
        // however we saved memory costs of creating Soldier representations
    }
}
