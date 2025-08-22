package files.WeekendAlgorithmChallenge.LambdaPractice;

public interface DefInterface {
    default int modify(int a, int b) {
        return a % b;
    }
}
