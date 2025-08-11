package files.UdemyLessons.CollectionsCompiledPackages.TheatreCollection;

public class BookingAgent {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int rows  = 10;
        int totalSeats = 100;
        Theatre NYDumbo = new Theatre(rows, totalSeats, "NYDumbo");
        NYDumbo.reserveSeat("A008");
        NYDumbo.reserveSeat("B006");
        NYDumbo.printSeatMap();
    }
}
