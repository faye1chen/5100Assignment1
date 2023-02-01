/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author faye
 */
public class EmployeeDirectory {
        private ArrayList<EmployeeProfile> directory;
        
    public EmployeeDirectory(){
        this.directory = new ArrayList<EmployeeProfile>();
    }

    public ArrayList<EmployeeProfile> getDirectory() {
        return directory;
    }

    public void setDirectory(ArrayList<EmployeeProfile> directory) {
        this.directory = directory;
    }
    
    public EmployeeProfile addNewProfile(){
        
        EmployeeProfile newProfile = new EmployeeProfile();
        directory.add(newProfile);
        return newProfile;
    }
    
    public void deleteProfile(EmployeeProfile ep){
        directory.remove(ep);
    }
  
    
}
