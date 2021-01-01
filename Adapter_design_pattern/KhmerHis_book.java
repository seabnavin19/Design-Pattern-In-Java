package Design_pattern.Adapter_design_pattern;

public class KhmerHis_book implements Pdf_File{

    @Override
    public void Copy() {
        System.out.println("this is file can be copy");
    }

    @Override
    public void Cancomment() {
        System.out.println("you can comment when you convert it to google doc");
    }

    @Override
    public void CanEdit() {
        System.out.println("you can edit when you convert it to gg doc");
    }
}
