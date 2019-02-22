/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author Exile
 */
public enum Teams {
    BULLS ("Chicago", "Bulls"),
    CAVALIERS ("Cleveland", "Cavaliers"),
    PISTONS ("Detroit", "Pistons"),
    PACERS ("Indiana", "Pacers"),
    BUCKS ("Milwaukee", "Bucks");
    
    private String city;
    private String teamName;
    private Teams(String city, String teamName){
        this.teamName = teamName;
        this.city = city;
    }
    public String getCity()
    {
        return city;
    }
    public String getTeam(){
        return teamName;
    }
}
