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
                SaxionApp.printLine();
                SaxionApp.printLine("Select a video between 1 - 14");

                markWatched(videos);
            } else {
                SaxionApp.printLine("Goodbye!");
            }

        } while (menuInput != 0);
    }

    public void loadCSV(ArrayList<Video> videos) {
        CsvReader reader = new CsvReader("C:\\Users\\emiel\\Documents\\GitHub\\School\\OOP\\Week1\\Exercise2\\youtubevideos.csv");
        reader.skipRow();

        while (reader.loadRow()) {
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
        for (Video video : videos) {
            i++;
            SaxionApp.print(i + ") ");
            video.toStringWatched();
            SaxionApp.printLine();
        }
    }

    public void markWatched(ArrayList<Video> videos) {
        int select = SaxionApp.readInt();
        switch (select) {
            case 1:
                videos.get(0).watch();
                break;
            case 2:
                videos.get(1).watch();
                break;
            case 3:
                videos.get(2).watch();
                break;
            case 4:
                videos.get(3).watch();
                break;
            case 5:
                videos.get(4).watch();
                break;
            case 6:
                videos.get(5).watch();
                break;
            case 7:
                videos.get(6).watch();
                break;
            case 8:
                videos.get(7).watch();
                break;
            case 10:
                videos.get(9).watch();
                break;
            case 11:
                videos.get(10).watch();
                break;
            case 12:
                videos.get(11).watch();
                break;
            case 13:
                videos.get(12).watch();
                break;
            case 14:
                videos.get(13).watch();
                break;
            case 15:
                videos.get(14).watch();
                break;
        }
    }

}