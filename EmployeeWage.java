package Assi_eight;

public class EmployeeWage
{
	
	public static final int  IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	
	private final String company;
	private final int emprateperhour;
	private final int noofworkingdays;
	private final int maxhourpermonth;
	private int totalEmpWage;
	public EmployeeWage(String company,int empperratehour,int noofworkingdays,int maxhourpermonth)
	{
		this.company=company;
		this.emprateperhour=empperratehour;
		this.noofworkingdays=noofworkingdays;
		this.maxhourpermonth=maxhourpermonth;
		
	}
	
	public void ComputeEmpWage()
	{
		 
		int empHrs=0,totalEmpHrs=0;
		int totalWorkingDays=0;
		
		while(totalEmpHrs<=maxhourpermonth && totalWorkingDays<noofworkingdays)
		{
			totalWorkingDays++;
			int empCheck=(int) Math.floor(Math.random()*10)%3;
			switch(empCheck)
			{
			case IS_PART_TIME:
			empHrs=4;
			break;
			
			case IS_FULL_TIME:
				empHrs=8;
				break;
				
				default:
					empHrs=0;
					
			
			}
			totalEmpHrs+=empHrs;
			System.out.println("days:" +totalWorkingDays+ "Emp hrs:" +empHrs);
			
		}
		totalEmpWage=totalEmpHrs*emprateperhour;
	}
	
	public String toString()
	{
		return "Total emp wage for company " +company+" is "+totalEmpWage;
		
	}
	public static void main(String[] args) 
	{
	EmployeeWage ew=new EmployeeWage("Amozon", 20, 2, 10);
	ew.ComputeEmpWage();
	System.out.println(ew);
	}

}
