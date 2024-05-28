package com.workintech.developers;

public class HRManager extends Employee{

    private JuniorDeveloper[] juniorDeveloper;
    private MidDeveloper[] midDeveloper;
    private SeniorDeveloper[] seniorDeveloper ;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }

    public HRManager(int id, String name, double salary, JuniorDeveloper[] juniorDeveloper, MidDeveloper[] midDeveloper, SeniorDeveloper[] seniorDeveloper) {
        super(id, name, salary);
        this.juniorDeveloper = juniorDeveloper;
        this.midDeveloper = midDeveloper;
        this.seniorDeveloper = seniorDeveloper;
    }

    @Override
     public void work(){
        System.out.println(getName() + "HRManager");
    }


}
