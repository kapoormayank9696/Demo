// Main class which implement the garbage collection working code

public class Main {
    
    // finalize() Keyword Implementation In Java
    @SuppressWarnings("removal")
    static class DemoObject {
        // Default Access Modifier And Data Members
        int id;
        // Parameterized Constructor
        public DemoObject(int id) {
            this.id=id;
            System.out.println("Object "+id+" created");
        }
        @Override
        @SuppressWarnings("FinalizeDoesntCallSuperFinalize")
        public void finalize(){
            System.out.println("Object "+id+" is garbage collected");
        }
    }
    
    // Main function
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        DemoObject obj1=new DemoObject(1);
        DemoObject obj2=new DemoObject(2);
        DemoObject obj3=new DemoObject(3);
            
        obj1=null;
        obj2=null;
        obj3=null;
        System.out.println("Requesting Garbage Collection ");
        System.gc();
        System.out.println("End of main method....");
    }    
}
