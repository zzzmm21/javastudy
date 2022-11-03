package prob2;

public class SmartPhone extends MusicPhone {
	@Override
	public void execute (String function) {
	      if ("앱".equals(function) ) {
	          playApp();
	          return;
	      }
	      
	      super.execute(function);
	}
	protected void playMusic(){
	    System.out.println("다운로드해서음악재생");
	}
	protected void playApp() {
		System.out.println("앱실행");
		
	}

}