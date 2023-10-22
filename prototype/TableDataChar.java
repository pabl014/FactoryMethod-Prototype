
import java.util.Random;

class TableDataChar implements TableData {
    private char data;
    private static Random rnd = new Random();

    public TableDataChar() {
        data = (char) (rnd.nextInt(26) + 'A');
    }

    public String toString() {
        return Character.toString(data);
    }

    @Override
    public Object clone() {
        return new TableDataChar();
    }
}