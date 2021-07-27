package peripherals;

import model.Animal;
import peripherals.InhibitionLog;

import java.util.List;

/**
 * entity keep state of peripherals.Zoo and provide service desk functionality
 * @checkInAnimal method add Animal to peripherals.Zoo
 * should throw exception when peripherals.Zoo can't provide place
 * @checkOutAnimal method remove Animal from peripherals.Zoo
 * @getHistory - method show log of check in and check out
 */
public interface Zoo {
    void checkInAnimal(Animal animal);
    void checkOutAnimal(Animal animal);
    List<InhibitionLog> getHistory();
}
