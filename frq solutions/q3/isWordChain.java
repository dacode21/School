public boolean isWordChain(){
    for(int i =1; i<wordList.size(); i++){
      if(wordList.get(i).indexOf(wordList.get(i-1)) == -1){
        return false;
      }
    }
    return true;
  }
