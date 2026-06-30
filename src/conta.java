public class conta {

    private double saldo; //var privadas
    private double chequeEspecial;
    private double usadoChequeEspecial;

    public conta(double depositoInicial) { //construtor

        saldo = depositoInicial;

        if (depositoInicial <= 500) {
            chequeEspecial = 50;
        } else {
            chequeEspecial = depositoInicial * 0.5;
        }

        usadoChequeEspecial = 0;
    }

    public void consultarSaldo() {
        System.out.println("Saldo: R$ " + saldo);
    }

    public void consultarCheque() {
        System.out.println("Cheque especial: R$ " + chequeEspecial);
    }

    public void depositar(double valor) {

        saldo += valor;

        if (usadoChequeEspecial > 0) {

            double taxa = usadoChequeEspecial * 0.20;

            if (saldo >= taxa) {
                saldo -= taxa;
                System.out.println("Taxa pelo uso do cheque especial: R$ " + taxa);
            }

            usadoChequeEspecial = 0;
        }

        System.out.println("Depósito realizado!");
    }

    public void sacar(double valor) {

        if (valor > saldo + chequeEspecial) {
            System.out.println("Saldo insuficiente.");
            return;
        }

        saldo -= valor;

        if (saldo < 0) {
            usadoChequeEspecial = Math.abs(saldo); //transforma número negativo em positivo.
        }

        System.out.println("Saque realizado!");
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public void pagarBoleto(double valor) {

        if (valor > saldo + chequeEspecial) {
            System.out.println("Saldo insuficiente.");
            return;
        }

        saldo -= valor;

        if (saldo < 0) {
            usadoChequeEspecial = Math.abs(saldo);
        }

        System.out.println("Boleto pago!");
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public void verificarChequeEspecial() {

        if (usadoChequeEspecial > 0) {
            System.out.println("A conta está utilizando o cheque especial.");
            System.out.println("Valor utilizado: R$ " + usadoChequeEspecial);
        } else {
            System.out.println("A conta NÃO está utilizando o cheque especial.");
        }

    }
}