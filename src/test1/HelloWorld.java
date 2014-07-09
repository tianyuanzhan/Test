/**
 * This is my first java p.
 * @author_tyzhang
 */
package test1;

public class HelloWorld {

	//取得子串和改变字符串
	public void subString(String a){
		
		System.out.print("原字符串:"+ a + "\n");
		//得到子字符串
		String s = a.substring(0, 8);
		System.out.print("子串:"+s + "\n");	
		//改变字符串
		System.out.print(a.substring(0, 3) + "p!"+ "\n");		
		
	}
	
	public void eqString(String str1, String str2){
		if(str1.equals(str2)){
			System.out.print("Equal!");
			
		}
		else{
			System.out.print("Not equal!");
	
		}
		
	}
	
	  public int jieCheng(int n){
		    int j = 1;
		    int result = 0;
		    for(int i=1;i<=n;i++){
		    	j=j*i;
		    	result+=j;	    	
		    }
		    
		    return result;		    
		    }
	  
	  public int sum(int n){  //sum=1+2+3+..n
		  int sum =0;
		  for(int i=1;i<=n;i++ )
		  {
			  sum+=i;
		  }
		  
		  return sum;
	  }
	  
	  public int sum1(int n){  //sum=1+3+5+..n
		  int sum =0;
		  for(int i=1;i<=n;i+=2 )
		  {
			  sum+=i;
		  }
		  
		  return sum;
	  }
	  
	  public void zhiShu(int n,int t){  //n以内前t个质数
          int m=0;
		  for(int i=2;i<=n;i++ ){
			  for(int j=2;j<=i;j++){
				  if(i%j!=0){
					 continue;
					 
				  }
				  else {
					  if(i==j){
						  System.out.print("\n"+i);
					
						  m++;
					  }
					  else{
						  break;
					  }					  				
				  }				  				  								  				  
			  }
			  
			  if(m==t){
				  break;
				  
			  }		  
			  
		  }
			  
	  }
	  
	  
			
	//main()函数，程序入口	
	public static void main(String[] args){
		String test1 = "hello World!";
		String test2 = "clo World!";
		
	    HelloWorld a = new HelloWorld();	    
	    a.subString(test1);
	    a.eqString(test1,test2);
	    
	    int n1 = test1.compareTo(test2);
	    System.out.print("\n"+n1);
	    
	    boolean b1 = test1.endsWith(test2);
	    System.out.print("\n"+b1);
	    
	    boolean b2 = test1.equalsIgnoreCase("Hello World!");
	    System.out.print("\n"+b2);
	    
	    int n2 = test1.indexOf(test2);
	    System.out.print("\n"+n2);
	    
	    int n3 = test1.length();
	    System.out.print("\n"+n3);
	    
	    String str1= test1.replace("l","a");
	    System.out.print("\n"+str1);
	    
	
	    rose Rose =new rose();

	    Rose.Price();
	    
	    int result = a.jieCheng(4);
	    
	    
	    int result1 = a.sum(5);
	    System.out.print("\n"+result1);
	    
	    int result2 = a.sum1(5);
	    System.out.print("\n"+result2);
	    
	    a.zhiShu(100,10);
	    
	    Point p1 =new Point(1.0,2.0,3.0);
	    Point p2 =new Point(2,3,4);
	    p1.setX(3.5);
	    p1.setY(4.5);
	    p1.setZ(5.5);
	    double x1=p1.getX();
	    
	    System.out.print("\n"+x1);
	    
	    double d1=p1.getDistance(p2);
	    System.out.print("\n"+d1);
	    	    	
	}

}
