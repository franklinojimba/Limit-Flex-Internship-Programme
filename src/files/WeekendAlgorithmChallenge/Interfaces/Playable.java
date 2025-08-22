package files.WeekendAlgorithmChallenge.Interfaces;

public interface Playable {
    abstract void play();
}
class Guitar implements Playable {

    @Override
    public void play() {
        System.out.println("The Guitar is playing!!");
    }
}
class Piano implements Playable {

    @Override
    public void play() {
        System.out.println("The Piano is playing!!");
    }
}

