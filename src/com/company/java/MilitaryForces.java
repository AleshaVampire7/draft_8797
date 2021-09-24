package com.company.java;

import com.company.java.attack.Interfaces.Iattack;
import com.company.java.formation.interfaces.Iformation;
import com.company.java.move.interfaces.Imove;

public class MilitaryForces {
private String type;
Iattack attackB;
Imove moveB;
Iformation formationB;

public MilitaryForces(String type){
    this.type=type;
}

public void setAttackB(Iattack attackB){
    this.attackB=attackB;
}

public void setFormationB(Iformation formationB) {
    this.formationB = formationB;
}

public void setMoveB(Imove moveB){
    this.moveB=moveB;
}
public void action(){
    System.out.println("Type of military: "+type);
    System.out.println("Formation: "+formationB.protect());
    System.out.println("Movement: "+moveB.move());
    System.out.println("Attack: "+attackB.attack());
}
}
