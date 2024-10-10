package TUTORIAL_3;
public class prime_noUsingWhile {
	public static void main(String[] args){
		int i,j,temp=1;
		System.out.println("THE PRIME NUMBERS BETWEEN 1 AND 100 ARE AS FOLLOWS:");
	    for(i=2;i<=100;i++) {
	    	temp=1;
	    	for(j=2;j<=i/2;j++) {
	    		if (i%j==0){
	    			temp=0;
	    			break;
	    			}}
	    if(temp==1) {
	    	System.out.println(i);
	    	}}}}
