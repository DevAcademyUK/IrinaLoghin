package animals;



public class dog{
    private String name;
    private String size;
    private int age;
    private String breed;

    public dog(String name, String size, int age, String breed){
        this.name=name;
        this.size=size;
        this.age=age;
        this.breed=breed;
    }

    protected String bark(String size) {
        String bark = "";
        if (size.equalsIgnoreCase("small")) {
            bark = "yap yap yap";
        } else if (size.equalsIgnoreCase("medium")) {
            bark = "woof woof";
        } else bark = "WOOF! WOOF!";

        return bark;
    }
    protected String play(String breed){
        String playing="";
        if(breed.equalsIgnoreCase("poodle")){
            playing="Oh Dear, I don't so, one could not possibly engage in such activity";
        }
        else if(breed.equalsIgnoreCase("Labrador")){
            playing="Yeah Yeah Throw the stick!";
        }
        else if(breed.equalsIgnoreCase("Border Collie")){
            playing="Lets gor chase us some sheep";
        }
        return playing;
    }

    protected String beHuman(String name, int age, String breed) {
    return "Hello Human, I'm " + name + " and I am a "+ age + " year old " + breed + "What breed are you?";
    }
}
