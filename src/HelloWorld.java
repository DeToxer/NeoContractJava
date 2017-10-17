import AntShares.SmartContract.Framework.FunctionCode;
import org.neo.smartcontract.framework.services.neo.Storage;
import org.neo.smartcontract.framework.SmartContract;
import org.neo.smartcontract.framework.services.system.ExecutionEngine;

public class HelloWorld extends SmartContract{

    public static byte[] Main(String[] args) {
        Storage.put(Storage.currentContext(),"secret", "Hello world");
        return Storage.get(Storage.currentContext(), "secret");
    }
}