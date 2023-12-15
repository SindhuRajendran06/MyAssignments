package week1.day1assignment;

import week1.day2.Browser;

public class Mobile {
     void makeCall(String mobileModel,float mobileWeight) {
    System.out.println("The mobile model is "+mobileModel+ " , weighing " +mobileWeight+ " grams" );	 
     }
     void sendMsg(boolean isFullCharged,int mobileCost) {
System.out.println("Is it fully charged-" +isFullCharged+ " & Cost is " +mobileCost );    	 
     }
     
	public static void main(String[] args) {
		Mobile obj1=new Mobile();
	       obj1.makeCall("Samsung",0.3f);
	       obj1.sendMsg(true, 40000);
	       System.out.println("This is my Mobile");
	}

}
