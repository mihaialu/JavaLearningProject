package org.example.accessmodifiers.peopleevidence;

public class Person {

    public static boolean isHuman;
}
    public String firstname;

    protected String lastname;

    public final int ID;

    private int age;

    public boolean isRetired;

    public Person(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = id;
    }

    public Person(String firstName, String lastName, int id, int age, boolean isRetired) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = id;

        public void setAge(int enteredAge){
            if (enteredAge > 0 && enteredAge < 100){
                this.age = enteredAge;
            } else{
                System.out.println("The entered age is not valid, the property age is still empty");

                this.age = age;
        this.isRetired = isRetired;
    }

    public void setAge(int enteredAge){
                if (enteredAge > 0 && enteredAge < 100) {
                    this.age = enteredAge;
                } else {
                    System.out.println("The entered age is not valid, the property age is still empty");

                }

                public int getAge () {
                    return this.age;
                }
                public void printRetirementStatus () {
                    if (this.isRetired) {
                        System.out.println(firstName + "este la pensie");
                    } else{
                        System.out.println(firstName + " nu este la pensie");
                    }
                    }
                }
            }