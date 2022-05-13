import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    protected String email;
    protected String idCard;

    public Person()
    {
        idCard="";
        email="";
    }

    public Person(String email,String idCard)
    {
        this.email=email;
        this.idCard=idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        Pattern p = Pattern.compile("^[0-9]{8}[A-Z]{1}$",
                Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(idCard);
        boolean matchFound = m.find();
        if(matchFound){
            this.idCard = idCard;
        }
        else{
            this.idCard = "";
        }
    }

    @Override
    public boolean equals(Object p)
    {
        return (this.idCard.equals(((Person)p).idCard));
    }

    @Override
    public String toString()
    {
        return email + " " + idCard;
    }
}
