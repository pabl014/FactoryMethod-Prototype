
import java.util.Random;

class TableDataDouble implements TableData {
    private double data;
    private static Random rnd = new Random();

    public TableDataDouble() {
        data = rnd.nextDouble() * 100.0;
    }

    public String toString() {
        return Double.toString(data);
    }

    @Override
    public Object clone() {
        return new TableDataDouble();
    }
}