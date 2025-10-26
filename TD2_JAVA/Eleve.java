public class Eleve {
    String  nom;
    float nMath;
    float nphy;
    float nfra;
    float nang;
    int matricule;
    private static int nbreCreation = 0;
    Eleve (String nom){
        this.nom=nom.toUpperCase();
        this.nMath=0;
        this.nphy=0;
        this.nfra=0;
        this.nang=0;
        this.matricule=nbreCreation++;
    }
    Eleve (String nom,float m,float p,float f,float a){
        this.nom = nom.toUpperCase();
        this.nMath=m;
        this.nphy=p;
        this.nfra=f;
        this.nang=a;
        this.matricule=nbreCreation++;
    }
    void setMath(float m){this.nMath=m;}
    void setphy(float p){this.nphy=p;}
    void setfra(float f){this.nfra=f;}
    void setang(float a){this.nang=a;}
    int getmatricule(){return this.matricule;}
    public String toString(){
        // Exemple Eleve[math 15, phy 18, fra 14, ang 16]
        return ("Eleve[math"+this.nMath+", phy"+this.nphy+", fra"+this.nfra+", ang"+this.nang+"]");
    }
    public float moyenne(){
        float m=(this.nMath+this.nphy+this.nfra+this.nang)/4;
        return m;
    }
    public boolean equals(Eleve e){
        if(e==null) return false;
        else if(this.matricule==e.matricule){
            return true;
        }
        else{
            return false;
        }
    }
    protected Object clone( ) throws CloneNotSupportedException{
        return super.clone();
    }
    String Mention(float a){
        String M="";
        if(a<10)
        M="Mediocre";
        if(a>=10 && a<12)
        M="Passable";
        if(a>=12 && a<14)
        M="Assez Bien";
        if(a>=14 && a<16)
        M="Bien";
        if(a>=16 && a<18)
        M="Très Bien";
        if(a>=18 && a<=20)
        M="Excellent";
        return M;

    }
    
    public static void main(String[] args) {
        Eleve e1 = new Eleve("Alice");
        e1.setMath(15.5f);
        e1.setphy(18.0f);
        e1.setfra(14.0f);
        e1.setang(16.0f);

        Eleve e2 = new Eleve("Bob", 12.0f, 13.0f, 11.0f, 14.0f);

        System.out.println(e1); // Eleve[math 15.5, phy 18.0, fra 14.0, ang 16.0]
        System.out.println("Moyenne e1 : " + e1.moyenne()); // 15.875
        System.out.println("Matricule e1 : " + e1.getmatricule()); // 0
        System.out.println("Matricule e2 : " + e2.getmatricule()); // 1
        System.out.println("e1 equals e2 ? " + e1.equals(e2)); // false
        System.out.println("la mention est: M = " + e1.Mention(e1.moyenne()));


        // Test clone
        try {
            Eleve cloneE1 = (Eleve) e1.clone();
            System.out.println("Clone e1 : " + cloneE1);
            System.out.println("Clone equals original ? " + cloneE1.equals(e1)); // true (même matricule)
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
