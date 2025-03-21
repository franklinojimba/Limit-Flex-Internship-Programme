package files.myProject;
enum TrafficColor{
    RED,
    YELLOW,
    GREEN;

    public void changeColor(){
        for (TrafficColor trafficColor : TrafficColor.values()){
            while (true){
                System.out.print(trafficColor.name()+" ");
            }
        }
    }
}
public class TrafficLights {
    public static void main(String[] args) {
        TrafficColor trafficColor = TrafficColor.YELLOW;
        trafficColor.changeColor();
    }

}
