import java.util.HashMap;

public class IDandPassword {

    HashMap<String,String>  logininfo = new HashMap<String, String>();

    IDandPassword (){
        logininfo.put("Bro","Pizza");
        logininfo.put("rasool","roti");
        logininfo.put("khan","dal");
    }

    protected HashMap getloginifo(){
        return logininfo;
    }
}
