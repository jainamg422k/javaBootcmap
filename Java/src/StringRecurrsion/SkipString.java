package StringRecurrsion;

public class SkipString {

	public static void main(String[] args) {
		System.out.println(skip("bccapplefg"));
		System.out.println(skipNotApple("bccapplefg"));

	}
	public static String skip(String up) {
		if(up.isEmpty()) {
			return up;
		}
		
		if(up.startsWith("apple")) {   // string starts with apple skip five char and consider 6th char from that;
			return skip(up.substring(5));
		}
		else {
			return up.charAt(0)+ skip(up.substring(1));
		}
		
	}
	
	public static String skipNotApple(String up) {
		if(up.isEmpty()) {
			return up;
		}
		
		if(up.startsWith("app") && !up.startsWith("apple")) {   // string starts with app but it  should not start with apple
			return skipNotApple(up.substring(3));
		}
		else {
			return up.charAt(0)+ skipNotApple(up.substring(1));
		}
		
	}

}
