package cages;

import model.Condition;
import model.Species;

import java.util.ArrayList;
import java.util.List;

class ConditionImpl implements Condition {
    private ArrayList<Species> permission = new ArrayList<>();

    ConditionImpl(double width, double height ) {
        double area = width * height;

        //  Необходимая площадь Б-5, П-10, Л-15, Ж - 25
        //  Погрешность + 2

        if(area >= 7) {
            permission.add(Species.SQUIRREL);
        }
        if(area >= 12) {
            permission.add(Species.PENGUIN);
        }
        if(area >= 17) {
            permission.add(Species.LEON);
        }
        if(area >= 27) {
            permission.add(Species.GIRAFFE);
        }
    }

    @Override
    public List<Species> isAvailableFor() {
        return permission;
    }

    public static void main(String[] args) {
        CageImpl cage = new CageImpl(3, 5);
        ConditionImpl condition = new ConditionImpl(3, 5);
        List<Species> species = condition.isAvailableFor();
        System.out.println(species);
    }
}
