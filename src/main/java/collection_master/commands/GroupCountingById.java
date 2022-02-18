package collection_master.commands;

import collection_master.commands.interfaces.Command;
import collection_master.interact.UserInteractor;
import collection_master.essentials.Vehicle;

import java.util.Stack;

/**
 * Класс команды подсчета групп по id.
 *
 * @author Владислав Дюжев
 * @version 1.0
 */
public class GroupCountingById implements Command {
    private final UserInteractor interactor;
    public GroupCountingById(UserInteractor interactor) {
        this.interactor = interactor;
    }

    @Override
    public boolean execute(Stack<Vehicle> stack) {
        for (Vehicle vehicle : stack) {
            interactor.broadcastMessage("1 элемент со значением id=" + vehicle.getId() + ".", true);
        }
        return true;
    }
}
