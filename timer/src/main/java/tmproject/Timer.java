package tmproject;

public class Timer {

    private int myHours = 0;
    private int myMinutes = 0;
    private int mySeconds = 0;
    private int myMilliseconds;
    public int myIncrement = 1;


    public Timer(int myHours, int myMinutes, int mySeconds, int myMilliseconds, int myIncrement) {
        super();
        this.myHours = myHours;
        this.myMinutes = myMinutes;
        this.mySeconds = mySeconds;
        this.myMilliseconds = myMilliseconds;
        this.myIncrement = myIncrement;
    }


    public String getTime() {
        String milliseconds = Integer.toString(myMilliseconds);
        String seconds = Integer.toString(mySeconds);
        String minutes = Integer.toString(myMinutes);
        String hours = Integer.toString(myHours);

        if (milliseconds.length() < 2) {
            milliseconds = "0" + milliseconds;
        }

        if (seconds.length() < 2) {
            seconds = "0" + seconds;
        }

        if (minutes.length() < 2) {
            minutes = "0" + minutes;
        }

        if (hours.length() < 2) {
            hours = "0" + hours;
        }

        return (hours + ":" + minutes + ":" + seconds + "." + milliseconds);
    }



    public void setTime(int h, int m, int s, int mi) {
        myHours = h;
        myMinutes = m;
        mySeconds = s;
        myMilliseconds = mi;
    }

    public String reset() {
        setTime(0, 0, 0, 0);
        String time = getTime();
        return time;
    }

    public void increment() {
        myMilliseconds += myIncrement;
        int i;
        if (myIncrement < 0) {
            i = -1;
        } else {
            i = 1;
        }
        if (myMilliseconds >= 100) {
            myMilliseconds = 0;
            mySeconds += myIncrement;
            if (mySeconds >= 60) {
                mySeconds = 0;
                myMinutes += myIncrement;
            }
            if (myMinutes >= 60) {
                myMinutes = 0;
                myHours += myIncrement;
            }
        }
    }


    public String tick(){
        increment();
        try {
            Thread.sleep(9);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String time = getTime();
        return time;
    }

}
