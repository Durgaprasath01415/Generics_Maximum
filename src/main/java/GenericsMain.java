public class GenericsMain<E extends Comparable> {
    E[] values;
@SafeVarargs
    public GenericsMain(E ...values) {
        this.values = values;
    }

    public E testMax(){
        return (E) compareMaximum(values);
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
