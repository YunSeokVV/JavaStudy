package ch08.sec06;

public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

    default void setMute(boolean mute){
        if(mute){
            System.out.println("make volume 0");
            setVolume(MIN_VOLUME);
        } else{
            System.out.println("make volume not 0");
        }
    }

    //정적 메소드
    static void changeBattery(){
        System.out.println("Exchange remote bettery");
    }


}
