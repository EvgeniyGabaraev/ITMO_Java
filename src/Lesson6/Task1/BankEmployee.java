package Lesson6.Task1;

public class BankEmployee extends Human{
    private String bank;
    public BankEmployee (String name, String surname, String bank) {
        super(name, surname);
        this.bank = bank;
    }
    public String getBank(){
        return bank;
    }

    @Override
    public void getInfo() {
        System.out.println("Имя: " + super.getName());
        System.out.println("Фамилия: " + super.getSurname());
        System.out.println("Название банка: " + getBank());
    }

}
