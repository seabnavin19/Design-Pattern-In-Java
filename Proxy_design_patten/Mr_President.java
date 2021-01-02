package Design_pattern.Proxy_design_patten;

public class Mr_President {
    public static void main(String[] args) {
        ProxyFile docFile= new ProxyFile();
        docFile.ReadStudentInfo();
        docFile.SeeHighestScore();
    }
}
