package collection_master.commands.interfaces;

import collection_master.essentials.Vehicle;

import java.util.Stack;

/**
 * Общий интерфейс для команд.
 *
 * @author Владислав Дюжев
 * @version 1.0
 */
public interface Command {
    boolean execute(Stack<Vehicle> stack);
}
