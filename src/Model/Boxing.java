/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Nicholas
 */
public class Boxing {
    
    private String drillName;
    private String drillDescription;
    
    public Boxing(String newDrillName, String newDrillDescription) {
      drillName = newDrillName;
      drillDescription = newDrillDescription;
    }

    /**
     * @return the drillName
     */
    public String getDrillName() {
        return drillName;
    }

    /**
     * @return the drillDescription
     */
    public String getDrillDescription() {
        return drillDescription;
    }
    
    
}