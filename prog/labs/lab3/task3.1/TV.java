
public class TV {

    private int tvSerial;
    private static int updateTvSerial = 1000;


    private static int MIN_CHANL = 1;
    private static int VOL_STEP = 5;
    private static int MIN_VOL = 25;
    private static int MAX_VOL = 100;

    private boolean powered;
    private int currentChannel = 1;
    private int currentVolume = 25;
    private int maxChnl = 10;

    public int getSerialNum(){
        return tvSerial;

    }

    public TV(int maxChnl) {
        this.maxChnl = maxChnl;
    }

    public TV() {
        this.maxChnl = 10;


        updateTvSerial++;
        tvSerial = updateTvSerial;

    }

    public int getVolume() {
        return currentVolume;
    }

    public boolean isPowered() {
        return powered;
    }

    public int getChannel() {
        return currentChannel;
    }

    public void setpower() {
        currentChannel = 1;
        currentVolume = 25;
        if (powered == true) {
            powered = false;
        } else {
            powered = true;
        }
    }

    public void channelup() {
        if (powered) {
            if (currentChannel + 1 > maxChnl) {
                throw new IllegalStateException("MAX REACHED!");
            }
            currentChannel++;
        } else {
            throw new IllegalStateException("TV OFF!");
        }
    }

    public void channeldwn() {
        if (powered) {
            if (currentChannel - 1 > MIN_CHANL) {
                throw new IllegalStateException("MIN REACHED!");
            }
            currentChannel--;
        } else {
            throw new IllegalStateException("TV OFF!");
        }
    }

    public void setChannel(int chnl) {
        if (!powered) {
            throw new IllegalStateException("TV OFF!");
        }
        if (chnl < MIN_CHANL || chnl > maxChnl) {
            throw new IllegalStateException("NO SUCH CHANNEL");
        }
        currentChannel = chnl;
    }

    public void volumeUP() {
        if (!powered) {
            throw new IllegalStateException("TV OFF!");
        }
        currentVolume += VOL_STEP;
        if (currentVolume > MAX_VOL) {
            currentVolume = MAX_VOL;
        }
    }

    public void volumeDwn() {
        if (powered) {
            if (currentVolume - 5 < MIN_VOL) {
                throw new IllegalStateException("MIN REACHED!");
            }
            currentVolume -= 5;
        } else {
            throw new IllegalStateException("TV OFF!");
        }
    }
}
