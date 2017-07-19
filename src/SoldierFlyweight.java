
// participant: Flyweight
//      declares an interface through which flyweights can receive
//      and act on extrinsic state.
// source: www.oodesign.com

public interface SoldierFlyweight {

    
     // Move SoldierFlyweight From Old Location to New Location.
     // Note that soldier location
     //          is extrinsic to the SoldierFlyweight Implementation
    public void moveSoldier(int previousLocationX,
            int previousLocationY, int newLocationX, int newLocationY);
}
