
package Model;

import java.util.ArrayList;

public class UserList {
    
    private ArrayList<String> authenticatedUsers;
    private ArrayList<String> authenticatedPassword;

    public UserList() {
        this.authenticatedUsers = new ArrayList<>();
        this.authenticatedPassword = new ArrayList<>();
       
    }

    /**
     * @return the authenticatedUsers
     */
    public ArrayList<String> getAuthenticatedUsers() {
        return authenticatedUsers;
    }

    /**
     * @return the authenticatedPassword
     */
    public ArrayList<String> getAuthenticatedPassword() {
        return authenticatedPassword;
    }
    
    public boolean authenticate(String user, String password) {
        if (isUserInTheUserList(user) && isPassInThePassList(password)) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isUserInTheUserList(String user) {
        if (this.authenticatedUsers.contains(user)) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isPassInThePassList(String password) {
        if(this.authenticatedPassword.contains(password)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param authenticatedUsers the authenticatedUsers to set
     */
    public void setAuthenticatedUsers(ArrayList<String> authenticatedUsers) {
        this.authenticatedUsers = authenticatedUsers;
    }

    /**
     * @param authenticatedPassword the authenticatedPassword to set
     */
    public void setAuthenticatedPassword(ArrayList<String> authenticatedPassword) {
        this.authenticatedPassword = authenticatedPassword;
    }
   

}