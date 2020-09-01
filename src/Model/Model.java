/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Nicholas
 */
public final class Model {

    private final User user1;
    private final User user2;
    private final User user3;
    private final UserList uL;
    
   private Boxing beginner;
   private Sport boxing;
    
    public Model() {
    
    user1 = new User("IronMan", "TonyS");
    user2 = new User("Nick", "password");
    user3 = new User("Spiderman", "PeterP");
    
    uL = new UserList();
    this.addUserToList(user1.getUserName());
    this.addPassToList(user1.getPassword());

    this.addUserToList(user2.getUserName());
    this.addPassToList(user2.getPassword());
    
    this.addUserToList(user3.getUserName());
    this.addPassToList(user3.getPassword());
    
    beginner = new Boxing("3 Rounds Jump Rope","Jump rope for 3 rounds straight (9 minutes)");
    boxing = new Sport();
    
    this.addDrillName(beginner.getDrillName());
    this.addDrillDescription(beginner.getDrillDescription());
    }

    /**
     * @return the user1
     */
    public User getUser1() {
        return user1;
    }

    /**
     * @return the uL
     */
    public UserList getuL() {
        return uL;
    }
    
     public void addUserToList(String user) {
        uL.getAuthenticatedUsers().add(user);
    }
    
    public void addPassToList(String pass) {
        uL.getAuthenticatedPassword().add(pass);
    }
    
    public void addDrillName(String drillName) {
        boxing.getSportDrills().add(drillName);
    }
    
    public void addDrillDescription(String drillDescription) {
        boxing.getDrillDescription().add(drillDescription);
    }
}
