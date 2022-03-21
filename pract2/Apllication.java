public class Apllication{
    public static void main(String arg []){

        Contract contract = new ContractImple();

        PrintTerms(contract);

    }

    public static void PrintTerms(Contract contract){

        contract.term1();
        contract.term2();
        contract.extendedTerm();

    }
}