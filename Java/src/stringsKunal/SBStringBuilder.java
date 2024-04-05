package stringsKunal;

public class SBStringBuilder {

	public static void main(String[] args) {
     StringBuilder builder = new StringBuilder();
     for(int i =0 ; i<26; i++) {
    		char ch = (char)('a'+i);
    		builder.append(ch);
    	
    	}
       builder.reverse();
       System.out.println(builder);
       builder.delete(0, 1);
       System.out.println(builder);
       builder.replace(0 ,1	, "f");
       System.out.println(builder);
	}

}
