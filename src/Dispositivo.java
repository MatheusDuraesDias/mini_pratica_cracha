import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;

public class Dispositivo {

    ArrayList<Integer> memoria = new ArrayList<>();
    public void evento(int codigo){
        int counter = 0;
        for(int i = 0; i<memoria.size(); i ++){
            if (memoria.get(i) == codigo){
                System.out.println("Obrigado pela visita " + LocalDate.now());
                memoria.remove(i);
                i = memoria.size();
                counter -=1;
            }
            else{
                counter++;
            }
        }
        if (counter == memoria.size()){
            System.out.println("Bem-vindo, acesso liberado " + LocalDate.now());
            memoria.add(codigo);
        }
    }


}
