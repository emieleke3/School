package nl.saxion.oop.week1;

import nl.saxion.app.CsvReader;
import nl.saxion.app.SaxionApp;

import java.util.ArrayList;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1200, 600);
    }

    public void run() {
        ArrayList<Video> videos = new ArrayList<>();

        loadCSV(videos);

        int menuInput = -1;
        do {
            SaxionApp.clear();
            SaxionApp.printLine("***************************************");
            SaxionApp.printLine("* 1) Show watchlist ");
            SaxionApp.printLine("* 2) Watch video");
            SaxionApp.printLine("* 0) Exit program");
            SaxionApp.printLine("***************************************");

            SaxionApp.print("Please make a selection from the menu: ");
            menuInput = SaxionApp.readInt();

            SaxionApp.printLine();

            if (menuInput == 1) {

                showWatchList(videos);

                SaxionApp.pause();
            } else if (menuInput == 2) {
                showWatchList(videos);

                SaxionApp.printLine("Select a video between 1 - 14");
                int select = SaxionApp.readInt();

                SaxionApp.pause();
            } else {
                SaxionApp.printLine("Goodbye!");
            }

        } while (menuInput != 0);
    }

    public void loadCSV(ArrayList<Video> videos) {
        CsvReader reader = new CsvReader("D:\\Saxion\\Semester 3\\OOP\\Week1\\Exercise2\\youtubevideos.csv");
        reader.skipRow();

        while(reader.loadRow()) {
            Video video = new Video(
                    reader.getString(0),
                    reader.getString(1),
                    reader.getInt(3)
            );

            videos.add(video);
        }
    }

    public void showWatchList(ArrayList<Video> videos) {
        int i = 0;
        for(Video video : videos) {
            i++;
            SaxionApp.print(i + ") ");
            video.toStringWatched();
            SaxionApp.printLine();
        }
    }
}