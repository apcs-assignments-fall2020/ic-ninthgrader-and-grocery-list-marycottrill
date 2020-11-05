public class GroceryList {
    
    //Instance variables
    private String[] arr; 

    //methods 
    public GroceryList(){
        this.arr = new String[10];
    }
    
    //add method 
    public void add(String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = item;
                break;
            }
        }
    }

    //remove method 
    public void remove(String item) {
        for (int i = 0; i < arr.length; i++) {
            int totheleft = arr.length - (i+1);
            if (arr[i] == item) {
                for (int x = 1; x <= totheleft; x++)
                    arr[i + (x-1)] = arr[i + x];
                break;    
            }
        }
    }

    //toString method *ask about this. 
    public String toString(){
        String str = "Grocery List: ";
        for (int i = 0; i < arr.length; i++) {
            str = str + arr[i];
            if (i != arr.length){
                str = str + ", ";
            }
        }
        return str;
    }

    
}
