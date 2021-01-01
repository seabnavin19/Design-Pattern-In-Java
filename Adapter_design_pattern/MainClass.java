package Design_pattern.Adapter_design_pattern;

public class MainClass {
    public static void main(String[] args) {
        Pdf_File khmer_book= new KhmerHis_book();
        FileAdapter adapter_khmerBook= new FileAdapter(khmer_book);
        adapter_khmerBook.comment();

    }
}
