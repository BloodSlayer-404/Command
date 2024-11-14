package org.example;

import org.example.commands.AttackCommand;
import org.example.commands.Command;
import org.example.commands.EscapeCommand;
import org.example.commands.HealCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {

    private Pokemon pikachu;
    private Pokemon charmander;
    private BattleInvoker invoker;

    /**
     * Sets up the initial conditions for each test case.
     * This method initializes the Pokemon objects (Pikachu and Charmander)
     * and the BattleInvoker before each test to ensure a fresh state.
     */
    @BeforeEach
    void setUp() {
        pikachu = new Pokemon("Pikachu", 100);
        charmander = new Pokemon("Charmander", 100);
        invoker = new BattleInvoker();
    }

    /**
     * Test for the AttackCommand.
     * Verifies that executing an attack command results in the correct attack message
     * and that the target Pokemon's health is reduced appropriately.
     */
    @Test
    void testAttackCommand() {
        Command attackCommand = new AttackCommand(pikachu, charmander);
        invoker.setCommand(attackCommand);
        String result = invoker.executeCommand();

        assertEquals("Pikachu attacks Charmander!\nCharmander takes 10 damage. " +
                        "Current health: 90",
                result);
    }

    /**
     * Test for the HealCommand.
     * Checks that executing the heal command correctly increases the Pokemon's health
     * and returns the expected healing message.
     */
    @Test
    void testHealCommand() {
        Command healCommand = new HealCommand(pikachu);
        invoker.setCommand(healCommand);
        String result = invoker.executeCommand();

        assertEquals("Pikachu heals. Current health: 110",
                result);
    }

    /**
     * Test for the EscapeCommand.
     * Validates that the escape command returns the appropriate message indicating
     * an attempt to flee from the battle.
     */
    @Test
    void testEscapeCommand() {
        Command escapeCommand = new EscapeCommand(charmander);
        invoker.setCommand(escapeCommand);
        String result = invoker.executeCommand();

        assertEquals("Charmander tries to escape from the battle!",
                result);
    }

    /**
     * Test for the takeDamage method.
     * Ensures that the takeDamage method correctly reduces the health of a Pokemon
     * by the specified amount and that the health value is as expected after the damage.
     */
    @Test
    void testTakeDamage() {
        charmander.takeDamage(20);
        assertEquals(80, charmander.getHealth());
    }
}