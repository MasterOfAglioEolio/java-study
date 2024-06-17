package oop_6;

class MyTv{
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME=100;
    final int MIN_VOLUME=0;
    final int MAX_CHANNEL=100;
    final int MIN_CHANNEL=1;

    void turnOnOff(){
        // isPowerOn 값이 true면 false로, false면 true로
        if(isPowerOn==true){
            isPowerOn=false;
        }
        else{
            isPowerOn=true;
        }
    }

    void volumeUp(){
        // volume 값이 max보다 작을 때만 1증가
        if(volume<MAX_VOLUME){
            volume+=1;
        }
    }

    void volumeDown(){
        // volume 값이 min보다 클 때만 1감소
        if(volume>MIN_VOLUME){
            volume-=1;
        }
    }

    void channelUp(){
        // (4) channel의 값을 1 증가시킨다
        // 만일 channel이 MAX_CHANNEL 이면, channel의 값을 MIN CHANNEL로 바꾼다.
        if(channel<MAX_CHANNEL){
            channel+=1;
        }
        else if(channel==MAX_CHANNEL){
            channel=MIN_CHANNEL;
        }


    }

    void channelDown(){
        // (5) channel1의 값을 감소시킨다.
        // 만일 channel 이 MIN이면 , channel 값을 MAX로 바꾼다.
        if(channel>MIN_CHANNEL){
            channel-=1;
        }
        else if(channel==MIN_CHANNEL){
            channel=MAX_CHANNEL;
        }
    }
}

public class oop6_19 {
    public static void main(String[] args) {
        MyTv t=new MyTv(); // 생성자

        t.channel=100;
        t.volume=0;
        System.out.println("CH:"+t.channel+",VOL:"+t.volume);

        t.channelDown();
        t.volumeDown();
        System.out.println("CH:"+t.channel+",VOL:"+t.volume);

        t.volume=100;
        t.channelUp();
        t.volumeUp();
        System.out.println("CH:"+t.channel+",VOL:"+t.volume);

    }
}
