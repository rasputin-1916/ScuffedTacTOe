public class Player {

    private String name;
    private String mark;

    public Player(String name, String mark){

        name = this.name;
        mark = this.mark;
    }


    public String getName(String name){
        return name;
    }

    public String getMark(String mark){
        return mark;
    }

    public String setName(String n){
        this.name = n;
        return n;
    }

    public String setMark(String m){
        if (m.length() > 1){
            return "Invalid Input";
        } else {
            this.mark = m;
            return m;
        }
    }

    // the do while loop for getting input will go around this method and will look something like this:
    // 
    //  correctInput = false;
    //  do{
    //      get input;
    //      String x == Player.setMark(input);
    //      if (x.equals("Invalid Input")){
    //          correctInput == false;
    //      } else {
    //          correctInput == true;
    //      }
    //  } while(correct input == false)
}