public class IncrementosDecrementos {
    public static void main(String[] args){
        int a = 1;
        /**a = ++a;// 2
        
        a = --a;//1
        
        a = a--;//1 1ro (a=a 1) 2do (a-- 0) 3ro (a=1ro 1)
        
        a = a++;//2
        
        a = a+a--;//1
        
        a = a+a++;//3
        

        a = a--+a--;
        
        a = a--+a--+a--;
        
        a = a--+a--+a--+a--;
        
        a = a--+a--+a--+a--+a--;*/
        
        a = a--+a--+a--+a--+a--+a--;
        System.out.println(a);
    }
}
