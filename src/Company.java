public class Company {
    String brandName = "Apple";
    Company(){

        brandName = "Apple";
    }
    public static void main(String[] args) {
        Company c = new Company();
        System.out.println(c.brandName);
    }
}
