
import java.util.Random;

class TableDataInt implements TableData {
    private int data;
    private static Random rnd = new Random();

    public TableDataInt() {
        data = rnd.nextInt(100);
    }

    public String toString() {
        return Integer.toString(data);
    }

    @Override
    public Object clone() {
        return new TableDataInt();
    }
}
