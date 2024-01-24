
	import java.text.*;
	public class Sales extends Employee{
		private double sales;
		
		public Sales(String id,String name,double salary,double sales) {
			super(id,name,salary);
			this.sales=sales;	
		}
		public Sales(String id,String name, double sales) {
			super(id,name);
			this.sales=sales;
		}
		public double getCommission() {
			if(this.sales<10000) {
				return 0;
			}
			if(this.sales<50000) {
				return (this.sales-10000)*10/100;
			}
			return (this.sales-50000)*15/100;
			}
		public String toString() {
			DecimalFormat frm=new DecimalFormat("#,###.00");
			return super.getName()+" ("+super.getId()+") "+"get commission "+frm.format(getCommission()) +" B.";
		}
	
}
