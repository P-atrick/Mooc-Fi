import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
  private HashMap<String, String> words;

  public Dictionary() {
    words = new HashMap<String, String>();
  }

  public void add(String word, String translation) {
    words.put(word, translation);
  }

  public String translate(String word) {
    return words.get(word);
  }

  public int amountOfWords() {
    return words.size();
  }

  public ArrayList<String> translationList() {
    ArrayList<String> list = new ArrayList<String>();

    for (String key : words.keySet()) {
      list.add(key + " = " + words.get(key));
    }
    return list;
  }

}
