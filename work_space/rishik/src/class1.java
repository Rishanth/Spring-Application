import java.util.ArrayList;
import java.util.List;



public  class class1 
{

	static List ar=new ArrayList();
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, InterruptedException 
	{

	
		
          Thread t1= new Thread()
          {
        	  public void run()
        	  {
        		  while(true)
        		  {
        			
        			  ar.add(new Object());
        		  }
        	  }
          };

          Thread t2=new Thread()
          {
        	
        	  public void run()
        	  {
        		  while(true)
        		  {
        			  ar=new ArrayList(2);
        			  ar.add(new Object());
        			  ar.add(new Object());

        		  }
        	  }
          };
          
          t1.start();
          Thread.sleep(100);
          t2.start();
          }
		
		
		
	}

