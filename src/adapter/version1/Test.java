package adapter.version1;

public class Test {
  public static void main(String[] args) {
	SpeakEnglish american = new American();
	SpeakEnglish canadian = new Canadian();
	Chinese chinese = new Chinese();
	
	american.speakEnglish();
	canadian.speakEnglish();
	chinese.speakChinese();
}
}
