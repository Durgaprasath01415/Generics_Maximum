import java.util.regex.Pattern;

public class GenericsMain<E extends Comparable> {
    E[] values;
@SafeVarargs
    public GenericsMain(E ...values) {
        this.values = values;
    }

    public E testMax(){
    E maximumNumber = (E) compareMaximum(values);
    printMaximum(maximumNumber);
        return (E) compareMaximum(values);
    }

    public void printMaximum(E maximumNumber) {
        System.out.printf("Maximum is : " + maximumNumber + "\n");
    }

    @SafeVarargs
    public static < E extends Comparable<E>> E compareMaximum(E ...values){
        E maximumNumber = values[0];
        for(int i =1; i < values.length; i++){
            if(maximumNumber.compareTo(values[i])<0){
                maximumNumber = values[i];
            }
        }
        return maximumNumber;
    }
}
