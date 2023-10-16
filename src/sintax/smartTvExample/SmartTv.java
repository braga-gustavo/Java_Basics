package sintax.smartTvExample;

public class SmartTv {

    private Boolean isOn = false;
    private Integer channel = 0;
    private Integer volume = 50;

    public boolean turnOn() {
        isOn = !isOn;
        return isOn;
    }

    public Integer changeChannel(Integer channelToChange) {

        if (channelToChange != 0) {
            channel = channelToChange;
        } else {
            channel++;
        }
        return channel;
    }

    public void increaseVolume() {
        volume++;
    }

    public void decreaseVolume() {
        volume--;
    }

    public Boolean getIsOn() {
        return isOn;
    }

    public Integer getChannel() {
        return channel;
    }

    public Integer getVolume() {
        return volume;
    }

}
