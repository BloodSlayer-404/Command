package org.example.commands;

import lombok.AllArgsConstructor;
import org.example.Pokemon;

@AllArgsConstructor
public class EscapeCommand implements Command{

    private Pokemon pokemon;

    /**
     * Executes the escape action.
     * @return A string describing the escape attempt.
     */
    @Override
    public String execute() {
        return pokemon.escape();
    }
}
