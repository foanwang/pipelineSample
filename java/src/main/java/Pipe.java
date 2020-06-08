import Interface.Step;


public class Pipe implements Step<Integer, String> {

    public Integer pipe(Integer value, String... args) throws ClassNotFoundException {
        int result =  increment(value);
        for(String methodName:args) {
            Reflection re = new Reflection();
            result+=(Integer)re.reflectionFunction(this.getClass().getName(), methodName);
        }
        return (Integer)result;
    }

    public Integer increment(Integer value){
        return value+1;
    }

    public Integer increment(){
        return 1;
    }
}
