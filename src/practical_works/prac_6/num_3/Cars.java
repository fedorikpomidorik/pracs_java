package practical_works.prac_6.num_3;

public class Cars implements Nameable {
    String name;

    public Cars(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println(name);
    }
}
