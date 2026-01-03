package Arrays;

public class array_2_checkvalue {

    public static void main(String[] args) {

        String names[] = {"Hina", "Chaya", "Maya", "Jaya"};
        int count = 0;

        for (int i = 0; i < names.length; i++)  
        {
            if (names[i].equals("Maya"))  
            {
                count++;
            }
        }

        if (count == 0) 
        {
            System.out.println("Array doesn't contain the value Maya");
        } 
        else 
        {
            System.out.println("Array contains the value Maya");
        }
    }
}
