package net.ferderplays.cier;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Antivirus {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CIER | Enter the folder to search");
        JLabel logo_label = new JLabel("CIER");
        JLabel folder_label = new JLabel("Enter Folder: ");
        JTextField folder_dir = new JTextField("");
        JButton submit = new JButton("Scan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 2));
        frame.setSize(300, 100);
        frame.add(logo_label);
        frame.add(new JLabel());
        frame.add(folder_label);
        frame.add(folder_dir);
        frame.add(submit);
        frame.setVisible(true);
        submit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String current_dir = folder_dir.getText();
                String VERSION = "v1.0.0";
                JFrame frame = new JFrame("CIER | " + VERSION);
                JLabel logo_label = new JLabel("CIER");
                JLabel dir_label = new JLabel("Current Directory: " + current_dir);
                JLabel status_label = new JLabel("Status: ");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new GridLayout(3, 1));
                frame.add(status_label, JLabel.CENTER);
                frame.setSize(500, 500);
                frame.add(logo_label, JLabel.CENTER);
                frame.setLocationRelativeTo(null);
                frame.add(dir_label, JLabel.CENTER);
                frame.setVisible(true);
                File file = new File(current_dir);
                Integer linecount = 0;
                for (File f : file.listFiles()) {
                    BufferedReader br;
                    try {
                        br = new BufferedReader(new FileReader(f));
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.contains(
                                    "System.getProperty(\"user.home\") + \"/AppData/Roaming/discord/Local Storage/leveldb")) {
                                JFrame frame2 = new JFrame("CIER: !RED FLAG FOUND!");
                                JLabel label = new JLabel("<html>!RED FLAG FOUND!<br>FILE:" + file.getName()
                                        + "<br>LINE:"
                                        + linecount.toString() + "<br>TYPE: Discord token-logger alert!</html>");
                                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                frame2.setLocation(0, 0);
                                frame2.setSize(500, 100);
                                frame2.add(label);
                                frame2.setVisible(true);
                                status_label.setText("Status: POSSIBLE MALWARE");
                            }

                            if (line.contains(
                                    "System.setProperty(\"user.home\") + \"/AppData/Roaming/discordptb/Local Storage/leveldb\"")) {
                                JFrame frame2 = new JFrame("CIER: !RED FLAG FOUND!");
                                JLabel label = new JLabel("<html>!RED FLAG FOUND!<br>FILE:" + file.getName()
                                        + "<br>LINE:"
                                        + linecount.toString() + "<br>TYPE: DiscordPTB token-logger alert!</html>");
                                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                frame2.setLocation(0, 0);
                                frame2.setSize(500, 100);
                                frame2.add(label);
                                frame2.setVisible(true);
                                status_label.setText("Status: POSSIBLE MALWARE");
                            }

                            if (line.contains(
                                    "System.getProperty(\"user.home\") + \"/AppData/Roaming/discordcanary/Local Storage/leveldb\"")) {
                                JFrame frame2 = new JFrame("CIER: !RED FLAG FOUND!");
                                JLabel label = new JLabel("<html>!RED FLAG FOUND!<br>FILE:" + file.getName()
                                        + "<br>LINE:"
                                        + linecount.toString() + "<br>TYPE: DiscordCANARY token-logger alert!</html>");
                                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                frame2.setLocation(0, 0);
                                frame2.setSize(500, 100);
                                frame2.add(label);
                                frame2.setVisible(true);
                                status_label.setText("Status: POSSIBLE MALWARE");
                            }

                            if (line.contains(
                                    "System.getProperty(\"user.home\") + \"AppData/Local/BraveSoftware/Brave-Browser/User Data/Default/Local Storage/leveldb\"")) {
                                JFrame frame2 = new JFrame("CIER: !RED FLAG FOUND!");
                                JLabel label = new JLabel("<html>!RED FLAG FOUND!<br>FILE:" + file.getName()
                                        + "<br>LINE:"
                                        + linecount.toString() + "<br>TYPE: Brave Browser info-logger alert!</html>");
                                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                frame2.setLocation(0, 0);
                                frame2.setSize(500, 100);
                                frame2.add(label);
                                frame2.setVisible(true);
                                status_label.setText("Status: POSSIBLE MALWARE");
                            }

                            if (line.contains(
                                    "System.getProperty(\"user.home\") + \"/AppData/Local/Google/Chrome/User Data\"")) {
                                JFrame frame2 = new JFrame("CIER: !RED FLAG FOUND!");
                                JLabel label = new JLabel("<html>!RED FLAG FOUND!<br>FILE:" + file.getName()
                                        + "<br>LINE:"
                                        + linecount.toString() + "<br>TYPE: Chrome Browser info-logger alert!</html>");
                                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                frame2.setLocation(0, 0);
                                frame2.setSize(500, 100);
                                frame2.add(label);
                                frame2.setVisible(true);
                                status_label.setText("Status: POSSIBLE MALWARE");
                            }

                            if (line.contains(
                                    "System.getProperty(\"user.home\") + \"/AppData/Local/Microsoft/Edge/User Data\"")) {
                                JFrame frame2 = new JFrame("CIER: !RED FLAG FOUND!");
                                JLabel label = new JLabel(
                                        "<html>!RED FLAG FOUND!<br>FILE:" + file.getName() + "<br>LINE:"
                                                + linecount.toString()
                                                + "<br>TYPE: Microsoft-Edge Browser info-logger alert!</html>");
                                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                frame2.setLocation(0, 0);
                                frame2.setSize(500, 100);
                                frame2.add(label);
                                frame2.setVisible(true);
                                status_label.setText("Status: POSSIBLE MALWARE");
                            }

                            if (line.contains("HttpsURLConnection")) {
                                String connec = line.replace(" ", "").replace("HttpsURLConnection", "")
                                        .replace("openStream();", "");
                                String name = connec.substring(0, connec.indexOf("="));
                                String url = connec.substring(0, connec.indexOf("."));
                                JFrame frame2 = new JFrame("CIER: !RED FLAG FOUND!");
                                JLabel label = new JLabel(
                                        "<html>!RED FLAG FOUND!<br>FILE:" + file.getName() + "<br>LINE:"
                                                + linecount.toString()
                                                + "<br>TYPE: Connections!<br>VARNAME:"
                                                + name
                                                + "<br>URL: "
                                                + url
                                                + "</html>");
                                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                frame2.setLocation(0, 0);
                                frame2.setSize(500, 100);
                                frame2.add(label);
                                frame2.setVisible(true);
                                status_label.setText("Status: POSSIBLE MALWARE");
                            }
                            linecount++;
                        }
                    } catch (FileNotFoundException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    } catch (HeadlessException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    } catch (IOException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                }
            }
        });
    }
}