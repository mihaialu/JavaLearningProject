package org.example.methodstask;

public class ExecutionService {
    public static void main(String[] args) {
        Customer customer001 = new Customer();
        customer001.setName("Gabriela");
        customer001.setEmail(DataGeneratorUtil.getRandomEmai(prefix"gabriela+", emailDomain:"@gmail.com"));
        customer001.setAge(DataGeneratorUtil.getRandomInt(18, 100));

//        System.out.println(customer001.getName());
//        System.out.println(customer001.getEmail());
//        System.out.println(customer001.getAge());

        System.out.println(customer001.getTheObjectInformation());

        Customer customer002 = new Customer(name:"Anton", email:"Anton@gmail.com", DataGeneratorUtil.getRandomInt(18,100));
        System.out.println(customer002.getTheObjectInformation());

        System.out.println(DataGeneratorUtil.getRandomInt(limit:18));
        System.out.println(DataGeneratorUtil.getRandomEmail(emailDomain:"@gmail.com"));
        System.out.println(DataGeneratorUtil.getRandomEmail(prefix:"Andreea+", emailDomain:"@gmail.com");
    }
}