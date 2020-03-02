package tmproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class Panel extends JPanel implements ActionListener {

    private JButton start;
    private JButton stop;
    private JButton reset;
    private JButton lap;
    private JLabel lapLabel;
    private JLabel timeLabel;
    private volatile Thread thread;
    private volatile boolean flag = false;
    private boolean started = false;

    Timer time;

    public Panel() {

        this.setLayout(new BorderLayout(5, 5));
        this.setBackground(Color.BLACK);

        JPanel subPanel = new JPanel();
        JPanel subPanel2 = new JPanel();
        subPanel2.setBackground(Color.BLACK);

        timeLabel = new JLabel("0:0:00.00", SwingConstants.CENTER);
        timeLabel.setForeground(Color.WHITE);
        timeLabel.setFont(new Font("Courier New", Font.BOLD, 40));

        this.add(timeLabel, BorderLayout.PAGE_START);


        lapLabel = new JLabel("Current Lap: 0:0:00.00", SwingConstants.CENTER);
        lapLabel.setForeground(Color.WHITE);
        lapLabel.setFont(new Font("Courier New", Font.BOLD, 20));
        subPanel2.add(lapLabel);


        start = new JButton();
        start.setText("Start");
        start.addActionListener(this);
        start.setBackground(Color.BLACK);
        start.setForeground(Color.WHITE);
        start.setFont(new Font("Courier New", Font.BOLD, 12));
        subPanel.add(start);


        stop = new JButton();
        stop.setText("Stop");
        stop.addActionListener(this);
        stop.setBackground(Color.BLACK);
        stop.setForeground(Color.WHITE);
        stop.setFont(new Font("Courier New", Font.BOLD, 12));
        subPanel.add(stop);


        reset = new JButton();
        reset.setText("Reset");
        reset.addActionListener(this);
        reset.setBackground(Color.BLACK);
        reset.setForeground(Color.WHITE);
        reset.setFont(new Font("Courier New", Font.BOLD, 12));
        subPanel.add(reset);


        lap = new JButton();
        lap.setText("Lap");
        lap.addActionListener(this);
        lap.setBackground(Color.BLACK);
        lap.setForeground(Color.WHITE);
        lap.setFont(new Font("Courier New", Font.BOLD, 12));
        subPanel.add(lap);

        this.add(subPanel2, BorderLayout.CENTER);
        this.add(subPanel, BorderLayout.PAGE_END);

        this.time = new Timer(0, 0, 0, 0, 1);
    }


    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == start) {
            if (!started) {
                start.setBackground(Color.GREEN);
                start.setBackground(Color.RED);

                thread = new Thread(new Runnable() {
                    public void run() {
                        while (!flag) {
                            final String timeNow = time.tick();
                            SwingUtilities.invokeLater(new Runnable() {
                                public void run() {
                                    timeLabel.setText(timeNow);
                                }
                            });
                        }
                    }
                });

                thread.start();
            }
            started = true;

        } else if (e.getSource() == stop) {
            if (started) {
                stop.setBackground(Color.GREEN);
                start.setBackground(Color.RED);
                flag = true;
                try {
                    thread.join();
                    started = false;
                    flag = false;
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }

        } else if (e.getSource() == reset) {
            if (!started) {
                stop.setBackground(Color.BLACK);
                start.setBackground(Color.BLACK);
            }
            timeLabel.setText(time.reset());

        } else if (e.getSource() == lap) {
            String lapTime = time.getTime();
            lapLabel.setText("Current Lap: " + lapTime);

        }
    }



}
