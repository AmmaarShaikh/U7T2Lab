import java.util.ArrayList;

/**
 * This class represents a UsedCarLot object
 *
 * @author Ammaar Shaikh
 */

public class UsedCarLot {
    /** The list of the cars in the lot*/
    private ArrayList<Car> inventory;

    /**
     * Instantiates a UsedCarLot object
     */
    public UsedCarLot(){
        inventory = new ArrayList<Car>();
    }

    /**
     * Returns inventory(car list) of the lot
     *
     * @return inventory(car list)
     */
    public ArrayList<Car> getInventory(){
        return inventory;
    }

    /**
     * Adds a car to inventory(car list)
     *
     * @param car The car to be added
     */
    public void addCar(Car car){
        inventory.add(car);
    }

    /**
     * Swaps the positions of the cars in inventory(car list)
     *
     * @param num Car1, to be switched with Car2
     * @param num2 Car2, to be switched with Car1
     * <p>
     * @return true(if switch worked), false(if switch did not work)
     */
    public boolean swap(int num, int num2){
        Car car1 = inventory.get(num);
        Car car2 = inventory.get(num2);
        inventory.set(num, car2);
        inventory.set(num2, car1);
        return inventory.get(num) == car2 || inventory.get(num) == car1;
    }

    /* Adds a Car to the inventory list at the index specified
        by indexToAdd; this method increases the size of inventory by 1
        PRECONDITION: 0 <= indexToAdd < inventory.size()
        DUE TO THIS PRECONDITION, you do NOT need to check for boundary errors
        like you did the other addCar method; also note that this method is void
    */

    /**
     * Adds a car object to a specific index of inventory(car list)
     *<p>
     * PRECONDITION: 0 &lt;= indexToAdd &lt; inventory.size()
     * @param indexToAdd Where to place the car object
     * @param carToAdd The car object to be added
     */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }

    /* "sells" the Car located at indexOfCarToSell which
        removes it from the inventory list and shifting the remaining
        Cars in the inventory list to the left to fill in the gap;
        this method reduces the size of inventory by 1

        Returns the Car that is being "sold" (removed from lot)

        PRECONDITION: indexOfCarToSell < inventory.size()

        HINT: the ArrayList remove() method returns the removed element while also
              removing it from the ArrayList
      */

    /**
     * Removes a car from inventory(car list)
     *<p>
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     * @param indexOfCarToSell The index of the car to be removed
     * <p>
     * @return The car that was removed from inventory(car list)
     */
    public Car sellCarShift(int indexOfCarToSell)
    {
        Car soldCar = inventory.get(indexOfCarToSell);
        inventory.remove(indexOfCarToSell);
        return soldCar;
    }

    /* "sells" the Car located at indexOfCarToSell,
       but instead of removing it and shifting the inventory
       list to the left, REPLACE the Car at indexOfCarToSell
       with NULL, thus creating an "empty parking spot" on the lot;
       this method does NOT reduce the size of inventory by 1

       PRECONDITION: indexOfCarToSell < inventory.size()

       This method returns the Car that is being "sold" (replaced with null)
     */

    /**
     * Removes a car from inventory(car list), and replaces it with null
     *<p>
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     * @param indexOfCarToSell Index of the car to be removed
     * <p>
     * @return The car that was removed from inventory(car list)
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        Car soldCar = inventory.get(indexOfCarToSell);
        inventory.set(indexOfCarToSell, null);
        return soldCar;
    }

    /* moves Car located at index indexOfCarToMove to index destinationIndex;
       if destinationIndex > indexOfCarToMove, moves the Car to the right in
       inventory; if destinationIndex < indexOfCarToMove, moves the
       Car to the left in the inventory. All other cars in the inventory
       should shift accordingly

       PRECONDITIONS: indexOfCarToMove < inventory.size()
                      destinationIndex < inventory.size()
     */

    /**
     * Moves a specific car from inventory(car list) to a specific index
     *<p>
     * PRECONDITIONS: indexOfCarToMove &lt; inventory.size()
     *                destinationIndex &lt; inventory.size()
     * @param indexOfCarToMove The index of the car to be moved
     * @param destinationIndex The index of the destination the car is to be placed at
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        Car carToMove = inventory.get(indexOfCarToMove);
        inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, carToMove);
    }
}
