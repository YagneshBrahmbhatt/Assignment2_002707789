/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Yagnesh
 */
public class CreateProfileHistory {
    
    private ArrayList<CreateProfile> history;
    
    public CreateProfileHistory(){
        
        this.history = new ArrayList<CreateProfile>();
    }

    public ArrayList<CreateProfile> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<CreateProfile> history) {
        this.history = history;
    } 
    
    public CreateProfile addNewProfile(){
        
        CreateProfile newProfile = new CreateProfile();
        history.add(newProfile);
        return newProfile;
        
    }
    
    public void deleteProfile(CreateProfile cp){
        history.remove(cp);
    }
    
}
