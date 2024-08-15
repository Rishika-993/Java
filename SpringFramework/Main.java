package SpringFramework;
// import SpringFramework.Mypojo;  

public class Main {
    public static void main(String[] args) {
        Mypojo p = new Mypojo();
        p.setId(1);
        p.setName("Ravi");
        p.setAddress("Delhi");

        System.out.println("Id: " + p.getId());
        System.out.println("Name: " + p.getName());
        System.out.println("Address: " + p.getAddress());
    }
}
