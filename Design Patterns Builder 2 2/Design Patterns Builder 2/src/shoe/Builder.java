package shoe;

public interface Builder {
     Builder addSole();
     Builder addLaces();
     Builder addPolish();
     Shoe build();
}
