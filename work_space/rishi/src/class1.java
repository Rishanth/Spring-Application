
public  class class1 
{

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException 
	{

		
		Class classy=Class.forName("class1");
		class1 cls= (class1) classy.newInstance();
	 	cls.new Example("thread1").start();
    	cls.new Example("thread2").start();

	}
	
	class Example extends Thread 
	{
		
		public volatile int val =1;
		public Example(String str)
		{
			
			super(str);
			
		}
		public void run()
		{
			for(int i=0;i<2;i++)
			{
				if(getName().compareTo("thread1")==0)
				{
					val=val+1;
					System.out.println("thread1"+val);
				}
				if(getName().compareTo("thread2")==0)
				{
					
				   System.out.println("thread2"+val);
				}
			}
		}
		
	}
}
