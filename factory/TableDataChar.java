
class TableDataChar implements TableData {
    private char data;

    public TableDataChar() {
        data = (char) (rnd.nextInt(26) + 'A');
    }

    public String toString() {
        return Character.toString(data);
    }
}