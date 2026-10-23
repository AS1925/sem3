public class JavaBean {
    public static void main(String[] args) {
        PersonBean p = new PersonBean();

        p.setName("sakthi");
        p.setAge(21);
        p.setAddress("Utg");

        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
        System.out.println("Address: " + p.getAddress());
    }
}