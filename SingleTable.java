public class SingleTable{
    private int numSeats;
    private int height;
    private double value;

    public SingleTable(int seats, int heights, int values){
        numSeats = seats;
        height = heights;
        value = values;
    }

    public int getNumSeats(){
        return numSeats;
    }

    public void setNumSeats(int newNumSeats){
        numSeats = newNumSeats;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int newHeight){
        height = newHeight;
    }

    public double getViewQual(){
        return value;
    }

    public void setViewQual(double newValue){
        value = newValue;
    }

}