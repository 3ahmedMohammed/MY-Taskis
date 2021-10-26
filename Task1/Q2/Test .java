public class Test {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.turnOn();
        tv.setChannel(69);
        tv.setVolume(3);
        tv.caseTV();

        tv.channelDown();
        tv.volumeUp();
        tv.caseTV();
    }
}
