package com.kaivanshah.assignment84;

/**
 * Created by kaivanrasiklal.s on 29-06-2017.
 */

public class SampleClass {

    //private variables
    String _Name;
    String _Phone;
    String _DOB;


    // Empty constructor
    public SampleClass(){

    }
    // constructor
    public SampleClass(String Name, String Phone, String DOB){
        this._Name = Name;
        this._Phone = Phone;
        this._DOB = DOB;

    }


    // getting Name
    public String  getName(){
        return this._Name;
    }

    // setting Name
    public void setName(String Name){
        this._Name = Name;
    }

    // getting Phone
    public String getPhone(){
        return this._Phone;
    }

    // setting Phone
    public void setPhone(String Phone){
        this._Phone = Phone;
    }

    // getting DOB
    public String getDOB(){
        return this._DOB;
    }

    // setting DOB
    public void setDOB(String DOB){
        this._DOB = DOB;
    }

}
