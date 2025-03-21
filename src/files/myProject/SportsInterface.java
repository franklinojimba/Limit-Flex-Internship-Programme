package files.myProject;
interface Sport{
    public void play();
}
class Football implements Sport{
    public void play(){
        System.out.println("You are now playing FIFA.");
    }
}
class Basketball implements Sport{
    public void play(){
        System.out.println("You are now playing NBA.");
    }
}
public class SportsInterface {
    public static void main(String[] args) {
        Football football = new Football();
        football.play();

        Basketball basketball = new Basketball();
        basketball.play();
    }
}
