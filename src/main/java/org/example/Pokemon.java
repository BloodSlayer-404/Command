package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Pokemon {

    private String name;
    private int health;

    /**
     * Performs an attack on the target Pokemon.
     * @param target: Target Pokemon that will receive the attack.
     * @return A string describing the attack action.
     */
    public String attack(Pokemon target) {
        String message = name + " attacks " + target.getName() + "!";
        return message;
    }

    /**
     * Heals the Pokemon, increasing its health.
     * @return A string describing the heal action.
     */
    public String heal() {
        health += 10;
        return name + " heals. Current health: " + health;
    }

    /**
     * Attempts to escape from the battle.
     * @return A string describing the escape action.
     */
    public String escape() {
        return name + " tries to escape from the battle!";
    }

    /**
     * Reduces the Pokemon's health by a certain damage value.
     * @param damage: The amount of damage to apply.
     * @return A string describing the damage received.
     */
    public String takeDamage(int damage) {
        health -= damage;
        return name + " takes " + damage + " damage. Current health: " + health;
    }
}
