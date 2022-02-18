package collection_master.commands;

import collection_master.commands.interfaces.Command;
import collection_master.commands.interfaces.IdCommand;
import collection_master.interact.UserInteractor;
import collection_master.essentials.Vehicle;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Класс команды удаления элемента по id.
 *
 * @author Владислав Дюжев
 * @version 1.0
 */
public class RemoveById implements Command, IdCommand {
    private final UserInteractor interactor;
    private final String argument;

    public RemoveById(UserInteractor interactor, ArrayList<String> args) {
        this.interactor = interactor;
        this.argument = args.get(0);
    }

    @Override
    public boolean execute(Stack<Vehicle> stack) {
        int index = idArgToIndex(argument, stack, interactor);
        if (index == -1) {
            return true;
        }

        stack.remove(index);
        interactor.broadcastMessage("Элемент успешно удален.", true);
        return true;
    }
}
