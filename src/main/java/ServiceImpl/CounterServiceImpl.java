package ServiceImpl;

import service.ContadorService;

public class CounterServiceImpl implements ContadorService {
    int segundos = 0;
    @Override
    public void counter(int time) {
        for(this.segundos = 0; segundos<60; segundos++){
            segundoPasado();
            if (segundos<10){
            System.out.print("00:0"+segundos+"  ");}
            if (segundos>=10){
                System.out.print("00:"+segundos+"  ");}
            if (segundos==59){
                kill();
            }
        }
    }

    public void segundoPasado(){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){}
    }

    public void kill(){
        System.exit(0);
    }

}
