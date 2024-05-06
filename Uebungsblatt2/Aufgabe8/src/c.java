import java.time.LocalDate;

public class c {
    public void monthStart() {

        int[] starts = new int[7];

        int res = 0;

        for(int i = 1; i < 13; i++) {
            LocalDate current = LocalDate.of(2024, i, 1);
            starts[current.getDayOfWeek().getValue() - 1]++;
        }

        for(int i = 0; i < 6; i++) {
            if(starts[i] > res) {
                res = starts[i];
            }
        }

        System.out.println("Der Wochentag, der am häufigsten der erste des Monats war ist: ");

        switch(res) {
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            case 4:
                System.out.println("Donnerstag");
                break;
            case 5:
                System.out.println("Freitag");
                break;
            case 6:
                System.out.println("Samstag");
                break;
            case 7:
                System.out.println("Sonntag");
                break;
            default:
                System.out.println("Ich glaub dafür gibt es ne bib-Funktion");
        }
    }
}
