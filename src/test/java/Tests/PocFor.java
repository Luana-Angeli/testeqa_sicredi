package Tests;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PocFor {

    List<String> mesesList = new ArrayList<String>(Arrays.asList("diego", "luana", "automacao", "teste"));

    @Test
    public void testFor(){
        for(int count=0; count < mesesList.size(); count++) {
            if(mesesList.get(count).equals("automacao")){
                System.out.println("encontrei o cara!");
                break;
            }
        }
    }

    @Test
    public void testForEach(){
        for(String mes : mesesList){
            if(mes.equals("luana")){
                System.out.println("encontrei ela!");
                break;
            }
        }
    }

    @Test
    public void testArray(){
        String[] valores;
    }
}
