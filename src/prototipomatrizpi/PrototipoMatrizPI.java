
package prototipomatrizpi;
import java.util.Scanner;


public class PrototipoMatrizPI {

    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int contx, conto, empate;
        int v;
        int [][]m = new int[2][5];
        int [][]b = new int[2][5];
        int [][]transposta = new int[5][2];
        int [][]d = new int[2][5];
        int [][]e = new int[2][5];
        int [][]f = new int[2][2];
        int i;
        int k=0;
        int j;
        int aux1;
        contx=0;
        conto=0;
        
          //extrair a matriz     
        for(j = 0; j < 5; j++){   
        System.out.print("quem venceu? ");
        v = leia.nextInt();
        
        if(v == 1){
            contx +=5;    
        }  
        if(v == 2){
            conto +=5;
        }
        if(v == 3){
            contx +=2;
            conto +=2;
        }
        m[0][j] = contx;
        m[1][j] = conto;
        
        }
        
        for(j = 0; j < 5; j++){
            System.out.printf(" "+m[0][j] + " "); 
        }
        System.out.printf("\n");
        for(j = 0; j < 5; j++){
            System.out.printf(" "+m[1][j] +" ");
        }
        System.out.printf("\n");
        
        
        //INVERSA (B)
        System.out.printf("MATRIZ B (INVERSA): \n");
        
        for(j=0; j<5; j++){
            for(i = 0; i < 2; i++){
                b[i][j] = m[i][j];
                
            }
         }
            for(j=0;j<5/2;j++){
                for(i=0;i<2;i++){
                    aux1 = b[i][j];
                    b[i][j] = b[i][4-j];
                    b[i][4-j] = aux1;
                }
            }
        
            
        
        for(j = 0; j < 5; j++){
            System.out.printf(" "+b[0][j] + " "); 
        }
        System.out.printf("\n");
        for(j = 0; j < 5; j++){
            System.out.printf(" "+b[1][j] +" ");
        }
        System.out.printf("\n");
        
        
        //TRANSPOSTA
        System.out.printf("MATRIZ C (TRANSPOSTA): \n");
        for(j = 0; j < 5; j++){
            for(i = 0; i < 2; i++){
                transposta[j][i] = m[i][j];
                
            }
        }
        for(j = 0; j < 2; j++){
            System.out.printf(" "+transposta[0][j] + " "); 
        }
        System.out.printf("\n");
        for(j = 0; j < 2; j++){
            System.out.printf(" "+transposta[1][j] +" ");
        }
        System.out.printf("\n");
        for(j = 0; j < 2; j++){
            System.out.printf(" "+transposta[2][j] +" ");
        }
        System.out.printf("\n");
        for(j = 0; j < 2; j++){
            System.out.printf(" "+transposta[3][j] +" ");
        }
        System.out.printf("\n");
        for(j = 0; j < 2; j++){
            System.out.printf(" "+transposta[4][j] +" ");
        }
        System.out.printf("\n");
        
        //MATRIZ D (A+B)
         System.out.printf("MATRIZ D (A+B): \n");
        for(i = 0; i < 2; i++){
            for(j = 0; j < 5; j++){
                d[i][j] = m[i][j] + b[i][j];
                
            }
        }
        for(j = 0; j < 5; j++){
            System.out.printf(" "+d[0][j] + " "); 
        }
        System.out.printf("\n");
        for(j = 0; j < 5; j++){
            System.out.printf(" "+d[1][j] +" ");
        }
        System.out.printf("\n");
        
        //MATRIZ E (A-B)
         System.out.printf("MATRIZ E (A-B): \n");
        for(i = 0; i < 2; i++){
            for(j = 0; j < 5; j++){
                e[i][j] = m[i][j] - b[i][j];
                
            }
        }
        for(j = 0; j < 5; j++){
            System.out.printf(" "+e[0][j] + " "); 
        }
        System.out.printf("\n");
        for(j = 0; j < 5; j++){
            System.out.printf(" "+e[1][j] +" ");
        }
        System.out.printf("\n");
        
        //MATRIZ F (A*C)
         System.out.printf("MATRIZ F (A*C): \n");
         
         f[0][0] = (m[0][0] * transposta[0][0]) + (m[0][1] * transposta[1][0])+ (m[0][2] * transposta[2][0]) + (m[0][3] * transposta[3][0]) + (m[0][4] * transposta[4][0]);
         f[0][1] = (m[0][0] * transposta[0][1]) + (m[0][1] * transposta[1][1])+ (m[0][2] * transposta[2][1]) + (m[0][3] * transposta[3][1]) + (m[0][4] * transposta[4][1]);
         f[1][0] = (m[1][0] * transposta[0][0]) + (m[1][1] * transposta[1][0])+ (m[1][2] * transposta[2][0]) + (m[1][3] * transposta[3][0]) + (m[1][4] * transposta[4][0]);
         f[1][1] = (m[1][0] * transposta[0][1]) + (m[1][1] * transposta[1][1])+ (m[1][2] * transposta[2][1]) + (m[1][3] * transposta[3][1]) + (m[1][4] * transposta[4][1]);
         for(j = 0; j < 2; j++){
            System.out.printf(" "+f[0][j] + " "); 
        }
        System.out.printf("\n");
        for(j = 0; j < 2; j++){
            System.out.printf(" "+f[1][j] +" ");
        }
        System.out.printf("\n");
        
        
        
        
        
        }
        
         
    }
    

