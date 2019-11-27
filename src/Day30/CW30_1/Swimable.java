package Day30.CW30_1;

public interface Swimable {

    boolean IS_SWIMABLE = true;
    double MAX_DEPTH = 11700;

    default void swim() {

    }

    void dive();

}
