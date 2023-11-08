package oops.inheritance;

public class Child extends Parent{
    private String university;

    Child ()
    {

    }

    Child(String university,String name,String number,String dob,String address) {
        super(name,number,dob,address);
        this.university=university;
    }

    public String getUniversity()
    {
        return university;
    }

    @Override
    public String getDob() {
        return super.getDob();
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
