package collection_master.commands;

import collection_master.commands.interfaces.Command;
import collection_master.interact.UserInteractor;
import collection_master.essentials.Vehicle;

import java.util.Collections;
import java.util.Stack;

/**
 * Класс команды изменения направления коллекции.
 *
 * @author Владислав Дюжев
 * @version 1.0
 */
public class Reorder implements Command {
    private final UserInteractor interactor;

    public Reorder(UserInteractor interactor) {
        this.interactor = interactor;
    }

    @Override
    public boolean execute(Stack<Vehicle> stack) {
        Collections.reverse(stack);
        interactor.broadcastMessage("Порядок коллекции инвертирован.", true);
        return true;
    }
}
