/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author hemin
 */
public class PersonDirectory {
    private ArrayList<Person> persons;
        
    public PersonDirectory() {
        this.persons = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }
    
    public Person addPerson() {
        Person p = new Person();
        persons.add(p);
        return p;
    }
    
    public void deletePerson(Person person){
        persons.remove(person);
    }
    
    public Person searchPerson(String query) {
       
        // convert query to lower case
        query = query.toLowerCase();
        
        // Name check
        for (Person p : persons) {
            if (p.getFirstName().toLowerCase().contains(query) || p.getLastName().toLowerCase().contains(query)) {
                return p;
            } // Street address check 
            else if (p.getHomeAddress().getStreet().toLowerCase().contains(query) || p.getWorkAddress().getStreet().toLowerCase().contains(query)) { 
                return p;
            }
        }
        return null;
    }
    
}
