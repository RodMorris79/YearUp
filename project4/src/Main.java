
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account savingsAccount = new Account(1921491, "Savings", 1972492);
		savingsAccount.UpdateAmountSecurely(1244, "admin");
		savingsAccount.UpdateAmountSecurely(0, "theif");
		savingsAccount.UpdateAmountSecurely(0, "null");
		savingsAccount.UpdateAmountSecurely(0, null);
		savingsAccount.UpdateAmountSecurely(0, "");
		//savingsAccount.m_amount = 0;
		System.out.println("Update Amount in Account Id " + savingsAccount.GetAccountId() + " to " + savingsAccount.GetAmount());
		
	}

}
