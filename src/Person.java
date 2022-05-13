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
        this.idCard = idCard;
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
