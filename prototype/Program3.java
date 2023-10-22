
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Program3 {
    public static void main(String[] args) {
        final JFrame frame = new JFrame("Baza danych");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final Database database = new Database();

        JTable table = new JTable(database);
        JMenuBar bar = new JMenuBar();

        JButton row = new JButton("Dodaj Wiersz");
        JButton col = new JButton("Dodaj Kolumnę");

        bar.add(row);
        bar.add(col);

        frame.add(new JScrollPane(table));
        frame.setJMenuBar(bar);

        frame.pack();
        frame.setVisible(true);

        row.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                database.addRow();
            }
        });
        col.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                Object option = JOptionPane.showInputDialog(
                        frame,
                        "Podaj typ kolumny",
                        "Dodaj Kolumnę",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        new TableHeader[] {
                                new TableHeader("INT", new TableDataInt()),
                                new TableHeader("DOUBLE", new TableDataDouble()),
                                new TableHeader("CHAR", new TableDataChar()),
                                new TableHeader("BOOLEAN", new TableDataBoolean())
                        }, null);
                if (option == null)
                    return;
                database.addCol((TableHeader) option);
            }
        });
    }
}