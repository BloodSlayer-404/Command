package org.example.commands;

import lombok.AllArgsConstructor;
import org.example.Pokemon;

@AllArgsConstructor
public class HealCommand implements Command{

    private Pokemon pokemon;

    /**
     * Executes the heal action.
     * @return A string describing the heal action.
     */
    @Override
    public String execute() {
        return pokemon.heal();
    }
}
