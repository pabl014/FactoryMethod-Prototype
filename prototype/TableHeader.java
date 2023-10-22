
class TableHeader {
    private String type;
    private TableData dataPrototype;

    public TableHeader(String type, TableData dataPrototype) {
        this.type = type;
        this.dataPrototype = dataPrototype; // obiekt TableHeader pobiera przy konstrukcji prototypowy obiekt z
                                            // hierarchii TableData
    }

    public String toString() {
        return type;
    }

    public TableData createData() {
        return (TableData) dataPrototype.clone();
    }
}