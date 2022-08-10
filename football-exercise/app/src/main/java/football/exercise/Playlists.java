package football.exercise;

public class Playlists {
    private String name; 


    public Playlists(String name) {
        this.name = checkIfNameIsEmpty(name);
      }

      public String checkIfNameIsEmpty(String name){
        if (name == null || name.isEmpty() || name.trim().isEmpty()){
            System.out.println("String is null, empty or blank.");
            return "New Playlist";} else {
                System.out.println(name);
                return name;
          }
      }
    
}
