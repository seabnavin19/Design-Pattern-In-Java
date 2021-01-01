package Design_pattern.Adapter_design_pattern;

public class SE_Assignment implements GooleDoc_File{
    @Override
    public void edit() {
        System.out.println("this file can be edit");
    }

    @Override
    public void share(String Name) {
        System.out.println("this file can be share to"+Name);
    }

    @Override
    public void comment() {
        System.out.println("this file can get comment");
    }
}
