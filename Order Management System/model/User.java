package model;
class User{
    private String userId;
    private String name;
    private String email;
    
    User(String userId, String name, String email){
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public String getUserId(){
        return userId;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }

    @Override
    public String toString() {
        return String.format(
            "User{userId='%s', name='%s', email='%s'}",
            userId, name, email
        );
    }

}