
import java.lang.Math;
import javax.swing.*;
//import java.awt.*;
/*class Rectangle {
    int longueur;
    int largeur;
    int origin_x;
    int origin_y;

    // Constructeur
    Rectangle(int lon, int lar) {
        this.longueur = lon;
        this.largeur = lar;
        this.origin_x = 0;
        this.origin_y = 0;
    }

    void deplace(int x, int y) {
        this.origin_x = this.origin_x + x;
        this.origin_y = this.origin_y + y;
    }

    int surface() {
        return this.longueur * this.largeur;
    }
}
/*class Cercle{
    float rayon;
    Cercle(float r){
        this.rayon=r;
    }
    double surface(){
        return this.rayon*this.rayon*Math.PI;
    }
}
class GUI extends JPanel{
    private int largeur = 100;
    private int hauteur = 60;
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(40,40,largeur,hauteur);
        g.drawString("Rectangle",40,40);
    }
}
class Forme {
   class Rectangle{

    public static final Forme mon_rectangle = null;
    
   }
   class Cercle {
   
     public static final String Cercle = null;
   }
   

  

   
    
}*/


public class Point{
    private float x ;
    private float y ;
    public Point(float a, float b) {
        this.x=a ;
        this.y=b ;
    }
    public Point(float a) {
        this(a,a) ; 
    }
    public float getX() {return this.x ; }
    public float getY() {return this.y ; }
    public void setX(float a) {this.x=a ; }
    public void setY(float b) {this.y=b ; }
    public String toString(){
    return "(" + this.x + "," + this.y + ")" ;
    }
    public void presenteToi() {
    System.out.println(this) ;
    }

    public float distance(Point p){
        return (float)Math.sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y)) ;
    }
    public static float distance1(Point p1, Point p2){
        return (float)Math.sqrt(Math.pow(p2.x-p1.x,2)+(Math.pow(p2.y-p1.y,2)));
    }
    public Point milieu(Point p1, Point p2){
        Point p=new Point(p1.x+p2.x,p1.y+p2.y);
        return p;
    }
    boolean equals(Point p){
        if(this.x==p.x && this.y==p.y)
            return true;
        else
            return false;
    }
    public Object clone( ){
        Object o=new Point(this.x,this.y);
        return o;
    }



    public static void main(String[] args) {
        /*// Création d'un objet Rectangle
        Rectangle mon_rectangle = new Rectangle(17, 8);

        //Creation d un cercle
        Cercle bon_cercle=new Cercle(8);

        // Accès à une variable de l'objet
        int temp = mon_rectangle.longueur;

        /*Forme[] tableau = new Forme[4];
        tableau[0] = Forme.Rectangle.mon_rectangle;
        tableau[1] = Forme.Cercle.bon_cercle;
        tableau[2] = Forme.Rectangle.mon_rectangle;
        tableau[3] = new Carre(10);*/

        // Test des méthodes
        /*System.out.println("Longueur : " + temp);
        System.out.println("Surface : " + mon_rectangle.surface());
        System.out.println("rayon : " + bon_cercle.rayon);
        System.out.println("Surface_cercle : " + bon_cercle.surface());
        System.out.println("90° =" + Math.toRadians(90) +"(rad)");
        System.out.println("90° =" + Math.toDegrees(90)+"(deg)");
        System.out.println("pi =" + Math.PI);
        // Déplacement
        mon_rectangle.deplace(5, 10);
        System.out.println("Nouvelle position (x, y) : (" + mon_rectangle.origin_x + ", " + mon_rectangle.origin_y + ")");*/

        //float f=14 ;
        Point p7= new Point(14, 12) ;
        Point p1= new Point(18, 12) ;
        Point p2 ;
        p2=p1 ;
        p2.setX(17) ;
        p1.setY(22) ;
        System.out.println(p1) ;
        System.out.println(p2) ;
        p1.x=25 ;
        System.out.println(p1.y) ;
        float d = distance1(p2,p7);
        System.out.println ("la distance entre deux points est d="+d);
        //Point p3=new Point(120);
        JFrame frame = new JFrame("Rectangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);
        
        frame.setVisible(true);
    }
}




