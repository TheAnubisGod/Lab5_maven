package collection_master.commands;

import collection_master.commands.interfaces.Command;
import collection_master.essentials.Vehicle;

import java.util.Stack;

/**
 * Класс команды завершения интерактивного режима.
 *
 * @author Владислав Дюжев
 * @version 1.0
 */
public class Exit implements Command {
    @Override
    public boolean execute(Stack<Vehicle> stack) {

        return false;
    }
}
