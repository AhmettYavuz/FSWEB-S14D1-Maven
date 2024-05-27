package com.workintech.developers;

public class HRManager extends Employee{

    JuniorDeveloper[] juniorDeveloper = new JuniorDeveloper[3];
    MidDeveloper[] midDeveloper = new MidDeveloper[3];
    SeniorDeveloper[] seniorDeveloper = new SeniorDeveloper[3];

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
     public void work(){
        System.out.println("HRManager");
    }


}
