public class WordChecker{
  private ArrayList <String> wordList;




  public boolean isWordChain(){
    for(int i =1; i<wordList.size(); i++){
      if(wordList.get(i).indexOf(wordList.get(i-1)) == -1){
        return false;
      }
    }
    return true;
  }


  public ArrayList<String> createList(String target){
    ArrayList<String> list = new ArrayList<String>();
      for(int i=0; i<wordList.size(); i++){
        if(wordList.get(i).substring(0, target.length()).equals(target)){
        list.add(wordList.get(i).substring(target.length()));
      }
    }
    return list;
  }
}
