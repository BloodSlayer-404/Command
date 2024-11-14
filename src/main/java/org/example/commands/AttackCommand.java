package org.example.commands;

import lombok.AllArgsConstructor;
import org.example.Pokemon;

@AllArgsConstructor
public class AttackCommand implements Command {

    private Pokemon attacker;
    private Pokemon target;

    /**
     * Executes the attack action.
     * @return A string describing the attack and damage applied.
     */
    @Override
    public String execute() {
        String attackMessage = attacker.attack(target);
        String damageMessage = target.takeDamage(10);
        return attackMessage + "\n" + damageMessage;
    }
}
