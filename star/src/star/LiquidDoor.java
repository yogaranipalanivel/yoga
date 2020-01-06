package star;

public class LiquidDoor extends Door {
	 private float flowQuotient;

		public LiquidDoor(String doorName, float flowQuotient) {
			super(doorName);
			this.flowQuotient = flowQuotient;
		}
 public float getFlowQuotient() {
		return flowQuotient;
	}

	public void setFlowQuotient(float flowQuotient) {
		this.flowQuotient = flowQuotient;
	}
	public void display2() {
		int power = 0;
        int a = 2,j,k,m=3;
             power=(int)Math.pow(2,2);
             int x = power -1;
             System.out.print(x+" ");
        for(j=2;j<=flowQuotient;)
        {
           
            for(k=2;k<=m-1;k++)
            {
                if(m%k==0)
                {
                    break;
                }
            }
        
            if(k==m)
            {
            power=(int)Math.pow(2,m);
            int b = power -1;
               System.out.print(b+" ");
            j++;
            }
            m++;
            }

	}
}

