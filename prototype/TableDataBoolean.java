
import java.util.Random;

class TableDataBoolean implements TableData {
    private boolean data;
    private static Random rnd = new Random();

    public TableDataBoolean() {
        data = rnd.nextBoolean();
    }

    public String toString() {
        return Boolean.toString(data);
    }

    @Override
    public Object clone() {
        return new TableDataBoolean();
    }
}