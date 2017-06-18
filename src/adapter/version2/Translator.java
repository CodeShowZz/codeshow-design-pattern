package adapter.version2;

/**
 * 翻译者实现人说英语接口,把中国人说的话翻译成了英文,其实这里的翻译者就是适配器
 * 请看Test类
 * @author 黄二狗
 *
 */ 
public class Translator implements SpeakEnglish {
   private Chinese chinese;
   
   public Translator(Chinese chinese) {
	   this.chinese = chinese;
   }

   		@Override
	public void speakEnglish() {
       chinese.speakChinese();
       System.out.println("翻译成功,中国人说:"+"Talk is cheap,show me the code!"); //假设这里是进行了翻译
}
   
   
}
