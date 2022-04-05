import java.util.*;
class photoshootusopen {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = Integer.parseInt(s.nextLine());
        String input2 = s.nextLine();
        String[] input = input2.split("");
        String[] new1 = new String[num];
        StringBuilder a = new StringBuilder();
        int curr = 0;
        int best = 0;
        int best2 = 0;
        int ans = 0;
        while(true){
            for(int i = 0;i<num;i= i+2){
                String[] save = new String [i/2];
                for(int j = 0;j<i;j++){

                    if(j<save.length){

                        save[j] = input[j];

                    }else{
                        String save2 = input[j];


                        input[j] = save[i-j-1];
                        save[i-j-1] = save2;
                    }
                }
                for(int k = 1;k<input.length;k= k+2){

                    if(input[k].equals("G")){
                        curr++;
                    }
                }
                if(curr>best){


                    best = curr;
                    new1 = input;
                }
                curr = 0;
                input = input2.split("");
            }
            if(best>best2){
                best2 = best;
                for(int z = 0;z<num;z++){
                    a.append(new1[z]);
                }
                input2 = a.toString();
                a.delete(0,a.length());
                best = 0;
            }else{
                break;
            }
            ans++;
        }
        System.out.println(ans);
    }
}