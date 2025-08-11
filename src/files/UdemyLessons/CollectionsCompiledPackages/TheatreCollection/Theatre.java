package files.UdemyLessons.CollectionsCompiledPackages.TheatreCollection;

import org.jetbrains.annotations.NotNull;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Theatre {

    static class Seat implements Comparable<Seat> {
        private final String seatNo;
        private boolean reserved;

        public Seat(int seatNo, char rowChar) {
            this.seatNo = "%c%03d".formatted(rowChar, seatNo);
        }
        @Override
        public String toString() {
            return seatNo;
        }

        @Override
        public int compareTo(@NotNull Theatre.Seat o) {
            return seatNo.compareTo(o.seatNo);
        }
        public void reserve() {
            this.reserved = true;
        }
    }
    private final String theatreName;
    private final int seatsPerRow;
    private final NavigableSet<Seat> seats;

    public Theatre(int rows,int totalSeats, String theatreName) {
        this.seatsPerRow = totalSeats/rows;
        this.theatreName = theatreName;

        seats = new TreeSet<>();
        for (int i = 0; i < totalSeats; i++) {
            char rowChar = (char) (i / seatsPerRow + (int) 'A');
            int seatInRow = i % seatsPerRow + 1;
            seats.add(new Seat(seatInRow, rowChar));
        }
    }
        public void printSeatMap() {
            String separatorLine = "-".repeat(90);
            System.out.printf("%1$s%n%2$s Seat Map%n%1$s%n", separatorLine, theatreName);

            int index = 0;
            for (Seat s : seats) {
                System.out.printf("%-8s%s",
                        s.seatNo + (s.reserved ? "(●)" : ""),
                        ((index++ + 1) % seatsPerRow == 0) ? "\n" : "");
            }
    }
    public void reserveSeat(String seatNo) {
        for (Seat seat : seats) {
            if (seat.seatNo.equalsIgnoreCase(seatNo)) {
                seat.reserve();
                System.out.println("Seat " + seatNo + " reserved successfully.");
                return;
            }
        }
        System.out.println("Seat " + seatNo + " not found.");
    }
}
