
public class ProjectDirector implements ITaxPayer
{

	private double m_income = -1;
	private boolean m_donePayingTaxes = false;
	
	public ProjectDirector(double income)
	{
		setM_income(income);
	}

	public double getM_income() 
	{
		return m_income;
	}

	private void setM_income(double income) 
	{
		this.m_income = income;
	}

	public void PayTaxes (double taxRate)
	{
		if (!m_donePayingTaxes)
		{
		double taxes = taxRate * getM_income();
		double newIncome = getM_income() - taxes;
		
		setM_income(newIncome);
		m_donePayingTaxes = true;
		}
		else
		{
			System.out.println("Client has already paid taxes.");
		}
	}
	
	public void FileTaxReturn()
	{
		if (m_donePayingTaxes)
		{
			System.out.println("Project Director has filed tax return.");
		}
		else 
		{
			System.out.println("Project Director needs to pay taxes before filing tax return.");
		}
	}
			
}

