
package aula07;

public class Aula07 {

    public static void main(String[] args) {
        Lutador l [] = new Lutador [6];
        l[0] = new Lutador("Pretty boy", 
                           "França", 
                            31, 
                            11, 2, 1, 
                            1.75f, 
                            68.9f);
        l[1] = new Lutador("Putscript", 
                           "Brasil", 
                            29, 
                            14, 
                            2, 
                            3, 
                            1.68f, 
                            57.8f);
        l[2] = new Lutador("Snapshodow", 
                           "Brasilandia", 
                            29, 
                            16, 
                            24, 
                            3, 
                            1.68f, 
                            80.9f);
        l[3] = new Lutador("DeadCode", 
                           "Equador", 
                            29, 
                            14, 
                            2, 
                            3, 
                            1.98f, 
                            81.6f);
        l[4] = new Lutador("UFD", 
                           "Inglaterra", 
                            20, 
                            4, 
                            5, 
                            3, 
                            1.58f, 
                            119.8f);
        l[5] = new Lutador("Nerdaart", 
                           "EUA", 
                            9, 
                            1, 
                            2, 
                            3, 
                            1.78f, 
                            105.8f);
        
        Luta luta1 = new Luta();
        luta1.marcarLuta(l[0], l[1]);
        luta1.lutar();
    }
    
}
