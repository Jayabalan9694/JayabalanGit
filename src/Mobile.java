
public class Mobile {
	public void whileMethod() {
		int i=0;
		
		while(i>-5) {
			System.out.println(i);
			i--;
		}
		
		while(i<5) {
			System.out.println(i);
			i++;
		}

	}
	
private void myMobiless(String cases) {
switch (cases)  {
case "Redmi" :{
	System.out.println("My redmi mobile is 10,000");
	break;

}
case "Hawvai" :{
	System.out.println("My "+cases+" mobile is 17,000");
	break;
}
case "OnePlus" :{
	System.out.println("My "+cases+" mobile is 25,000 ");
	break;
}
case "Iphone" :{
	System.out.println("My "+cases+" mobile is 40,000");
	break;
}
case "BlackBerry" :{
	System.out.println("My "+cases+" mobile is 75,000");
	break;

}

}
}
public static void main(String[] args) {
	Mobile rate=new Mobile();
	rate.myMobiless("BlackBerry");
	rate.whileMethod();
			
}


}
