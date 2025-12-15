class Solution:
    def interpret(self, command: str) -> str:
        li=list(command)
        k=[]
        for i in range(len(li)):
            if li[i]=='('and li[i+1]==')':
                k.append('o')
            elif li[i] not in "()":
                k.append(li[i])    
        return "".join(k)        


        
       
     
        