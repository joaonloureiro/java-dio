package one.digitalinnovation.gof.factory;

public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hd, String cpu){
        if("PC".equalsIgnoreCase(type))
            return new PC(ram, hd, cpu);
        else if("Server".equalsIgnoreCase(type))
            return new Server(ram, hd, cpu);

        return null;
    }
}
