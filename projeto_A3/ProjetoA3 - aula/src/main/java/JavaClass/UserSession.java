package JavaClass;

public class UserSession {
    private static UserSession instance;
    private String email;
    private String user;
    private UserSession()
            
    {

    }

    public static UserSession getInstance()
    {
        if(instance == null)
        {
            instance = new UserSession();

        }
        return instance;

    }

    public void setCurrentUser(String email)
    {
        this.email = email;

    }

    public String email()
    {
        return email;
    }

    public void clear()
    {
        email = null;
        user = null;

    }
    
    public String User()
    {
        return user;
    }
    
    public void setUser(String user)
    {
        this.user = user;
    }
    
    
    
}
