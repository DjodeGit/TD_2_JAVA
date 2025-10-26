import java.lang.Math;
public class Calcul {
   public static float f(float x){
        return (x*x+(2*x)+1);
   } 
   public static float g(float x){
        if(x<4)
        return (float)(x*x+(2*x)+1);
        else if(x>=4 && x<=40)
        return (float)(x*x);
        else 
        return (float)(x+1);  
   }
   public static float h(Point p){
        return p.getX()*p.getX()+p.getY()*p.getY()+(2*p.getX()*p.getY())+1;
   }
   public static void equationPD(float a, float b) {
        if (a == 0 && b == 0) {
            System.out.println("Infinité de solutions.");
        } else if (a == 0 && b != 0) {
            System.out.println("Aucune solution.");
        } else {  // a != 0
            float x = -b / a;
            System.out.println("Solution unique : x = " + x);
        }
    }
   public static void equationSD(float a, float b, float c) {
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Infinité de solutions.");
        } else if (a == 0 && b == 0 && c != 0) {
            System.out.println("Aucune solution.");
        } else if (a == 0 && b != 0) {
            float x = -c / b;  // Traite comme équation linéaire bx + c = 0
            System.out.println("Solution unique : x = " + x);
        } else {
            // Cas général
            float delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Aucune solution réelle.");
            } else if (delta == 0) {
                float x = -b / (2 * a);
                System.out.println("Solution unique : x = " + x);
            } else {  // delta > 0
                float x1 = (-b + (float) Math.sqrt(delta)) / (2 * a);
                float x2 = (-b - (float) Math.sqrt(delta)) / (2 * a);
                System.out.println("Deux solutions : x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }
    public static int nbreAnnees(int somme){
       int i=0;
       int interet=0;
       do{
        interet=interet+(somme*2)/100;
        i=i+1;
       } while(interet<=100000);
       return i;
    }
    public static boolean premier(int n){
        /*if(x==1 && x==2)
        return true;
        for(int i=2;i<=(x+2)/2;i++){
            if(x%i==0)
            return false;
            if(x==2)
            return true;
            
        }
        return true;*/
        if (n <= 1) return false;  // Mais selon spec, 1 est premier ? Attends, spec dit "1 est considéré comme premier"
        // Correction : si n==1 return true;
        if (n == 1) return true;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
    public static boolean parfait(int n){
        /*int i;
        int somme=0;
        for(i=0;i * i<x;i++){
            if(x%i==0){
                somme = somme+i;
                if (i != x / i && x / i != x) {
                    somme += x / i;
                }
            }
        }
        if(somme==x)
        return true;
        else
        return false;*/
        if (n <= 1) return false;
        int somme = 1;  // 1 est toujours diviseur
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                somme += i;
                if (i != n / i && n / i != n) {
                    somme += n / i;
                }
            }
        }
        return somme == n;
    }

    
  

   public static void main(String[]args){
    
    
    float a=2f;
    float b=1f;
    float c=12f;
    Point p=new Point(12,13);
    float f=Calcul.f(a);
    float g=Calcul.g(a);
    float h=Calcul.h(p);
    int somme=1000000;
    int annee=Calcul.nbreAnnees(somme);
    int x=6;
    System.out.println("l image de x ="+a+" par rapport a la fonction f(x)=x²+2x+1 est :f("+a+")="+f);
    System.out.println("l image de x ="+a+" par rapport aux trois fonctions: g(x)=x²+2x+1 si x<4 ; g(x)=x² si 4<=x<=40 ; g(x)=x+1 si x>40) est g("+a+")="+g);
    System.out.println("l image du point p("+p.getX()+","+p.getY()+") par rapport a h(x,y)=x²+y²+2xy+1 est h("+p.getX()+","+p.getY()+")="+h);
    Calcul.equationPD(a,b);
    Calcul.equationSD(a,b,c);
    System.out.println("le nombre d annee pour qu il y a un pret ayant un capital de "+somme+" en banque est de: Annee(s)="+annee);
    System.out.println("le nombre "+x+" est premier ?: Reponse="+Calcul.premier(x));
    System.out.println("le nombre "+x+" est parfait ?: Reponse="+Calcul.parfait(x));
   }
}
