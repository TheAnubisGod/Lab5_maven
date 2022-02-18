package collection_master.commands;

import collection_master.commands.interfaces.Command;
import collection_master.interact.UserInteractor;
import collection_master.essentials.Vehicle;

import java.util.Stack;

/**
 * Класс команды очистки коллекции.
 *
 * @author Владислав Дюжев
 * @version 1.0
 */
public class Clear implements Command {
    private final UserInteractor interactor;
    public Clear(UserInteractor interactor) {
        this.interactor = interactor;
    }

    @Override
    public boolean execute(Stack<Vehicle> stack) {
        stack.clear();
        interactor.broadcastMessage("Коллекция очищена.", true);
        return true;
    }
}
