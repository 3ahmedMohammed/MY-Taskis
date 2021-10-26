public class TV {

    public int channel;
    public int volumeLevel;
    public boolean on;

    public TV() {
        channel = 1;
        volumeLevel = 1;
        on = false;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
        System.out.println("TV is off");
    }

    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;
        }
    }

    public void setVolume(int newVolume) {
        if (on && newVolume >= 1 && newVolume <= 7) {
            volumeLevel = newVolume;
        }
    }

    public void channelUp() {
        if (channel < 120) {
            channel++;
        }
    }

    public void channelDown() {
        if (channel > 1) {
            channel--;
        }
    }

    public void volumeUp() {
        if (volumeLevel < 7) {
            volumeLevel++;
        }
    }

    public void volumeDown() {
        if (volumeLevel > 1) {
            volumeLevel--;
        }
    }

    public void caseTV(){
        if (on) {
            System.out.println("TV is on");
            System.out.println("The current channel: " + channel);
            System.out.println("The current volume level: " + volumeLevel);
        }
        else
            turnOff();
    }
}
