class MyNumber
{
 	private int number;
 	MyNumber()	//Default Constructor set Instance variable to 0
 	{
   		number=0;
 	}

 	MyNumber(int number)	//Number is initialized by Parameterized Cnstructor
 	{  
    		this.number=number;
 	} 

	 void isnegative()	//print if number is negetive
	 {
     		if(number<0)
    			System.out.println("Number is Negative");
 	}
 
	 void ispositive()	//print if number is positive
	 {
	    if(number>0)
		   System.out.println("Number is positive");
	 }

	 void isZero()		//print is number is 0
	 {
	   if(number== 0)
		   System.out.println("Number is zero");
	 }

	 void isodd()		//print if number is odd
 	{
  		if(number%2!=0)
   			System.out.println("Number is odd");

 	}
	
	void iseven()		//Print if number is even
 	{
		  if(number%2==0)
			   System.out.println("Number is even");

	 }

	
		 public static void main(String args[])
		  {
			   int res;
			   res=Integer.parseInt(args[0]);	//take args[1] value convert to int and assign to re
			   MyNumber m=new MyNumber(res);
			   if(args.length==1)
			   {
			      m.isnegative();
			      m.ispositive();
			      m.isZero();
			      m.iseven();
			      m.isodd();
			   }
			   else{
			        System.out.println("Arguments not valid");
			}
		}
  	}



