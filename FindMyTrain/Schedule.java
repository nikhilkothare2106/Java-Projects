package FindMyTrain;


public class Schedule {

    private Train train;
    private Station sourceStation;
    private Station destinationStation;
    private String sourceDepartureTime;
    private String destinationArrivalTime;
    private Platform sourcePlatform;

    public Schedule(Train train, Station sourceStation, Station destinationStation,
                    String sourceDepartureTime, String destinationArrivalTime,
                    Platform sourcePlatform) {
        this.train = train;
        this.sourceStation = sourceStation;
        this.destinationStation = destinationStation;
        this.sourceDepartureTime = sourceDepartureTime;
        this.destinationArrivalTime = destinationArrivalTime;
        this.sourcePlatform = sourcePlatform;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Station getSourceStation() {
        return sourceStation;
    }

    public void setSourceStation(Station sourceStation) {
        this.sourceStation = sourceStation;
    }

    public Station getDestinationStation() {
        return destinationStation;
    }

    public void setDestinationStation(Station destinationStation) {
        this.destinationStation = destinationStation;
    }

    public String getSourceDepartureTime() {
        return sourceDepartureTime;
    }

    public void setSourceDepartureTime(String sourceDepartureTime) {
        this.sourceDepartureTime = sourceDepartureTime;
    }

    public String getDestinationArrivalTime() {
        return destinationArrivalTime;
    }

    public void setDestinationArrivalTime(String destinationArrivalTime) {
        this.destinationArrivalTime = destinationArrivalTime;
    }

    public Platform getSourcePlatform() {
        return sourcePlatform;
    }

    public void setSourcePlatform(Platform sourcePlatform) {
        this.sourcePlatform = sourcePlatform;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "train=" + train +
                ", sourceStation=" + sourceStation +
                ", destinationStation=" + destinationStation +
                ", sourceDepartureTime=" + sourceDepartureTime +
                ", destinationArrivalTime=" + destinationArrivalTime +
                ", sourcePlatform=" + sourcePlatform +
                '}';
    }
}
