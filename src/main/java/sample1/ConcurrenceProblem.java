package sample1;

public class ConcurrenceProblem {


    static class Counter {

        private static int counter = 0;
        public static void increase(){
            counter++;
            System.out.println("Incresed counter: "+counter);
        }
    }

    public static void main(String[] args){

        for (int i = 0; i<4; i++){
            new Thread(new Runnable() {
                public void run() {
                    for (int i = 0; i < 4; i++){
                        Counter.increase();
                    }
                }
            }).start();
        }
    }
}
