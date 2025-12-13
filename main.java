class student{
    String name;
    String location;
    String hobbies;
    public void display(){
        System.out.println("name of the student: "+name+" and location: "+location+" and hobbies:"+hobbies);}}
        public class main{
    public static void main(String[] args) {
        
    
        student s1= new student();
        s1.name= "Nashra";
        s1.location= "Hanamakonda";
        s1.hobbies="reading books";
        s1.display();

        student s2= new student();
        s2.name= "Thousif";
        s2.location= "Warangal";
        s2.hobbies="playing";
        s2.display();
    }
    }