package animals;

import static java.lang.Boolean.TRUE;

public class cat {

    private String name;
    private int age;
    private String claws;
    private boolean wash;
    private int sleepyLevel;

    public cat(String name,int age,String claws,int sleepyLevel){
        this.name=name;
        this.age=age;
        this.claws=claws;
        this.sleepyLevel=sleepyLevel;
    }

    public String catchAMouse(){

        String jerry="";
        if(claws.equalsIgnoreCase("activated"))
            jerry="Running after Jerry...";
        else if (claws.equalsIgnoreCase("hidden"))
           jerry="Jerry can wait!";
        else jerry="Human, go walk a dog!";
        return jerry;
    }

    public String napOnHuman()
    {
        String nap="";
        if(sleepyLevel>=1)
            nap="I am going to sleep on your face and you CANNOT STOP ME!!\n";
        else nap="I will wait for the human to sit.\n";
        return nap;

    }

    public String washMyPrettyFur(){
        String furr="";
        if(wash==TRUE)
            furr="MY FURR IS SO SHINY I COULD TAKE A SELFIE\n";
        else furr="I WILL WASH MY FURR RIGHT HERE.\n";
        return furr;
    }

}
