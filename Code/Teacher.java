public class Teacher extends Person 
{
    private String subject;
    

    public Teacher(String name, int age, String subject) 
    {
        super(name, age);
        this.subject = subject;
    }

    public void teach() 
    {
        System.out.println(name + " is teaching " + subject);
    }

    @Override
    public void work() 
    {
        System.out.println(name + " is preparing lessons");
    }
}

