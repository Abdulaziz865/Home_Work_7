package com.company;

public class Main {
    public static void main(String[] args) {
      Magic magic = new Magic();
      magic.setHp(500);
      magic.setDamage(50);
      magic.setSuperAttack(magic.applySuperAbility("DarkMode"));


      Medic medic = new Medic();
        medic.setHp(500);
        medic.setDamage(50);
        medic.setSuperAttack(medic.applySuperAbility("Health"));


      Warrior warrior = new Warrior();
        warrior.setHp(500);
        warrior.setDamage(50);
        warrior.setSuperAttack(warrior.applySuperAbility("Critical Damage"));



      Hero[] superAttack = {magic,medic,warrior};
        for (int i = 0; i <superAttack.length ; i++) {
            System.out.println(superAttack[i].getSuperAttack());
        }

    }
}

