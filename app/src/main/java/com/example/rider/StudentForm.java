package com.example.rider;

public class StudentForm {
    String Arrival;
    String Departure;
    String Msg;
    String ArrDate;
    String DepTime;
    String ArrTime;
    String DepDate;


    public StudentForm() {
    }

    public StudentForm(String arrival, String departure, String msg, String arrDate, String depTime, String arrTime, String depDate) {
        Arrival = arrival;
        Departure = departure;
        Msg = msg;
        ArrDate = arrDate;
        DepTime = depTime;
        ArrTime = arrTime;
        DepDate = depDate;
    }

    public String getDepTime() {
        return DepTime;
    }

    public void setDepTime(String depTime) {
        DepTime = depTime;
    }

    public String getArrTime() {
        return ArrTime;
    }

    public void setArrTime(String arrTime) {
        ArrTime = arrTime;
    }

    public String getDepDate() {
        return DepDate;
    }

    public void setDepDate(String depDate) {
        DepDate = depDate;
    }

    public String getArrDate() {
        return ArrDate;
    }

    public void setArrDate(String arrDate) {
        ArrDate = arrDate;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    public String getArrival() {
        return Arrival;
    }

    public void setArrival(String arrival) {
        Arrival = arrival;
    }

    public String getDeparture() {
        return Departure;
    }

    public void setDeparture(String departure) {
        Departure = departure;
    }
}
