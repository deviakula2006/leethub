class Solution {
    public int maxBottlesDrunk(int Bot, int exc) {
        int emp=Bot;
        int cnt = emp;
        Bot =0;
        while(emp!=0 || Bot!=0){
            if(emp>=exc){
                emp=emp-exc;
                Bot++;
                exc++;
               

            }
            else if(Bot+emp >=exc){
                   Bot = Bot-(exc-emp);
                   cnt= cnt+exc-emp;
                   emp = 0;  
                   Bot++;    
            }
            else {
                cnt += Bot;
                emp=0;
                
                Bot=0;
            }
        }
        return cnt;
    }
}