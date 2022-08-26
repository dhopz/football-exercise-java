package football.exercise;

public class Playlists {
    private String name; 


    public Playlists(String name) {

      System.out.println("String is null, empty or blank.");
      this.name = checkIfNameIsEmpty(name);
      }

      public String checkIfNameIsEmpty(String name){
        if (name == null || name.isEmpty() || name.trim().isEmpty()){           
            return "New Playlist";} else {                
                return name;
          }
      }

      public String getName(){
        return this.name;
      }
    
}
