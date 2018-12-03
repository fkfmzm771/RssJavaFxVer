package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Torrent Rss 검색기");
        primaryStage.setScene(new Scene(root, 1000, 700));
        primaryStage.show();
    }


    public static void main(String[] args) {


//		NyaaFeedParser parser = new NyaaFeedParser("https://nyaa.si/?page=rss&q=baki von 1080&c=0_0&f=0");
//		Nyaa_si_Feed feed = parser.readFeed();
//
//		try {
//
//			for (Nyaa_si_FeedMessage message : feed.getMessages()) {
//				parser.saveUrlList(new FileData(message.getTitle(), message.getLink()));
//				System.out.println(message);
//			}
//			parser.saveFile();
//		}catch (Exception e){
//			System.out.println("검색된 파일이 없습니다.");
//		}



        launch(args);
    }
}
