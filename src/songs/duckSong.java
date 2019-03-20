package songs;
import java.util.Scanner;

public class duckSong {


        public static void main(String[] args) {

            duckSong duck=new duckSong();
            duck.duckSing();
        }


        private void duckSing(){
            Scanner myScanner=new Scanner(System.in);
            System.out.println("How many ducks went out?");
            int dk=myScanner.nextInt();

           // String word="ducks";

            for(int i =dk;i>0;i--){
                int j=i-1;
                if(i>1)
                {
                    if(j==1)
                        System.out.println(i+ " Little ducks went out one day \n Went out one day\n" +
                        "Over the hill and far away\n" +
                        "Mother duck said\n" +
                        "\"Quack, quack, quack, quack.\"\n" +
                        "But only"+j +" little duck came back");
                    else
                        System.out.println(i+ " Little ducks went out one day \n Went out one day\n" +
                                "Over the hill and far away\n" +
                                "Mother duck said\n" +
                                "\"Quack, quack, quack, quack.\"\n" +
                                "But only"+j +" little ducks came back");
                }
                if(i==1)
                    System.out.println(i+ " Little duck went out one day \n Went out one day\n" +
                            "Over the hill and far away\n" +
                            "Mother duck said\n" +
                            "\"Quack, quack, quack, quack.\"\n" +
                            "And all the "+dk+" little ducks came back");

            }

        }

}
