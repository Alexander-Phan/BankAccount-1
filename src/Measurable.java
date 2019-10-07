import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public abstract class Measurable implements Comparable <Measurable>{
    abstract float getMeasure();

    @Override
    public int compareTo(Measurable measurable) {
        if (getMeasure() > measurable.getMeasure()){
            return 1;
        }else if (getMeasure() == measurable.getMeasure()){
            return 0;
        }else{
            return -1;
        }
    }

    public static float getAverage(ArrayList<Measurable> measures){
        float sum = 0;
        float average = 0;
        for (int i = 0; i < measures.size(); i++){
            sum += measures.get(i).getMeasure();
        }
        if (measures.size() != 0){
            average = sum/measures.size();
        }
        return average;
    }
}
