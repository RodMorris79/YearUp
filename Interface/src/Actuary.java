public class Actuary implements ITaxPayer
{

	private double m_income = -1;
	private boolean m_donePayingTaxes = false;

	public Actuary (double income)
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
			System.out.println("Actuary has filed tax return.");
		}
		else 
		{
			System.out.println("Actuary needs to pay taxes before filing tax return.");
		}
	}
	
	public static void main(String[] args)
	{
	
		Actuary JamesSmith = new Actuary(180000);
		JamesSmith.PayTaxes(.15);
		JamesSmith.FileTaxReturn();
		

		NBAPlayer LouisWilliams = new NBAPlayer(2000000);
		LouisWilliams.PayTaxes(.42);
		LouisWilliams.FileTaxReturn();
		

		ProjectDirector RobertGriffin = new ProjectDirector(350000);
		RobertGriffin.PayTaxes(.35);
		RobertGriffin.FileTaxReturn();
		
		TaxAuditor sean = new TaxAuditor();
		sean.Audit(JamesSmith);
		sean.Audit(LouisWilliams);
		sean.Audit(RobertGriffin);

	}
}