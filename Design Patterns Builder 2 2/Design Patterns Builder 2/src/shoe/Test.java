package shoe;

public class Test {

	public static void main(String[] args) {

		ShoeBuilder sb=new ShoeBuilder();
		Shoe s=sb.addSole().addLaces().addPolish().build();

		
		s.buyShoe();
		
		s.destroyShoe();
		
		s.washShoe();
		
		s.useShoe();
		
		s.buyShoe();

		
	}

}
