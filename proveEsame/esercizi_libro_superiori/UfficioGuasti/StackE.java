package UfficioGuasti;

import java.util.Stack;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StackE<T extends Richieste> extends Stack<T> {
    public StackE<T> order(StackE<T> o) {
        StackE<T> result = new StackE<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while (!o.isEmpty()) {
            T latest = o.get(0);
            for (int i = 1; i < o.size(); i++) {
                String date1Str = formatDateString(latest.getDate());
                String date2Str = formatDateString(o.get(i).getDate());

                LocalDate date1 = LocalDate.parse(date1Str, formatter);
                LocalDate date2 = LocalDate.parse(date2Str, formatter);

                if (date2.isAfter(date1)) {
                    latest = o.get(i);
                }
            }
            result.push(latest);
            o.remove(latest);
        }

        return result;
    }

    private String formatDateString(String date) {
        String[] parts = date.split("/");
        String day = parts[0].length() == 1 ? "0" + parts[0] : parts[0];
        String month = parts[1].length() == 1 ? "0" + parts[1] : parts[1];
        return day + "/" + month + "/" + parts[2];
    }
}