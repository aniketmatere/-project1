import java.util.*;

public class Theatre {
    private String name;
    List<Seat> seats;

    public Theatre(String name, int totalRows, int seatPerRows) {
        this.name = name;
        this.seats = new ArrayList<>();

        char ch='A';
        for(int i=0; i<totalRows; i++){
            for(int j = 1; j<= seatPerRows; j++){
                seats.add(new Seat(""+ch+j));
            }
            ch++;
        }
    }

    public void reserveSeat(String seatNo){
        Seat seat = new Seat(seatNo);

        if(seats.contains(seat)){
            int index = seats.indexOf(seat);
            Seat seat1 = seats.get(index);
            if(seat1.reserveSeat())
                System.out.println("Seat is reserved");
            else
                System.out.println("Seat already reserved");
        }else {
            System.out.println("Invalid Seat");
        }
    }

    public void printSeats(){
        for(Seat seat : seats){
            System.out.println(seat);
        }
    }
}
