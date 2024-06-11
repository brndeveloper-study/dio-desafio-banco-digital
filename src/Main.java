import com.brndeveloper.banco.Banco;
import com.brndeveloper.banco.Cliente;
import com.brndeveloper.banco.contas.Conta;
import com.brndeveloper.banco.contas.ContaCorrente;
import com.brndeveloper.banco.contas.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Banco senna = new Banco("Senna");
        ContaCorrente cc = new ContaCorrente("Bruno", senna);
        cc.depositar(500);
        cc.imprimirExtrato();

        Cliente palloma = new Cliente("Pamela");
        ContaCorrente cc2 = new ContaCorrente(palloma, senna);
        cc.transferir(500, cc2);
        cc2.imprimirExtrato();
        cc.imprimirExtrato();
        palloma.mostrarBancosRegistrados();
        cc2.sacar(400);
        cc2.imprimirExtrato();

        Cliente fernando = new Cliente("Fernando");
        Banco zeon = new Banco("Zeon");

        ContaPoupanca cpp = new ContaPoupanca(fernando, zeon);
        cpp.imprimirExtrato();
        cpp.sacar(1000);
        cpp.imprimirExtrato();
        fernando.mostrarBancosRegistrados();
        zeon.mostrarContasRegistradas();

    }
}
