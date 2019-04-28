public class WORLD { //pętla minus do Huba
    public static void main(String[] args) {
        int i;
        int counter;
        counter =0;
        for(i=9; i > 0; i--){
            counter++;
            System.out.println("WORLD nr " +i);
            if(counter==3){
                System.out.println();
                counter=0;
            }
        }

    }
}
