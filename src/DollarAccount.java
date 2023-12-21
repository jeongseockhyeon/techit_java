public class DollarAccount extends BankAccount {

    DollarAccount(int bankCode, int accountNo, String owner, int balance, int password, boolean isDormant) {
        super(bankCode, accountNo, owner, balance, password, isDormant);
    }

    //오버로딩 => 부모 클래스에서 상속받은 베멋드에서 파라미터를 변겅
    //새로운 메서드 정의!
    void inquiry(double currencyRate){}

    //오버라이딩 => 부모 클래스에서 상속받은 메서드의 내용 변경
    //자식 클래스의 상황에 맞게

    public void deposit(){
        // 중괄호 내 내용을 변경
    }
}
