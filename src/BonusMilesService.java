public class BonusMilesService {
    public int calculate(int ticketPrice){
        int oneMileCost = 20;
        return ticketPrice / oneMileCost;
    }
}
