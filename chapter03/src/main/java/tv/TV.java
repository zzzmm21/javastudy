package tv;

public class TV {
	private int channel; // 1~255 사이값을 가지게 하고 넘어 갈때는 라운딩 시킬것
	private int volume; //  0~100 사이값을 가지게 하고 넘어 갈때는 라운딩 시킬것
	private boolean power;
	
	public  TV(int channel,int volume , boolean power){
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	public void status() {
		System.out.println("TV[channel=" + channel + 
				", volume=" + volume +
				", power=" +(power ? "on":"off") + "]");
		
		
		
	}
	
	public void volume(int i) {
		// TODO Auto-generated method stub
		
	}
	public void channel(int i) {
		// TODO Auto-generated method stub
		
	}
}