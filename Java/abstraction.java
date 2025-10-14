public class abstraction {
    public static void main(String[] args) {
        class fan{
            void switchON(){}
            void switchOff(){}
        }
        class switches extends fan{
            void switchON(){
                System.out.println("Fan is ON State");
            }
            void switchOff(){
                System.out.println("Fan is Off State");
            }
        }

        switches sw = new switches();
        sw.switchON();
        sw.switchOff();
    }
}
