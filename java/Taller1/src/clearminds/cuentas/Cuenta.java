package clearminds.cuentas;

public class Cuenta {
	private String Id;
	private String Tipo;
	private double Saldo;

	public String getId() {
		return Id;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	public Cuenta(String Id) {
		this.Id = Id;
		this.Tipo = "A";
	}

	public Cuenta(String Id, String Tipo, double Saldo) {
		this.Id = Id;
		this.Tipo = Tipo;
		this.Saldo = Saldo;
	}

	public void Imprimir() {
		System.out.println("*********************");
		System.out.println("CUENTA");
		System.out.println("*********************");
		System.out.println("Número de cuenta: " + Id);
		System.out.println("Tipo: " + Tipo);
		System.out.println("Saldo: USD" + Saldo);
		System.out.println("*********************");
	}

	public void ImprimirConMiEstilo() {
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■■■■INFORMACION DE CUENTA■■■■■■■");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("Número de cuenta---------> " + Id+" ■■");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■■■■■Tipo------------> " + Tipo+" ■■■■■■■");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■■■Saldo----------> USD " + Saldo+" ■■■");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
	}

}