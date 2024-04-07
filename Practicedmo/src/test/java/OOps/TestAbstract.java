package OOps;

public abstract class TestAbstract {
	
	
		private int testvalue;
		
		public  void testSum()
		{
			sum(10, 20);
		}
		
		private void sum(int i, int j) {
			// TODO Auto-generated method stub
			
		}

		public int getValue()
		{
			return this.testvalue;
			
		}
		
		public void setValue(int value)
		{
			testvalue=value;
			
		}
		
		public abstract void test();
		
		public abstract void test1();
		
		public abstract void test2();



}
