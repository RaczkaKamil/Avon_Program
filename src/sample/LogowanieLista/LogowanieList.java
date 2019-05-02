package sample.LogowanieLista;

public class LogowanieList {
    private String login;
    private String loginP = "dyta123";
    private String haslo;
    private String hasloP = "julinek0601";
    private boolean access = false;

    public boolean Access(String login,String haslo)
    {
        this.haslo=haslo;
        this.login=login;

        if(haslo.equals(hasloP)&&login.equals(loginP))
        {
            access = true;

        }
        return access;
    }
}
