package collection_master.commands;

import collection_master.commands.Add;
import collection_master.essentials.Vehicle;
import collection_master.interact.UserInteractor;


import java.util.Collections;
import java.util.Stack;

/**
 * Класс управления коллекцией с помощью командной строки.
 *
 * @author Владислав Дюжев
 * @version 1.0
 */
public class AddIfMin extends Add {
    public AddIfMin(UserInteractor interactor, boolean from_script) {
        super(interactor, from_script);
    }

    @Override
    public boolean execute(Stack<Vehicle> stack) {
        Vehicle vehicle = createVehicle(fromScript, interactor);
        if (stack.isEmpty() || vehicle.compareTo(Collections.min(stack)) < 0) {
            stack.add(vehicle);
            interactor.broadcastMessage("Элемент успешно добавлен.", true);
        } else {
            interactor.broadcastMessage("Элемент не минимальный.", true);
        }
        return true;
    }
}
