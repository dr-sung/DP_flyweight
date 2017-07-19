
// participant: ConcreteFlyweight
public class SoldierConcrete implements SoldierFlyweight {

  
    // Intrinsic state maintained by flyweight implementation
    // Solider Shape (graphical represetation)
    //      how to display the soldier is up to the flyweight implementation
    private Object soldierGraphicalRepresentation;

   
     // Note that this method accepts soldier location
     // SoldierFlyweight Location is extrinsic and no reference to previous location or
     // new location is maintained inside the flyweight implementation
    
    @Override
    public void moveSoldier(int previousLocationX, int previousLocationY,
            int newLocationX, int newLocationY) {
        // delete soldier representation from previous location 
        // then render soldier representation in new location 	
    }
}
