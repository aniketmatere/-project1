import java.util.Objects;

public class Seat {
    private String seatNo;
    private boolean reserved;

    public Seat(String seatNo) {
        this.seatNo = seatNo;
        this.reserved = false;
    }

    public boolean reserveSeat(){
        if(reserved){
            return false;
        }
        reserved = true;
        return true;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatNo='" + seatNo + '\'' +
                ", reserved=" + reserved +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seat seat)) return false;

        return Objects.equals(seatNo, seat.seatNo);
    }

    @Override
    public int hashCode() {
        int result = seatNo != null ? seatNo.hashCode() : 0;
        result = 31 * result ;
        return result;
    }
}
