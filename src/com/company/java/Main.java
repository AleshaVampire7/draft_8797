package com.company.java;

import com.company.java.attack.FromAir;
import com.company.java.formation.Echelon;
import com.company.java.move.MAir;

public class Main {
    public static void main(String[] args) {
    MilitaryForces airForce=new MilitaryForces("airForce");
    airForce.setAttackB(new FromAir());
    airForce.setFormationB(new Echelon());
    airForce.setMoveB(new MAir());
    airForce.action();
    }
}
