package Check;


public class check {
public static void main(String[]args) {
	String s="muzamil";
	int vowel=0;
  int cons=0;
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			vowel++;
		else
			cons++;
				
	}
	System.out.println("consonents are -->"+cons);
	System.out.println("vowels are -->"+vowel);
}
}
	


