interface AddMyInterface {
    int addNo(int a , int b);
}
class lambdaAdd{
    public static void main(String[] args) {
        AddMyInterface reff = (a,b)->{
            return (a + b); 
            };
            System.out.println(reff.addNo(4,2));
    
    }
}
