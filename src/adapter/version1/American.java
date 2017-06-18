package adapter.version1;

//美国人直接说英语
public class American implements SpeakEnglish {

	@Override
	public void speakEnglish() {
       System.out.println("美国人说英语");
	}

}
