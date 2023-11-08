package oops.inheritance;

public class Parent {
   private String name;
   private String number;
   private String dob;
   private String address;
   Parent() {

   }
   Parent(String name,String number,String dob,String address) {
       this.name=name;
       this.number=number;
       this.dob=dob;
       this.address=address;
   }

   Parent(String name,String number) {
        this.name=name;
        this.number=number;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
