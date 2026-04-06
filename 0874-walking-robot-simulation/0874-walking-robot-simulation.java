import java.util.*;

class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {

        int max = 0;
        int a = 0;
        int b = 0;

        HashSet<String> set = new HashSet<>();

        for(int[] obs : obstacles){
            set.add(obs[0] + "," + obs[1]);
        }

        String dir = "";

        for(int i = 0; i < commands.length; i++){

            if(dir.equals("")){
                if(commands[i] == -1) dir = "X";
                else if(commands[i] == -2) dir = "NX";
                else dir = "Y";
            }

            else{
                if(dir.equals("X")){
                    if(commands[i] == -1) dir="NY";
                    else if(commands[i] == -2) dir="Y";
                }
                else if(dir.equals("NX")){
                    if(commands[i] == -1) dir="Y";
                    else if(commands[i] == -2) dir="NY";
                }
                else if(dir.equals("Y")){
                    if(commands[i] == -1) dir="X";
                    else if(commands[i] == -2) dir="NX";
                }
                else if(dir.equals("NY")){
                    if(commands[i] == -1) dir="NX";
                    else if(commands[i] == -2) dir="X";
                }
            }

            if(commands[i] != -1 && commands[i] != -2){

                int cnt = 1;

                if(dir.equals("NX") || dir.equals("NY")){
                    cnt = -1;
                }

                if(dir.equals("X") || dir.equals("NX")){

                    for(int l=0;l<commands[i];l++){

                        int nextX = a + cnt;
                        String pos = nextX + "," + b;

                        if(set.contains(pos)) break;

                        a = nextX;
                    }
                }

                else{

                    for(int j=0;j<commands[i];j++){

                        int nextY = b + cnt;
                        String pos = a + "," + nextY;

                        if(set.contains(pos)) break;

                        b = nextY;
                    }
                }
            }

            int ans = (a*a) + (b*b);
            max = Math.max(max, ans);
        }

        return max;
    }
}