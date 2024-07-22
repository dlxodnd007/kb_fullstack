package afternoon.speaker.set;

public class Speaker {
    private int volume;
    private int Max_volume = 100;
    private int Min_volume = 0;

    public Speaker() {
        this.volume = 20;
    }

    public void volumeUp() {
        if (this.volume == Max_volume) {
            System.out.println("더 이상 볼륨 조절이 불가능합니다");
        } else {
            this.volume++;
            getVolume();
        }
    }

    public void volumeDown() {
        if (this.volume == Min_volume) {
            System.out.println("더 이상 볼륨 조절이 불가능합니다");
        } else {
            this.volume--;
            getVolume();
        }
    }

    public void volumeMute() {
        this.volume = 0;
        System.out.println("스피커가 Mute 되었습니다");
    }
    
    public void getVolume() {
        System.out.println("현재 볼륨은 "+this.volume+"입니다.");
    }
}
