import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {

        ArrayList<String> names = new ArrayList<>();

        // Not needed to include the index here since they are being added in order as it is
        names.add(0,"Jacob");
        names.add(1,"Morty");
        names.add(2,"Rick");
        names.add(3,"Scott");
        names.add(4,"Bill");


        names.set(2,"Tom");
        names.remove(3);

        System.out.println(names);

        for(String s:names)
            System.out.print(s + " ");

        ArrayList<Integer> age = new ArrayList<>();

        age.add(19);
        age.add(22);
        age.add(14);
        age.add(78);


        // Wrapper class for int is integer
        // Wrapper class for char is character
        // Wrapper class for short is S

    }
}