
package Model;

import java.util.ArrayList;


/**
 *
 * @author nickbui
 * @version 1.0 Jul 12, 2020
 */

public class Sport {
    // Instance Variables -- define your private data

    private ArrayList<String> sportDrills;
    private ArrayList<String> drillDescription;
    

    // Constructors
    public Sport()
    {
            // initialize default values
        this.sportDrills = new ArrayList<>();
        this.drillDescription = new ArrayList<>();
        
    }

    /**
     * @return the sportDrills
     */
    public ArrayList<String> getSportDrills() {
        return sportDrills;
    }

    /**
     * @return the drillDescription
     */
    public ArrayList<String> getDrillDescription() {
        return drillDescription;
    }
    


    
}
