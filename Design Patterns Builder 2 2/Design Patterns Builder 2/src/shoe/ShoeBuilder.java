package shoe;

public class ShoeBuilder implements Builder{

    ShoeBuilder(){

    }

    @Override
    public Builder addSole() {
        System.out.println("Sole added to shoe");
        return this;
    }

    @Override
    public Builder addLaces() {
        System.out.println("Laces added to shoe");
        return this;
    }

    @Override
    public Builder addPolish() {
        System.out.println("Polish applied to shoe");
        return this;
    }

    @Override
    public Shoe build() {
        Shoe s=new Shoe();
        System.out.println("New shoe made!");
        return s;
    }
}
