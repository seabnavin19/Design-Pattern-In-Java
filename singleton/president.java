package Design_pattern.singleton;

public class president {
    private static president presiden=null;
    private president(){};
    public static president getInstance(){
        if (presiden==null){
            presiden=new president();
        }
        return presiden;
    }
    public void show(){
        System.out.println("hi i am a president");
    }
}
