class SpaceRemover {
    public static void main (String[] args) {
        String mostFamous = "Rudolph the Red-nosed Reindeer";
        char [] mf1 = mostFamous.toCharArray();
        for (int dex = 0; dex < mf1.length; dex++) {
            char current = mf1 [dex];
            if (current != ' ') {
                System.out.print (current);
            } 
            else {
                System.out.print('.');
            }
        }
        System.out.println();
    }
}
  
