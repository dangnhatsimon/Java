import java.util.Arrays;

public class Newsfeed {
  
  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  int[] views = {0, 0, 0, 0};
  String[] favoriteArticles;
  
  public Newsfeed(){
    // Initialize favoriteArticles here:
    favoriteArticles = new String[10];
  }
  
  public void setFavoriteArticle(int favoriteIndex, String newArticle){
    // Add newArticle to favoriteArticles:
    favoriteArticles[favoriteIndex] = newArticle;
    
  }

  public int getNumTopics(){
    return topics.length;
  }
    
  public static void main(String[] args){
    Newsfeed sampleFeed = new Newsfeed();
    
    sampleFeed.setFavoriteArticle(2, "Humans: Exterminate Or Not?");
    sampleFeed.setFavoriteArticle(3, "Organic Eye Implants");
    sampleFeed.setFavoriteArticle(0, "Oil News");
    
    System.out.println(Arrays.toString(sampleFeed.favoriteArticles));
    System.out.println("The number of topics is "+ sampleFeed.getNumTopics());
  }
}


// import java.util.Arrays;

// public class Newsfeed {
  
//   String[] topics;
  
//   public Newsfeed(String[] initialTopics) {
// 		topics = initialTopics;
//   }
  
//   public static void main(String[] args) {
// 		Newsfeed feed;
//     if (args[0].equals("Human")) {
      
//       //topics for a Human feed:
//       String[] humanTopics = {"Politics", "Science", "Sports", "Love"};
// 			feed = new Newsfeed(humanTopics);
      
//     } else if(args[0].equals("Robot")) {
      
//       //topics for a Robot feed:
//       String[] robotTopics = {"Oil", "Parts", "Algorithms", "Love"};
//       feed = new Newsfeed(robotTopics);
      
//     } else {
//       String[] genericTopics = {"Opinion", "Tech", "Science", "Health"};
//       feed = new Newsfeed(genericTopics);
//     }
        
//     System.out.println("The topics in this feed are:");
//     System.out.println(Arrays.toString(feed.topics));
//   }
// }
