package _06_vault;

public class VaultRunner {
	public static void main(String[] args) {
		
		Vault vault = new Vault();
		for(int code = 1000001; code>=0; code--) {
			boolean answer = vault.tryCode(code);
			System.out.println(answer + " " + code);
			
			if ( answer == true ) {
				code = -1;
			}
		}
	}
}
