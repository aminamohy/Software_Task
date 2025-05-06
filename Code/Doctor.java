public class Doctor extends Person 
{
    private String specialization;
    private String hospitalName;

    public Doctor(String name, int age, String specialization, String hospitalName) 
    {
        super(name, age);
        this.specialization = specialization;
        this.hospitalName = hospitalName;
    }

    @Override
    public void work() 
    {
        System.out.println(name + " is treating patients");
    }
}
