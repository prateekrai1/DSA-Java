package oopsExcercises;

import Recursion.TrianglePattern;

public class Flight {
    private int flightNum;
    private String destination;
    private String departure;
    private String status;
    private boolean isDelay;

    public Flight(int flightNum, String destination, String departure, String status, boolean isDelay){
        this.flightNum = flightNum;
        this.destination = destination;
        this.departure = departure;
        this.status = status;
        this.isDelay = isDelay;
    }

    public int getFlightNum(){
        return flightNum;
    }

    public String getDestination(){
        return destination;
    }

    public String getDeparture(){
        return departure;
    }

    public String getStatus(){
        return status;
    }

    public boolean getDelay(){
        return isDelay;
    }

    public boolean checkStatus(String status){
        if(status.equalsIgnoreCase("Delay")){
            return isDelay = true;
        }
        else return false;
    }

    public static void main(String[] args) {
        Flight f1 = new Flight(123,"USA","India", "Delay", false);
        System.out.println(f1.isDelay);
        f1.checkStatus(f1.status);
        System.out.println(f1.status);
        System.out.println(f1.isDelay);
    }
}
