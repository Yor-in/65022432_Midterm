class Midterm_65022432 {
    public static void main(String[] args) {
        Product object0 = new Product();
        object0.setName("chair");
        object0.setPrice(500);
        object0.showDetails();

        System.out.println("*****************************************");

        Electronics object1 = new Electronics();
        object1.setName("Television");
        object1.setPrice(20000);
        object1.setBrand("Samsung");
        object1.setModel("Neo QLED");
        object1.showDetails();

        System.out.println("*****************************************");

        Smartphone object2 = new Smartphone();
        object2.setName("Iphone");
        object2.setPrice(40000);
        object2.setBrand("Apple");
        object2.setModel("Iphone 99");
        object2.setOperatingSystem("ios");
        object2.showDetails();

        System.out.println("*****************************************");

        Book object3 = new Book();
        object3.setName("OOP Programming");
        object3.setPrice(250);
        object3.setAuthor("John Doe");
        object3.setPages(300);
        object3.showDetails();
    }
}

class Product {
    protected String name;
    protected double price;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void showDetails(){
        System.out.println("Product Name : " + this.getName() + "\nProduct Price : " + this.getPrice());
    }
}

class Electronics extends Product {
    protected String brand;
    protected String model;

    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getModel(){
        return this.model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void showDetails(){
        super.showDetails();
        System.out.println("Brand : " + this.getBrand() + "\nModel : " + this.getModel());
    }
}

class Book extends Product{
    protected String author;
    protected int pages;

    public String getAuthor(){
        return this.author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getPages(){
        return this.pages;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    public void showDetails(){
        super.showDetails();
        System.out.println("Author : " + this.getAuthor() + "\nNumber of Pages : " + this.getPages());
    }
}

class Smartphone extends Electronics{
    protected String OperatingSystem;

    public String getOperatingSystem() {
        return this.OperatingSystem;
    }

    public void setOperatingSystem(String OperatingSystem){
        this.OperatingSystem = OperatingSystem;
    }

    public void showDetails(){
        super.showDetails();
        System.out.println("Operating System : " + this.getOperatingSystem());
    }
}