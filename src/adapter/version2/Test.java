package adapter.version2;

/**
 * 这里通过一个翻译者,使得中国人说出了英文,这里的中国人就是被适配者,写一个版本将会看到类图和定义
 * 其实这个适配器模式还是很好理解的.
 * 请看下一个版本
 * 
 * @author 黄二狗
 *
 */

public class Test {
  public static void main(String[] args) {
		SpeakEnglish american = new American();
		SpeakEnglish canadian = new Canadian();
		SpeakEnglish translator = new Translator(new Chinese());
		
		american.speakEnglish();
		canadian.speakEnglish();
		translator.speakEnglish();
		
}
}
 