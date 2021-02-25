/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ismt.bank;

/**
 *
 * @author bikes
 */
public class Account {

    int accNo;
    String name;
    int amount;
    char accType;

    public Account() {
    }

    public Account(int accNo, String name, int amount, char accType) {
        this.accNo = accNo;
        this.name = name;
        this.amount = amount;
        this.accType = accType;
    }

    Account(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Account(int parseInt, int parseInt0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Account{" + "accNo=" + accNo + ", name=" + name + ", amount=" + amount + ", accType=" + accType + '}';
    }
    
    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public char getAccType() {
        return accType;
    }

    public void setAccType(char accType) {
        this.accType = accType;
    }

}
