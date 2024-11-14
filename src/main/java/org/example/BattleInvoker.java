package org.example;

import lombok.Setter;
import org.example.commands.Command;

public class BattleInvoker {

    @Setter
    private Command command;

    /**
     * Executes the current command.
     * @return The result of the command execution.
     */
    public String executeCommand() {
        return command.execute();
    }
}
