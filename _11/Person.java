package _11;

public record Person(String name, int age, String address) {

    public Person (String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\''
                ;
    }
}
