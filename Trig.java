import java.io.*;
import java.util.*;
public class Trig {
  public static void main(String[] args) throws IOException{
    BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Total number of questions: ");
    int questions = Integer.parseInt(myReader.readLine());
    System.out.println("---------------------------------");
    Scanner s = new Scanner(new File("Trig.txt"));
    ArrayList<String> list = new ArrayList<String>();
    String output = "";
    int countWrong = 0;
    while (s.hasNext()){
        list.add(s.next());
    }
    s.close();
    Random randomGenerator = new Random();
    for (int i = 0; i < questions; i++){
      int index = randomGenerator.nextInt(48)+ 1 ;
      String[] result = list.get(index).split(",", 3);
      System.out.println(result[0]);
      String ans = myReader.readLine();
      if (ans.equals("" + result[1])){
        System.out.println("Correct!");
      } else {
        System.out.println("Incorrect");
        output += (result[0] + " --> Answer: " + result[1] + "\n");
        countWrong++;
      }
      if (i != questions - 1){
      System.out.println("---------------------------------");
    }
    //  System.out.println(list.get(index));
    }
    System.out.println("---------------------RESULTS--------------------------");
    System.out.println("You got " + (questions - countWrong) + " out of " + questions);
    System.out.println("------------------------------------------------------");
    System.out.println("Here are you questions you got wrong:");
    System.out.println(output);
    // System.out.println(list);

    //System.out.println(a.readData());
  }
/*
  public List<String[]> readData() throws IOException {
    int count = 0;
    String file = "Trig.txt";
    List<String[]> content = new ArrayList<>();
    try(BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line = "";
        while ((line = br.readLine()) != null) {
            content.add(line.split(","));
        }
    } catch (FileNotFoundException e) {
      //Some error logging
    }
    return content;
  }
*/
}
