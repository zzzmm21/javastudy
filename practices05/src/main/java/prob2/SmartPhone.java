package prob2;

public class SmartPhone extends MusicPhone {
	@Override
	public void execute ( String function ) {
	      if (function.equals("음악") ) {
	          playMusic();
	          return;
	      }
	      
	      super.execute( function );
	}

	  private void playMusic(){
	    System.out.println("다운로드해음악재생");
	  }

}