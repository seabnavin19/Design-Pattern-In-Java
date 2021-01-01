package Design_pattern.Adapter_design_pattern;

public class FileAdapter implements GooleDoc_File{
    Pdf_File pdf_file;
    FileAdapter(Pdf_File pdf_file){
        this.pdf_file=pdf_file;
    }
    @Override
    public void edit() {
        pdf_file.CanEdit();
    }

    @Override
    public void share(String Name) {
    }

    @Override
    public void comment() {
        pdf_file.Cancomment();
    }
}
