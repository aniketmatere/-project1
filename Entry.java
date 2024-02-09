public class Entry {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("MTF", 5, 5);
        theatre.printSeats();
        theatre.reserveSeat("A1");
        theatre.reserveSeat("A1");
        theatre.printSeats();

    }
}
