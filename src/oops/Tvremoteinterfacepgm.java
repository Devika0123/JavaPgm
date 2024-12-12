package oops;
interface TVRemote{
	public void poweron();
	public void poweroff();
	
	interface SmartTvRemote extends TVRemote{
		public void Search();
	}
	class TV implements SmartTvRemote{

		@Override
		public void poweron() {
			System.out.println("ON");
			
		}

		@Override
		public void poweroff() {
			System.out.println("OFF");
			
		}

		@Override
		public void Search() {
			System.out.println("YOUTUBE");
			
		}
		
	}




public class Tvremoteinterfacepgm {

	public static void main(String[] args) {
		TV ob=new TV();
		ob.poweron();
		ob.poweroff();
		ob.Search();
	}
		

	}

}

